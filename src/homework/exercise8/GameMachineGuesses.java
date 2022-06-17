
package homework.exercise8;

import java.util.Scanner;

public class GameMachineGuesses implements Game {

    private int left;

    private int right;

    private Scanner input = new Scanner(System.in);

    private int generateNextNumber() {
        return (left + right) / 2;
    }

    private void init() {
        left = 0;
        right = 100;
    }

    @Override
    public void start() {
        init();
        System.out.println();
        System.out.println("Programa adivina");
        int i = 1, current;
        boolean running = true;
        while (running) {
            current = generateNextNumber();
            System.out.printf("Intento %d: %d\n", i, current);
            String line = input.nextLine();
            switch (line) {
                case ">":
                    left = current + 1;
                    i++;
                    break;

                case "<":
                    right = current - 1;
                    i++;
                    break;

                case "=":
                    System.out.printf("Adiviné en %d intentos B-)\n", i);
                    running = false;
                    break;

                default:
                    System.out.println("Valor inválido");

            }
        }
    }

}
