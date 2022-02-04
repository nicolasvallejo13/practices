package prueba2;

public class main {

	public static void main(String[] args) {
		
		
		String ejemplo = "aaaabbbbbbfffhhhbcccccc";
		String respuesta = "";
		int contador = 0;
		char letra1 = ejemplo.charAt(0);
		for ( int i =0 ; i< ejemplo.length() ; i ++)
		{
			if ( letra1 != ejemplo.charAt(i) )
			{
				 letra1 = ejemplo.charAt(i);
			}
			
			
			if ( ejemplo.charAt(i) == letra1 )
			{
				contador ++;
				//System.out.print("entró");
				if (  i+1 < ejemplo.length() &&  ejemplo.charAt(i+1) != letra1 )
				{ 	
					
					respuesta += Integer.toString(contador) + letra1  ;
					contador =0;
				}
				
				
			
		
		
		//System.out.print(contador );
		
		

	}

}
		
		respuesta += Integer.toString(contador) + letra1  ;
		System.out.print(respuesta);
	}}
