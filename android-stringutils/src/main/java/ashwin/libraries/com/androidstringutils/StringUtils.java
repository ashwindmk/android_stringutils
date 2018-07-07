package ashwin.libraries.com.androidstringutils;

/**
 * Created by ashwin on 07/07/18.
 */

public class StringUtils {

    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static int getLength(String str) {
        if (isEmpty(str)) {
            return 0;
        }
        return str.length();
    }

    public static int getCount(String str, char ch) {
        if (isEmpty(str)) {
            return 0;
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static String getTitleCase(String str) {
        if (isBlank(str)) {
            return str;
        }

        StringBuilder titleCase = new StringBuilder();
        boolean shouldTitleize = true;

        for (char c : str.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                shouldTitleize = true;
            } else if (shouldTitleize) {
                c = Character.toTitleCase(c);
                shouldTitleize = false;
            } else {
                c = Character.toLowerCase(c);
                shouldTitleize = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }

}
