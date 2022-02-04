import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    Juego gta = new Juego("GTA", "hacer cosas ilegales", 1 , 20, 120000 );
    Juego fifa18 = new Juego("FIFA!" ,  "simulador de Fútbol" , 4, 28, 89000 );
    Juego trivialPursuit = new Juego ("Trivial Pursuit Live", "juego de preguntas", 8, 6 , 29000);
    ArrayList <Juego> losQueTengo = new ArrayList<Juego>();
    losQueTengo.add(gta);
    losQueTengo.add(fifa18);
    losQueTengo.add(trivialPursuit); 
    Categoria losQuePoseo = new Categoria("los que tengo" , "12", "son los juegos que tengo", false ,losQueTengo);

    losQuePoseo.imprimirJuegos();
    losQuePoseo.imprimirCategoria();
    System.out.println("cantidad de juegos" + losQuePoseo.getCantidadJuegos());


  }
}