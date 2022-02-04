import java.awt.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    Robot r = new Robot();
		r.setUbicacion(new Point(0, 0));
    r.setDireccion(2*Math.PI);
    boolean estaEnJuego = true;
		System.out.println("BIENVENIDO, Sería bueno que vieras el mapa en el siguiente enlace https://www.geogebra.org/classic/b8hnyb7y , intenta salir del laberinto siguiendo las instrucciones, el Robot empieza en la posición [x=0,y=0]  ");
    String sentido = "derecha ";
    double magnitud = 0;
    while (estaEnJuego)
    {
      System.out.println("el robot tiene la mira hacia  dirección " + sentido + ", ¿desea Cambiar el sentido del Robot? responda S (en Mayúscula) para SÍ y N (en Mayúscula) para No " );
      char respuesta = sc.next().charAt(0);
      if (respuesta == 'S')
      {
        System.out.println("¿a qué dirección quiere que el robot mire? (izquieda  para que mire a la izquierda, derecha para que mire a la derecha, abajo para que mire hacia abajo y arriba para que mire hacia arriba)");
        sentido = sc.next();
        r.girar(sentido);
        System.out.println("¿Cuántos pasos quiere que dé el Robot?");
        magnitud = sc.nextDouble();
        r.mover(magnitud);
        System.out.println( "el robor se encuentra en la ubicación: "  + r.getUbicacion());
      }
      else if (respuesta == 'N' )
      {
        
       System.out.println("¿cuantos pasos quiere que dé el Robot?");
        magnitud = sc.nextDouble();
        r.mover(magnitud);
        System.out.println( "el robor se encuentra en la ubicación: "  + r.getUbicacion());
      }
      else
      {
        System.out.println("por favor ingrese una opción Válida, ¿desea Cambiar el sentido del Robot? responda S (en Mayúscula) para SÍ y N para No (en Mayúscula) ");
      }
      estaEnJuego = r.elRobotEstaEnElLaberinto(); 
    }
    System.out.println("FELICITACIONES,HAS SALIDO DEL LABERINTO");
	}

}
