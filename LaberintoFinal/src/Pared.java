import java.awt.Point;
public class Pared 
{
 Point pi,pf;
 public Pared (Point pi, Point pf)
 {
   this.pi = pi;
   this.pf = pf;
 }
  public double getpiX()
 {
   return pi.getX();
 }
 public double getpiY()
 {
   return pi.getY();
 }
 public double getpfX()
 {
   return pf.getX();
 }
 public double getpfY()
 {
   return pf.getY();
 }
}
