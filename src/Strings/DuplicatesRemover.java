package Strings;

public class DuplicatesRemover {
    public static void main(String[] args) {
        String str = "Sai Tharun";
        StringBuilder unique_str = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique_str.append(str.charAt(i));
            }
        }

        System.out.println(unique_str);
    }
}