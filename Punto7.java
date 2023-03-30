import java.util.Scanner;
public class Punto7{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6]; 
        System.out.println("Ingresa los 6 números del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int objetivo = 10; 
        for (int i = 0; i < numeros.length; i++) {
            int num1 = numeros[i];
            for (int j = i + 1; j < numeros.length; j++) {
                int num2 = numeros[j];
                if (num1 + num2 == objetivo)
                    System.out.println("los numeros que suman 10 son : " +num1 +  " " + num2);
               } 
                   
           }
        }
    }

