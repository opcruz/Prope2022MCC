package homework.exercise9;

import java.util.LinkedList;
import java.util.Scanner;

public class AnagramFinder {

    private Scanner input = new Scanner(System.in);

    public void start() {
        LinkedList<String> list = new LinkedList<>();
        String text;
        boolean running = true;
        System.out.println("Inserte las cadenas: (La ejecución finalizará cuando se encuentre las primeras cadenas que sean anagramas)");

        while (running) {
            text = input.nextLine();
            for (String current : list) {
                if (StringUtils.areAnagrams(current, text)) {
                    System.out.printf("Las cadenas: %s y %s son anagramas\n", text, current);
                    running = false;
                    break;
                }
            }
            list.add(text);
        }
    }


}
