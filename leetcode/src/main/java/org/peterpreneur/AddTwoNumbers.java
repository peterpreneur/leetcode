package org.peterpreneur;

public class AddTwoNumbers {

   public static void main(String[] var0) {
      ListNode var1 = new ListNode(2, new ListNode(4, new ListNode(3)));
      ListNode var2 = new ListNode(5, new ListNode(6, new ListNode(4)));
      addTwoNumbers(var1, var2);
      printList(var1);
      printList(var2);
   }

   public static void addTwoNumbers(ListNode var0, ListNode var1) {
   }

   public static void printList(ListNode var0) {
      for(ListNode var1 = var0; var1 != null; var1 = var1.next) {
         System.out.print(var1.val);
         if (var1.next != null) {
            System.out.print(" -> ");
         }
      }

      System.out.println();
   }

   public static class ListNode {
      int val;
      ListNode next;

      ListNode() {
      }

      ListNode(int var1) {
         this.val = var1;
      }

      ListNode(int var1, ListNode var2) {
         this.val = var1;
         this.next = var2;
      }
   }
}
