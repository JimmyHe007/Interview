package algorithm.unit2;

import java.util.*;

/**
 * 347. 前K个高频元素
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 */
public class TopKFrequentElements {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> results = topKFrequent(nums, k);
        for (Integer result : results) {
            System.out.print(result+"\t");
        }

    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> results = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        //自定义匹配器, 通过value来比较优先级, 从小到大排列
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        for (Integer integer : map.keySet()) {
            heap.add(integer);
            if (heap.size() > k) {
                //取出堆顶元素
                heap.poll();
            }
        }
        while (!heap.isEmpty()) {
            results.add(heap.poll());
        }
        Collections.reverse(results);
        return results;
    }

}
