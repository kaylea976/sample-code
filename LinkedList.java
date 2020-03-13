import java.util.Scanner;
class LinkedList
{
    Node head;  
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void sortList()
    {
      
       int count[] = {0, 0, 0,0,0,0,0,0,0,0}; 
       
       Node ptr = head;

       while (ptr != null) 
       {
            count[ptr.data]++;
            ptr = ptr.next;
       }

       int i = 0;
       ptr = head;

        while (ptr != null) 
        {
            if (count[i] == 0)
                i++;
            else 
            {
               ptr.data= i;
               --count[i];
               ptr = ptr.next;
            }
         }
    }                       
    public void push(int new_data)
    {

        Node new_node = new Node(new_data);
 

        new_node.next = head;
 
        
        head = new_node;
    }


    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        
      
        list.push(0);
        list.push(3);
        list.push(5);
        list.push(4);
        list.push(2);
        list.push(1);
        list.push(6);
        list.push(8);
        list.push(7);
        list.push(9);
        
        System.out.println("Linked List before sorting");
        list.printList();
        
        list.sortList();

        System.out.println("Linked List after sorting");
        list.printList();
    }
   
} 