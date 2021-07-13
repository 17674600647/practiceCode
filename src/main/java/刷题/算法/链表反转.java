package 刷题.算法;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 13:06 2021/7/10
 * @ Description：链表反转算法
 */

class ListNode {
    int val;
    ListNode nextNode = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class 链表反转 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode nowNode = head;
        ListNode nextNode = null;
        ListNode preNode = null;
        while (nowNode != null) {
            nextNode = nowNode.nextNode;
            nowNode.nextNode = preNode;
            preNode = nowNode;
            nowNode = nextNode;
        }
        return nowNode;
    }
}
