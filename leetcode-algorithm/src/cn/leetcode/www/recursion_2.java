package cn.leetcode.www;
/*
顺序删除第n个结点
*/
public class recursion_2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        class Solution {
            public ListNode removeNthFromEnd(ListNode head, int n) {
                if (n == 1) {
                    return head.next != null ? head.next : null;
                }
                head.next = removeNthFromEnd(head.next, n - 1);
                return head;
            }
        }
    }
}
