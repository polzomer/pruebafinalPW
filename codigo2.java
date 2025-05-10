import java.util.Scanner;

public class codigo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuántos caracteres va a ingresar:");
        int cantidad = sc.nextInt();   
        sc.nextLine(); // limpiar el buffer

        String[] arreglo = new String[cantidad];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el carácter:");
            arreglo[i] = sc.nextLine();
        }

        String[] caracteres = new String[cantidad];
        int[] frecuencias = new int[cantidad];
        int size = 0;

        for (int i = 0; i < arreglo.length; i++) {
            String actual = arreglo[i];
            boolean encontrado = false;

            for (int j = 0; j < size; j++) {
                if (caracteres[j].equals(actual)) {
                    frecuencias[j]++;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                caracteres[size] = actual;
                frecuencias[size] = 1;
                size++;
            }
        }

        System.out.println("Frecuencias:");
        for (int i = 0; i < size; i++) {
            System.out.println(caracteres[i] + ": " + frecuencias[i]);
        }

        sc.close();
    }
}