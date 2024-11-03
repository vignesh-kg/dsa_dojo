public class DeleteMiddleNodeFromLinkedList {
  public static void main(String[] args){
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    Solution s = new Solution();
    head = s.deleteMiddleNode(head);
    printList(head);
    
    System.out.print("\n");
    head = new ListNode(1, null);
    head = s.deleteMiddleNode(head);
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
  public ListNode deleteMiddleNode(ListNode head){
    if(head == null || head.next == null) return null;
    ListNode slow = new ListNode(0, head);
    ListNode fast = slow;
    while(fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    slow.next = slow.next.next;
    return head;
  }
}