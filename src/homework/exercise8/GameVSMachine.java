
package homework.exercise8;

import java.util.Scanner;

public class GameVSMachine implements Game {

    private int number;

    private Scanner input = new Scanner(System.in);

    private static int generateRamdomNumber() {
        return (int) (Math.random() * 100);
    }

    private void init() {
        this.number = generateRamdomNumber();
    }

    @Override
    public void start() {
        init();
        System.out.println();
        System.out.println("Contra la computadora");
        System.out.println("Adivine el número. (0 - 100)");
        int i = 1, current;
        while (true) {
            System.out.printf("Intento %d: ", i);
            try {
                String line = input.nextLine();
                current = Integer.parseInt(line);
                if (current == number) {
                    System.out.printf("Correcto. Adivinaste en %d intentos.\n", i);
                    return;
                } else if (number < current) {
                    System.out.printf("Es menor que %d\n", current);
                } else {
                    System.out.printf("Es mayor que %d\n", current);
                }
                i++;
            } catch (NumberFormatException ex) {
                System.out.println("Valor inválido");
            }
        }
    }

}
