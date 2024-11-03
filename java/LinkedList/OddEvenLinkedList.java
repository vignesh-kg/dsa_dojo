public class OddEvenLinkedList {
  
  public static void main(String[] args){
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    Solution s = new Solution();
    head = s.oddEvenLinkedList(head);
    printList(head);
    head = new ListNode(1, null);
    head = s.oddEvenLinkedList(head);
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
  public ListNode oddEvenLinkedList(ListNode head){
    if(head == null || head.next == null) return head;
    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenHead = even;

    while(even != null && even.next != null){
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }
    odd.next = evenHead;
    return head;
  }
}