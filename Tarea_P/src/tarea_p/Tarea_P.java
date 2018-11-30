package tarea_p;
/*
 * @author Rebeca
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import static tarea_p.Kutta.Kutta;
 public class Tarea_P
{
    public static void main(String[] args)
    {
         Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Runga Kutta");
            System.out.println("2. Newton Raphson ");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                         Kutta();
                        break;
                    case 2:
                       //Newton Raphson
                        IFuncion f = new UnaFuncion(){

                    @Override
                    public double eval(double x) 
                    {
                        return x*x-2;//funcion
                    }
                }; 
                        IFuncion df = new UnaFuncion (){

                    @Override
                    public double eval(double x)
                    {
                        return 2*x;//raiz
                    }
                        };
                    NewtonRaphson nr=new NewtonRaphson();
                        System.out.println(nr.raiz(f, df, 1, 1e-6, 100));
                           
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 
    }
    

