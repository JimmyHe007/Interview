package algorithm.unit1;

import java.util.Stack;

/**
 * 739. 每日温度
 */
public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temperatures = {55,38,53,81,61,93,97,32,43,78};
        int[] result = dailyTemperatures(temperatures);
        for (int i : result) {
            System.out.print(i);
        }

    }

    public static int[] dailyTemperatures(int[] T) {

        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = T.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return result;
    }

//    public static int[] dailyTemperatures(int[] T) {
//
//        int[] result = new int[T.length];
//        Stack<Integer> stack = new Stack<>();
//        stack.push(0);
//        for (int i = 1; i < T.length; i++) {
//            int prev = stack.pop();
//            int current = T[i];
//            int j = i;
//            while (current <= T[prev]) {
//                if (j == i) {
//                    stack.push(prev);
//                }
//                stack.push(j);
//                j++;
//                if (!(j < T.length)) {
//                    j = prev;
//                    stack.clear();
//                    break;
//                }
//                current = T[j];
//            }
//            while (current > T[prev]) {
//                if (stack.isEmpty()) {
//                    break;
//                } else {
//                    prev = stack.pop();
//                }
//            }
//
//            result[i-1] = j-prev;
//            stack.push(i);
//        }
//        return result;
//    }

}
