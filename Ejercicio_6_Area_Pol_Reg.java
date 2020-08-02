
import java.util.Scanner;

public class Ejercicio_6_Area_Pol_Reg
    {
        public static void main(String[] args)
        {
        double Long_lado, Area;
        int N_Lados;
        Scanner Tecl = new Scanner(System.in);
        System.out.println("Calculadora de area de poligonos regulares");
        System.out.print("Ingresa la longitud de un lado = ");
        Long_lado = Tecl.nextDouble();
        System.out.print("Ingresa el numero de lados = ");
        N_Lados = Tecl.nextInt();
        Area =(N_Lados * Math.pow(Long_lado,2))/(4 * Math.tan(Math.PI / N_Lados));
        System.out.println("El area del poligono es = "+ Area);
           }
    }
