public class Main {
    public static boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abcdefgg";
        boolean result = isUnique(input);
        if (result) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }
    }
}