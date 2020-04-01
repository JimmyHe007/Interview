package algorithm.unit1;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class ValidParentheses {

    private static HashMap<Character, Character> mappings = new HashMap<Character, Character>();;

    public static void main(String[] args) {

        String s = "[]";
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        System.out.println(isValid(s));

    }

    //官方解法
    public static boolean isValid(String s) {

        if (s.trim().length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (char c : chars) {
            if (mappings.containsKey(c)) {
                char l = stack.empty()?'`':stack.pop();
                if (mappings.get(c) != l) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

//    public static boolean isValid(String s) {
//
//        if (s.trim().length() == 0) {
//            return true;
//        }
//        char[] chars = s.toCharArray();
//        Stack<Character> stack = new Stack();
//        for (char c : chars) {
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else {
//                if (stack.size() > 0) {
//                    char l = stack.pop();
//                    int i = c+l;
//                    if (!(i == 81 || i == 184 || i == 248)) {
//                        return false;
//                    }
//                } else {
//                    return false;
//                }
//            }
//        }
//        if (stack.size() == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
