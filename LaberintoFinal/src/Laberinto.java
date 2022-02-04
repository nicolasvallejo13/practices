import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.ArrayList;
public class Laberinto 
{
  ArrayList<Pared> al = new ArrayList<Pared>();
  public Laberinto(){
   Point pip1 = new Point(-1,2);
  Point pfp1 = new Point(6,2);
  Pared pared1 = new Pared(pip1,pfp1);
  Point pip2 = new Point(-1,2);
  Point pfp2 = new Point(-1,-1);
  Pared pared2 = new Pared(pip2,pfp2);
  Point pip3 = new Point(-1,-1);
  Point pfp3 = new Point(6,-1);
  Pared pared3 = new Pared(pip3,pfp3);
  Point pip4 = new Point(6,-1);
  Point pfp4 = new Point(6,0);
  Pared pared4 = new Pared(pip4,pfp4);
  Point pip5 = new Point(6,0);
  Point pfp5 = new Point(8,0);
  Pared pared5 = new Pared(pip4,pfp4);
  Point pip6 = new Point(8,0);
  Point pfp6 = new Point(8,4);
  Pared pared6 = new Pared(pip6,pfp6);
  Point pip7 = new Point(8,4);
  Point pfp7 = new Point(2,4);
  Pared pared7 = new Pared(pip7,pfp7);
  Point pip8 = new Point(0,2);
  Point pfp8 = new Point(0,10);
  Pared pared8 = new Pared(pip8,pfp8);
  Point pip9 = new Point(4,4);
  Point pfp9 = new Point(4,6);
  Pared pared9 = new Pared(pip9,pfp9);
  Point pip10 = new Point(0,6);
  Point pfp10 = new Point(2,6);
  Pared pared10 = new Pared(pip10,pfp10);
  Point pip = new Point(3,8);
  Point pfp = new Point(3,10);
  Pared pared11 = new Pared(pip,pfp);
  Point pip12 = new Point(0,10);
  Point pfp12 = new Point(8,10);
  Pared pared12 = new Pared(pip12,pfp12);
  Point pip13 = new Point(4,6);
  Point pfp13 = new Point(5,6);
  Pared pared13 = new Pared(pip13,pfp13);
  Point pip14 = new Point(7,6);
  Point pfp14 = new Point(8,6);
  Pared pared14 = new Pared(pip14,pfp14);
  Point pip15 = new Point(5,6);
  Point pfp15 = new Point(5,8);
  Pared pared15 = new Pared(pip15,pfp15);
  Point pip16 = new Point(5,8);
  Point pfp16 = new Point(6,8);
  Pared pared16 = new Pared(pip16,pfp16);
  Point pip17 = new Point(8,10);
  Point pfp17 = new Point(8,6);
  Pared pared17 = new Pared(pip17,pfp17);
  al.add(pared1);
  al.add(pared2);
  al.add(pared3);
  al.add(pared4);
  al.add(pared5);
  al.add(pared6);
  al.add(pared7);
  al.add(pared8);
  al.add(pared9);
  al.add(pared10);
  al.add(pared11);
  al.add(pared12);
  al.add(pared13);
  al.add(pared14);
  al.add(pared15);
  al.add(pared16);
  al.add(pared17);
  }
  public boolean pasoRestringido(Point p1, Point p2)
  {
    boolean puedeAvanzar = true;
    Line2D.Double trayecto = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    
    for ( int i =0; i != al.size(); i++)
    {
      Line2D.Double pared = new Line2D.Double(al.get(i).getpiX(), al.get(i).getpiY(),al.get(i).getpfX(), al.get(i).getpfY());
      if(pared.intersectsLine(trayecto))
      {
        puedeAvanzar = false;
      }
      }
    return puedeAvanzar;
  }
}

