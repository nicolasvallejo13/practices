import java.util.ArrayList;

public class MatrizDeAdyacencia {

	private int[][] matriz;

	public MatrizDeAdyacencia() {
		
		matriz = new int[10000][10000];
	
		
		
		
	}

	
	public void añadirVotos ( int idVotado, Voto voto)
	{
		matriz[idVotado][voto.getIdVotante()] = voto.getVoto();
		
	}
	
	public void imprimirNodo(int index)
	{
		for ( int i =0; i < matriz[index].length ; i++)
		{
			
			System.out.println(matriz[index][i]);
		}
	}
	public int imprimirPuntajeAFavorNodo(int index)
	{
		int resultado=0;
		for ( int i =0; i < matriz[index].length ; i++)
		{
			
			resultado = resultado + matriz[index][i];
		}
		return resultado;
	}
	public int imprimirVotosEnOposicion (int index )
	{
		int canditadDeOpositores=0;
		for ( int i =0; i < matriz[index].length ; i++)
		{
			if(matriz[index][i] == -1 )
			{
				canditadDeOpositores ++;
			}
			
		}
		return canditadDeOpositores;
	}
	
	

}
