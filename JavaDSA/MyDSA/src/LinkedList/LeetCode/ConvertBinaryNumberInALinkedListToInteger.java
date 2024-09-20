package LinkedList.LeetCode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {

    }
    public static int getDecimalValue(ListNode head) {
        int res = 0;
        while(head != null){
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }
}


