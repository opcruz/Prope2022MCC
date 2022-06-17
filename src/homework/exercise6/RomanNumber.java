
package homework.exercise6;

public class RomanNumber {

    public enum Roman {
        I('I', 1),
        V('V', 5),
        X('X', 10),
        L('L', 50),
        C('C', 100),
        D('D', 500),
        M('M', 1000);

        private final char letter;

        private final int value;

        public int getValue() {
            return value;
        }

        Roman(char letter, int value) {
            this.letter = letter;
            this.value = value;
        }

        public boolean isGreaterThan(Roman other) {
            return value > other.value;
        }

    }

    public static Roman find(char value) {
        for (Roman current : Roman.values()) {
            if (current.letter == value) {
                return current;
            }
        }
        return null;
    }

    public static int toDecimal(String value) {
        int acc = 0;
        Roman last = null;
        for (char currentChar : value.toCharArray()) {
            Roman current = RomanNumber.find(currentChar);
            if (current != null) {
                if (last != null && current.isGreaterThan(last)) {
                    acc += current.value - 2 * last.value;
                } else {
                    acc += current.value;
                }
                last = current;
            } else {
                throw new IllegalArgumentException("Carácter inválido: " + currentChar);
            }
        }
        return acc;
    }

}
