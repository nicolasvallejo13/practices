import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
     ArrayList<Integer> al = new ArrayList<Integer>();
     al.add(0);
     al.add(1);
     al.add(2);
     al.add(3);
     al.add(4);
     al.add(5);
     al.add(6);
     al.add(7);
     al.add(8);
     al.add(9);
     int[] digitos = new int[3];
     int fijas=0;
     int picas =0;
     boolean sigueJugando = true;
     int intentos=0;

     for (int i =0 ; i<3;i++)
     {
       int b = al.size() ;
       int a = (int) Math.floor(Math.random() * (b));
        //System.out.println(al.get(a));
       digitos[i] = al.get(a);
       al.remove(a);
       }
       //System.out.println(digitos[0]+" "+digitos[1]+" "+digitos[2]);
   while (sigueJugando)
   {
     picas=0;
     fijas=0;

   
   System.out.println("ingrese un número de tres dígitos");
   //System.out.println("cantidad de fijas "+fijas +" cantidad de picas "+picas);
   String  ingresoString = sc.next();

   if (ingresoString.length() <3 || ingresoString.length() >3 )
   {
     System.out.println("ingrese un número de tres dígitos válido");

   }
   else 
   {
     int ingreso = Integer.parseInt(ingresoString);
     int digito1 = ingreso / 100;
     int digito2 = (ingreso - (digito1 *100)) /10;
     int digito3 = ((digito1*100)+(digito2*10) - ingreso)*-1;
     int[] aComparar = new int[3];
     aComparar[0] = digito1;
     aComparar[1] = digito2;
     aComparar[2] = digito3;
     //System.out.println(digito1);
     //System.out.println(digito2);
     //System.out.println(digito3);
     if ( digito1 == digito2 || digito1 == digito3 || digito2 == digito3 )
     {
       System.out.println("ingrese un número de tres dígitos que no repita ninguna de sus sifras por favor ");
      }
      else 
      {
        for (int a=0; a<3 ; a++)
        {
          for (int b = 0 ; b<3; b++)
          {
            //System.out.println(aComparar[b]+ " "+ digitos[a]);
            if (aComparar[b] == digitos[a])
            {
              if(b==a)
              {
                fijas++;

              }
              else{
                picas++;
              }
              

            }
            

          }
        }

      }
      intentos ++;
      if (fijas ==3)
      {
        sigueJugando=false;
        System.out.print("¡GANASTE!, lo lograste con tan solo " + intentos + " intentos tienes una ");
      }

   }



   System.out.println(" cantidad de fijas "+fijas +"            cantidad de picas "+picas);
    }
  
}}