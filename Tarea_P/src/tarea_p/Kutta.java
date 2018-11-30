package tarea_p;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * @author Rebeca
 */
public  class Kutta 
{
    
     public static double func(double x, double y)
     {          
         return -2*Math.pow(x, 3)+12*Math.pow(x, 2)-20*x+8.5;

      }
     public static void reportar(double x, double y, int i)
     {
         System.out.println("\t\t" +i +"\t\t" +x +"\t\t" +y );
     }

    
    public static void Kutta(){
   double x0,y0,xf,yf,h,k1,k2,k3,k4;
    int n,i;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{System.out.print("Ingrese el valor de x0: ");
    x0=Double.parseDouble(br.readLine());
    System.out.print("Ingrese el valor de y0: ");
    y0=Double.parseDouble(br.readLine());
    System.out.print("Ingrese el valor de xf: ");
    xf=Double.parseDouble(br.readLine());
    do{System.out.print("Ingrese el numero de subintervalos a emplear:");
    n=Integer.parseInt(br.readLine());
}
while(n<=0);h=(xf-x0)/n;
System.out.println("");
System.out.println("\t\t" +"I" +"\t\t" +"Xi" +"\t\t" +"Yi" );
System.out.println("\t\t" +"-" +"\t\t" +"-" +"\t\t" +"-" );
for(i=1;i<=n;i++)
{k1=func(x0,y0);
k2=func(x0+h/2,y0+h*k1/2);
k3=func(x0+h/2,y0+h*k2/2);
k4=func(x0+h,y0+h*k3);
y0=y0+(k1+2*k2+2*k3+k4)*h/6;
x0=x0+h;
reportar(x0,y0,i);
 }
 System.out.println("El valor de Yf: " +y0);
}
catch(Exception e){e.printStackTrace();
}

   
}
  }