
package homework.exercise5;

import java.util.Scanner;

public class NumberList {

    private int[] arr = new int[10];

    private Scanner input = new Scanner(System.in);

    public void initFromStdin() {
        System.out.println("Ingrese l0 números enteros");
        int i = 0;
        String current;
        while (i < 10) {
            try {
                current = input.nextLine();
                arr[i] = Integer.parseInt(current);
                i++;
                System.out.printf("%d número ingresado\n", i);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido");
            }
        }
    }

    public void findPrimes() {
        int current;
        for (int i = 0; i < arr.length; i++) {
            current = arr[i];
            if (NumberUtils.isPrime(current)) {
                System.out.printf("El número %d que ocupa la posición %d es primo\n", current, i + 1);
            } else {
                System.out.printf("El número %d que ocupa la posición %d no es primo\n", current, i + 1);
            }

        }
    }

}
