/*
  Dada una tabla de verdad de n bits generar
  la expresión booleana que genere de manera
  fidedigna las salidas de esta tabla.
*/
package com.mycompany.ejercicio_6;
import java.util.Scanner; //Importar clase Scanner.

public class Ejercicio_6 {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in); //Llamamos al objeto Scanner.
        System.out.print("Ingrese la cantidad de bits: ");
        int NumeroBits = obj.nextInt(); //Se ingresa la cantidad de Bits que tendra la tabla.

        if (NumeroBits < 1 || NumeroBits > 10) { //Limite de bits que puede ingresar el usuario
        System.out.println("Cantidad de bits inválida. Debe estar entre 1 y 10.");
        } else {
            
        int Filas = (int) Math.pow(2, NumeroBits); // Calcular el número de filas de la tabla de verdad.
        
        int[][] combinacionesBits = new int[Filas][NumeroBits]; // Crear arreglos para almacenar las combinaciones de bits.
        int[] resultados = new int[Filas]; // Crear arreglos para almacenar los resultados.
        
        for (int i = 0; i < Filas; i++) { // Solicitar al usuario ingresar los valores de resultado para cada combinación de bits.
            System.out.print("Ingrese el resultado de la fila " + (i + 1) + ": ");
            resultados[i] = obj.nextInt();
        }

        generarTablaVerdad(NumeroBits, combinacionesBits, resultados, Filas); //Metodo que genera la tabla de verdad.
        obtenerExpresionBooleana(NumeroBits, combinacionesBits, resultados, Filas); //Metodo para generar la expresion booleana.
    }
}
    public static void generarTablaVerdad(int NumeroBits, int[][] combinacionesBits, int[] resultados, int Filas) {

        for (int i = 0; i < Filas; i++) { // Generar todas las combinaciones de bits.
            for (int j = NumeroBits - 1; j >= 0; j--) {
                combinacionesBits[i][j] = (i / (int) Math.pow(2, j)) % 2; //Formula para generar las conbinaciones
            }
        }
        
        for (int i = 0; i < NumeroBits; i++) { // Imprimir encabezados de las columnas usando letras de la A a la Z.
            char letra = (char) ('A' + i);
            System.out.print(letra + "\t");
        }
        System.out.println("Resultado");

        for (int i = 0; i < Filas; i++) { // Imprime la tabla de verdad.
            for (int j = 0; j < NumeroBits; j++) {
                System.out.print(combinacionesBits[i][j] + "\t");
            }
            System.out.println(resultados[i]); //Imprime los resultados.
        }
    }

    public static void obtenerExpresionBooleana(int NumeroBits, int[][] combinacionesBits, int[] resultados, int Filas) {
        StringBuilder Expresion = new StringBuilder(); //Se utiliza para construir y manipular cadenas de caracteres de manera eficiente.

        for (int i = 0; i < Filas; i++) {  // Recorre las filas de la tabla de verdad
            if (resultados[i] == 1) { // Verificar si el resultado de la fila actual es igual a 1
                StringBuilder termino = new StringBuilder();// Crear un StringBuilder para construir el término correspondiente a la fila
                for (int j = 0; j < NumeroBits; j++) { // Recorre los bits de la fila
                    char letra = (char) ('A' + j);// Obtener la letra correspondiente al bit actual
                    if (combinacionesBits[i][j] == 0) {// Verificar si el bit actual es igual a 0
                        termino.append("¬").append(letra);// Si el bit es 0 agregar el símbolo de negación "¬" seguido de la letra al término
                    } else {
                        termino.append(letra);
                    }           
                }
                if (Expresion.length() > 0) {// Verificar si ya hay términos en la expresión booleana
                    Expresion.append(" + ");// Agregar el operador de suma "+" antes del nuevo término
                }
                Expresion.append(termino);// Agregar el término actual a la expresión booleana
            }
        }
        System.out.println("Expresión booleana: " + Expresion.toString());// Imprimir la expresión booleana resultante
    }
}
//Funcionamiento de las combinaciones de la tabla de verdad
/*
Para i = 0:
   Bit 2: (0 / 2^2) % 2 = 0 % 2 = 0
   Bit 1: (0 / 2^1) % 2 = 0 % 2 = 0
   Bit 0: (0 / 2^0) % 2 = 0 % 2 = 0 (Fila 0: 0 0 0)

Para i = 1:
   Bit 2: (1 / 2^2) % 2 = 0 % 2 = 0
   Bit 1: (1 / 2^1) % 2 = 0 % 2 = 0
   Bit 0: (1 / 2^0) % 2 = 1 % 2 = 1 (Fila 1: 0 0 1)

Para i = 2:
   Bit 2: (2 / 2^2) % 2 = 0 % 2 = 0
   Bit 1: (2 / 2^1) % 2 = 1 % 2 = 1
   Bit 0: (2 / 2^0) % 2 = 0 % 2 = 0 (Fila 2: 0 1 0)

*/
        

