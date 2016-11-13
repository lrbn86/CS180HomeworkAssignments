public class MyUtils {

    public static boolean isNumeric(String str) {
        // Returns true if the String given is a number. Else false.
        boolean twoDots = false;
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                if (str.charAt(i) == '.') {
                    if (!twoDots) {
                        if (Character.isDigit(str.charAt(i + 1))) {
                            continue;
                        }
                        twoDots = true;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static String formatStr(String str) {
        String result = str.substring(0, 1).toUpperCase() + str.substring(1, str
                .length()).toLowerCase();

        return result;
    }

    public static void main(String[] args) {
        String str = "12.2";
        System.out.println(isNumeric(str));
    }

}
