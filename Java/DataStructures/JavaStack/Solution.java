package DataStructures.JavaStack;

import java.util.*;

public class Solution {

    private static Map<Character, Character> templateCh = new HashMap<>();
    private static Deque<Character> stack = new ArrayDeque<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        templateCh.put( ']' , '[');
        templateCh.put( '}' , '{' );
        templateCh.put( ')' , '(' );

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input.toCharArray()) ? "true" : "false");
            stack.clear();
        }

        sc.close();
    }

    private static Boolean isBalanced(char[] input) {

        for (Character bracket : input) {

            if (templateCh.containsValue(bracket)) {
                stack.push(bracket);
            } else if (!stack.isEmpty() && stack.getFirst().equals(templateCh.get(bracket))) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
