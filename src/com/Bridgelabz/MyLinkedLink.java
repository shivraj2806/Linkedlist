package com.Bridgelabz;
import java.util.*;
class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class MyLinkedLink {
        Node head = null;
        Node tail;
   //****************UC1 Creat a simple Linklist*****************************************
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }

        //******************UC2 Insert at the head*****************************************
        public void insertAtHead(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
            public boolean emptyCheck () {
                if (head == null) {
                    return true;

                }
                return false;
            }

    //*********************************UC3 Insert at the tail************************************
            public void insertAtTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                insertAtHead(data);
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }
//************************************UC4 Insert 30 between 56 and 70********************************

        public void insertAtMidPosition(int position, int data) {
    Node newNode = new Node(data);
    if (emptyCheck()) {
        System.out.println("Empty Linkedlist");
        return;
    }

    Node temp = head;
    int idx = 1;
    while (temp.next != null) {
        if (idx == position - 1) {
            break;
        }
        idx++;
        temp = temp.next;
    }
    Node nxt = temp.next;
    temp.next = newNode;
    newNode.next = nxt;
}
//*****************************UC5 Delete the the frist element**********************
public Node popMethod() {
    if (emptyCheck()) {
        System.out.println("Empty Linkedlist");
        return head;
    }
    Node newHead = head.next;
    return newHead;
}
        public void display (Node head){
            if (emptyCheck()) {
                System.out.println("Empty Linkedlist");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }




