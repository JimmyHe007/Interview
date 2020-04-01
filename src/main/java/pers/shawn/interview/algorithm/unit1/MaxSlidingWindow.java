package pers.shawn.interview.algorithm.unit1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 239. 滑动窗口最大值
 */
public class MaxSlidingWindow {

    private static ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
//    private static int [] numst;

    public static void main(String[] args) {

        int[] nums = {4,3,11};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        for (int i : result) {
            System.out.print(i+"\t");
        }

    }

//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int n = nums.length;
//        if (n * k == 0) return new int[0];
//        if (k == 1) return nums;
//
//        // init deque and output
//        numst = nums;
//        int max_idx = 0;
//        for (int i = 0; i < k; i++) {
//            clean_deque(i, k);
//            deq.addLast(i);
//            // compute max in nums[:k]
//            if (nums[i] > nums[max_idx]) max_idx = i;
//        }
//        int [] output = new int[n - k + 1];
//        output[0] = nums[max_idx];
//
//        // build output
//        for (int i  = k; i < n; i++) {
//            clean_deque(i, k);
//            deq.addLast(i);
//            output[i - k + 1] = nums[deq.getFirst()];
//        }
//        return output;
//    }
//
//    public static void clean_deque(int i, int k) {
//        // remove indexes of elements not from sliding window
//        if (!deq.isEmpty() && deq.getFirst() == i - k)
//            deq.removeFirst();
//
//        // remove from deq indexes of all elements
//        // which are smaller than current element nums[i]
//        while (!deq.isEmpty() && numst[i] > numst[deq.getLast()])deq.removeLast();
//    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0) {
            return new int[0];
        }
        int[] result = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        for (int i = 1; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        result[0] = nums[deque.getFirst()];
        for (int i = k; i < nums.length; i++) {
            if (deque.getFirst() == i-k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            result[i-k+1] = nums[deque.getFirst()];
        }
        return result;
    }

}
