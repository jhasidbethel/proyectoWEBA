import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }
        
        int Longitud = 1;
        int numero = myArray[0];
        int concurrencia = 1;
        
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == myArray[i-1]) {
                concurrencia++;
                if (concurrencia > Longitud) {
                    Longitud = concurrencia;
                    numero = myArray[i];
                }
            } else {
                concurrencia = 1;
            }
        }
        System.out.println("Longitud: " + Longitud);
        System.out.println("numero: " + numero);
    }
}
