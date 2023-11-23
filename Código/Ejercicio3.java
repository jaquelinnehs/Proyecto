import java.util.Scanner;
/**
 *
 * @author Gustavo Barrera Martinez
 */
public class PRUEBA {
    public static void main(String[] args) {
     
    Scanner dato = new Scanner(System.in);
        // solicitar al usuario las cordenadas el punto C (x1,y1)
        System.out.print("Ingrese la coordenada del centro de la circunferencia primero x1: ");
        int x1 = dato.nextInt();
        System.out.print("Ingrese la coordenada del centro de la circunferencia despues y1: ");
        int y1 = dato.nextInt();
        // solicitar el radio de la circunferencia
        System.out.println("Ingrese el radio de la circunferencia: ");
        int radio = dato.nextInt();
        // solicitar al usuario las coordenadas del punto T (x2,y2)
        System.out.print("Ingrese la coordenada del punto T X2: ");
        int x2 = dato.nextInt();
        System.out.print("Ingrese la coordenada del punto T Y2: ");
        int y2 = dato.nextInt();
        // Cálculo de la distancia entre el punto C y el punto T
        double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        // Si la distancia es menor a 0
        if (distancia<0){   
        double menor = (distancia * (-1));
        // Si la distancia es menor o igual al radio, el punto T está dentro de la circunferencia
        if (menor <= radio) {
        System.out.println("El punto T está dentro de la circunferencia");
        } else {
        System.out.println("El punto T no está dentro de la circunferencia");
            }  
        } else { 
        // Si la distancia es menor o igual al radio, el punto T está dentro de la circunferencia
        if (distancia <= radio) {
            System.out.println("El punto T está dentro de la circunferencia");
        } else {
            System.out.println("El punto T no está dentro de la circunferencia");
        }
        }   
    }
}
