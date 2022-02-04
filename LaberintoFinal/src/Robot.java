import java.awt.Point;
import java.awt.geom.Line2D;

public class Robot {
  private Point ubicacion;
  private double direccion;

  public Point getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(Point ubicacion) {
    this.ubicacion = ubicacion;
  }

  public double getDireccion() {
    return direccion;
  }

  public void setDireccion(double direccion) {
    this.direccion = direccion;
  }

  public void mover(double distancia) {
    double a = Math.cos(direccion) * distancia;
    double b = Math.sin(direccion) * distancia;
    if (verificarMovimiento(ubicacion.x + (int) (a), ubicacion.y + (int) (b))) {
      ubicacion.move(ubicacion.x + (int) (a), ubicacion.y + (int) (b));
    } else {
      System.out.println("NO SE PUEDE MOVER POR PARED");
    }

  }

  Laberinto laberinto1 = new Laberinto();

  public boolean verificarMovimiento(int x, int y) {
    Point PosibleMovimiento = new Point(x, y);
    // System.out.println("posile movimiento: " + PosibleMovimiento);
    return laberinto1.pasoRestringido(ubicacion, PosibleMovimiento);
  }

  public boolean elRobotEstaEnElLaberinto() {
    Line2D.Double trayecto = new Line2D.Double(7, 5, ubicacion.getX(), ubicacion.getY());
    Line2D.Double finall = new Line2D.Double(8, 6, 8, 4);

    return !finall.intersectsLine(trayecto);

  }

  public void girar(String intencion) {
    String sentido = intencion;
    if (sentido.equalsIgnoreCase("arriba")) {
      direccion = (Math.PI / 2);
    } else if (sentido.equalsIgnoreCase("derecha")) {
      direccion = (2 * Math.PI);
    } else if (sentido.equalsIgnoreCase("izquierda")) {
      direccion = (Math.PI);
    } else if (sentido.equalsIgnoreCase("abajo")) {
      direccion = ((3 * Math.PI) / 2);
    }
  }
}
