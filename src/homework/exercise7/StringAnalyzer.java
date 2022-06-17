
package homework.exercise7;

public class StringAnalyzer {

    private final String text;

    public static char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú'};

    private int vowelsCount = 0;

    private int digitsCount = 0;

    private int consonantsCount = 0;

    public StringAnalyzer(String text) {
        this.text = text;
        parse();
    }

    public static boolean isVowel(char value) {
        for (char current : VOWELS) {
            if (value == current) {
                return true;
            }
        }
        return false;
    }

    private void parse() {
        for (char current : text.toCharArray()) {
            if (Character.isLetter(current)) {
                if (isVowel(current)) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            } else if (Character.isDigit(current)) {
                digitsCount++;
            }
        }
    }

    public void printInfo() {
        System.out.println("Vocales: " + vowelsCount);
        System.out.println("Consonantes: " + consonantsCount);
        System.out.println("Dígitos: " + digitsCount);
    }

    public String getText() {
        return text;
    }

}
