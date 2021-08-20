package algo;

import java.util.ArrayList;
import java.util.LinkedList;

/*The list is so created so that the highest priority element is always at the head of the list.
        The list is arranged in descending order of elements based on their priority.
        This allow us to remove the highest priority element in O(1) time.
        To insert an element we must traverse the list and find the proper position to
        insert the node so that the overall order of the priority queue is maintained.
        This makes the push() operation takes O(N) time. The pop() and peek() operations are performed in constant time.
*/
public class PriorityQueus {


    static  class Node{
        int data;
        int priority;
        Node next;
    }
     static Node node = new Node();

    public PriorityQueus(){

    }

   static  Node newNode(int d, int p){
        Node temp = new Node();
        temp.data= d;
        temp.priority=p;
        temp.next=null;
        return temp;
   }
   static int peek(Node head){
        return head.data;
   }
   static int pop(Node head){
        Node temp= head;
        head=head.next;
        return temp.data;

   }
   static  void push(int item, int p){

   }
}
