package com.mycompany.ejercicio_1;
import java.util.Scanner;
public class Ejercicio_1 {

    public static void main(String[] args) {
        double x1, y1, x2, y2, m, b, x, y0, x3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese valor de x1");
        x1 = scanner.nextDouble();
        
        System.out.println("Ingrese valor de y1");
        y1 = scanner.nextDouble();
        
        System.out.println("Ingrese valor de x2");
        x2 = scanner.nextDouble();
        
        System.out.println("Ingrese valor de y2");
        y2 = scanner.nextDouble();
        
        m = (y2 - y1) / (x2 - x1);
        
        if (m < 0) {
            System.out.println("La pendiente es decreciente");
        } else {
            System.out.println("La pendiente es creciente");
        }
        
        System.out.println("El valor de la pendiente es: " + m);
        
        b = y1 - (m * x1);
        System.out.println("El valor del intercepto es: " + b);
        
        System.out.println("Al ingresar estos datos en la ecuación de la recta (y = mx + b) queda de la siguiente forma");
        System.out.println("y = " + m + "x + " + b);
        
        System.out.println("Ingrese un valor para x");
        x = scanner.nextDouble();
        
        y0 = (m * x) + b;
        System.out.println("El resultado es: " + y0);
        
        x3 = Math.atan(m);
        x3 = (x3 * 180) / Math.PI;
        
        if (x3 > 0) {
            System.out.println("El ángulo interno es " + x3 + "°");
        } else {
            x3 = -1 * x3;
            System.out.println("El ángulo interno es " + x3 + "°");
        }
    }
}
