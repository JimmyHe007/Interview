package pers.shawn.interview.algorithm.unit1;

/**
 * 25. k个一组翻转链表
 */
class ReverseNodes {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode = reverseKGroup(listNode, 6);
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }


    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode prev = null, next = null;
        ListNode current = head, check = head;
        int canProceed = 0, count = 0;
        while (canProceed < k && check != null) {
            check = check.next;
            canProceed++;
        }
        if (canProceed == k) {
            while (count < k && current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
            return prev;
        } else {
            return head;
        }

    }

//    public static ListNode reverseKGroup(ListNode head, int k) {
//
//        boolean times = true;
//        ListNode result = null, lastNode = null;
//        if (!(k > 1)) {
//            return head;
//        }
//        int sum = 0;
//        while (head != null) {
//            ListNode[] listNodes = new ListNode[k];
//            for (int i = 0; i < k; i++) {
//                listNodes[i] = head;
//                head = head.next;
//                if (head == null && (i+1) != k) {
//                    times = false;
//                    break;
//                }
//            }
//            if (times != false) {
//                for (int i = k-1; i >= 0; i--) {
//                    if (lastNode == null) {
//                        lastNode = listNodes[i];
//                        listNodes[i-1].next = null;
//                        lastNode.next = listNodes[--i];
//                        result = lastNode;
//                    } else {
//                        listNodes[i].next = null;
//                        lastNode.next = listNodes[i];
//                    }
//                    lastNode = lastNode.next;
//                }
//            } else {
//                if (lastNode == null) {
//                    lastNode = listNodes[0];
//                    result = lastNode;
//                } else {
//                    lastNode.next = listNodes[0];
//                }
//            }
//        }
//        return result;
//    }
//
}

//定义一个单链表
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
