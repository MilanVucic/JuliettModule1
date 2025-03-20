package module_1.lesson_9;

public class Main {

    public static void main(String[] args) {
        String input = "        Alexander \"The Magnificent\"        ";
        int startIndex = input.indexOf("\"") + 1;
        int endIndex = input.lastIndexOf("\"");
        System.out.println(input.substring(startIndex, endIndex));
        String another = "[1-9] asd 1 asd 3 asd 5";
        System.out.println(another.replace("[1-9]", "OOO"));
        System.out.println(another.replaceAll("[1-9]", "OOO"));
        System.out.println(input);
        System.out.println(input.trim());

        // Additional HW:
        // 1. Check if a string is a palindrome. Palindrome means that it
        // is the same string backwards
        //
        // 2. Reverse the words in a given string.
        // 3. In a given array of Strings, find the longest common prefix.
        // [apple, application, ape] => ap
        // [apple, application, banana] => empty string
    }
}
