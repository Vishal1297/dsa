public class ReverseWordsInAString3 {

    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse().toString());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

}