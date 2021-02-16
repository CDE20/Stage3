import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head==null){
            return head;
        }
        SinglyLinkedListNode traversenode=null;
        SinglyLinkedListNode temphead=head;
        Set<Integer> set = new HashSet<>();
        while(temphead!=null){
            int d = temphead.data;
            
            set.add(d);
            temphead=temphead.next;
            // traversenode=temphead;
            // while(traversenode.next.data==d){
            //     traversenode=traversenode.next;
            // }
            // temphead.next=traversenode.next;
        }
        System.out.println(set);
        SinglyLinkedList list = new SinglyLinkedList();
        for(int e:set){
        list.insertNode(e);
        }
        
        return list.head;
    }
        
        


    

    private static final Scanner scanner = new Scanner(System.in);