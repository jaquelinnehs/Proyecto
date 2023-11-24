package com.mycompany.mavenproject1;
import java.util.Scanner;
public class ProyectoIntegrador {

    public static void main(String args[]) {
            Scanner kevino=new Scanner(System.in);
     System.out.println("Ingresa el numero que deseas transformar");
     int decimal=kevino.nextInt();
     int bits = (int) (Math.log(Math.abs(decimal)) / Math.log(2)) + 1;//calcular los bits del numero.
     int valorinicial=decimal;    
    
       
        // Verificar si el número es negativo
        if (decimal < 0) {
            // Obtener la representación en complemento a 2
            decimal = (int) (Math.pow(2, bits) + decimal);
        }

        // Convertir a binario
        StringBuilder binary = new StringBuilder();
        do {
            // Obtener el bit menos significativo
            int bit = decimal % 2;
            // Agregar el bit al inicio de la cadena
            binary.insert(0, bit);
            // Dividir el número por 2
            decimal /= 2;
        } while (decimal > 0);

        // Ajustar la longitud al número de bits especificado
        while (binary.length() < bits) {
            binary.insert(0, '0');
        }

        
        String binario =binary.toString(); //converitr a cadena 
        System.out. println("***********************  ");
        System.out. println("       RESULTADOS    ");
        System.out. println("***********************  ");
        System.out.println("Número decimal: \t" + valorinicial);
        System.out. println("la cantidad de bits son: \t "+bits);
        System.out.println("Representación binaria:\t " + binario);
    }

    

        
}
