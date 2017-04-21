package DataStructures.JavaStack;


import java.util.*;

public class Solution {

    private static Map<Character, Character> templateCh = new HashMap<>();
    private static Deque<Character> stack = new ArrayDeque<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //char[] input = sc.nextLine().toCharArray();

        templateCh.put( ']' , '[');
        templateCh.put( '}' , '{' );
        templateCh.put( ')' , '(' );

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input.toCharArray()) ? "true" : "false");
            stack.clear();
        }
    }

    private static Boolean isBalanced(char[] input) {

        for (Character bracket : input) {

            if (templateCh.containsValue(bracket)) {
                stack.push(bracket);
            } else if (stack.getFirst().equals(templateCh.get(bracket))) {
                stack.pop();
            } else {
/*                System.out.println("Error firs bracket " + stack.getFirst());
                System.out.println("Error unbrecket " + bracket);*/
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
