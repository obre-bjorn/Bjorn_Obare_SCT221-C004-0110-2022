class SinglyLinkedListNode{
    int data;
    SinglyLinkedListNode next;


    // This is a constructor for SinglyLinkedListNode
    public SinglyLinkedListNode(int data){
        this.data = data;
    }

}

public class SinglyLinkedListInsertion {




    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position){

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if(position == 0){
            newNode.next = head;
            
            return newNode;
        }


        SinglyLinkedListNode current = head;
        
        for (int i = 0; i < position - 1; i++) {
            
            current = current.next;

        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }


    static void printLikedLIst(SinglyLinkedListNode head){

        while(head != null){

            System.out.println(head.data);
            head = head.next;

        }

    }

    // Main Method To to Test the InsertAtPosition Function.c
    public static void main(String[] args) {
        
        SinglyLinkedListNode head = new SinglyLinkedListNode(3);
        head.next  = new SinglyLinkedListNode(4);

        head.next.next = new SinglyLinkedListNode(7);

        printLikedLIst(head); // Prints 3,4,7

        SinglyLinkedListNode newHead = insertNodeAtPosition(head, 5, 1);

        printLikedLIst(newHead); // Prints 3,5,4,7

    }


}
