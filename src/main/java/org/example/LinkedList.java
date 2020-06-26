package org.example;

import javax.xml.soap.SOAPPart;

public class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data =data;
        node.next = null;
        if(head == null)// if head is null that means you have no nodes in the list
        {
            head = node;
        }
        else
            {
                Node n = head;
                while(n.next != null)
                {
                    n = n.next;
                }
                n = node.next;
            }
    }
    public void show()
    {
        Node node = head;
        while (node.next != null)
        {
            System.out.println(node.data);
            node = node.next; // shift to the next node
        }
        System.out.println(node.data);
    }
}
