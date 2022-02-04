import java.awt.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    Robot r = new Robot();
		r.setUbicacion(new Point(0, 0));
    r.setDireccion(2*Math.PI);
    boolean estaEnJuego = true;
		System.out.println("BIENVENIDO, Ser�a bueno que vieras el mapa en el siguiente enlace https://www.geogebra.org/classic/b8hnyb7y , intenta salir del laberinto siguiendo las instrucciones, el Robot empieza en la posici�n [x=0,y=0]  ");
    String sentido = "derecha ";
    double magnitud = 0;
    while (estaEnJuego)
    {
      System.out.println("el robot tiene la mira hacia  direcci�n " + sentido + ", �desea Cambiar el sentido del Robot? responda S (en May�scula) para S� y N (en May�scula) para No " );
      char respuesta = sc.next().charAt(0);
      if (respuesta == 'S')
      {
        System.out.println("�a qu� direcci�n quiere que el robot mire? (izquieda  para que mire a la izquierda, derecha para que mire a la derecha, abajo para que mire hacia abajo y arriba para que mire hacia arriba)");
        sentido = sc.next();
        r.girar(sentido);
        System.out.println("�Cu�ntos pasos quiere que d� el Robot?");
        magnitud = sc.nextDouble();
        r.mover(magnitud);
        System.out.println( "el robor se encuentra en la ubicaci�n: "  + r.getUbicacion());
      }
      else if (respuesta == 'N' )
      {
        
       System.out.println("�cuantos pasos quiere que d� el Robot?");
        magnitud = sc.nextDouble();
        r.mover(magnitud);
        System.out.println( "el robor se encuentra en la ubicaci�n: "  + r.getUbicacion());
      }
      else
      {
        System.out.println("por favor ingrese una opci�n V�lida, �desea Cambiar el sentido del Robot? responda S (en May�scula) para S� y N para No (en May�scula) ");
      }
      estaEnJuego = r.elRobotEstaEnElLaberinto(); 
    }
    System.out.println("FELICITACIONES,HAS SALIDO DEL LABERINTO");
	}

}
