package homework.exercise9;

import java.util.Arrays;

public class StringUtils {

    public static boolean areAnagrams(String text1, String text2) {
        text1 = normalizeText(text1);
        text2 = normalizeText(text2);

        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.compare(charArray1, charArray2) == 0;
    }

    private static String normalizeText(String text) {
        return text.toLowerCase().replaceAll("\\s", "");
    }

}
