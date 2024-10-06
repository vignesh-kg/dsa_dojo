public class ReverseLinkedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    Solution s = new Solution();
    head = s.reverseLinkedList(head);
    printList(head);
    head = new ListNode(1, null);
    head = s.reverseLinkedList(head);
    printList(head);
  }
  private static void printList(ListNode head){
    if(head == null){
      System.out.println("null");
    }
    while(head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
    System.out.print("\n");
  }
}

class ListNode{
  int val;
  ListNode next;

  ListNode(int val, ListNode next){
    this.val = val;
    this.next = next;
  }
}

class Solution{
  public ListNode reverseLinkedList(ListNode head){
    if(head == null || head.next == null) return head;
    ListNode prev = null;
    ListNode temp;
    while(head != null){
      temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
  }
}