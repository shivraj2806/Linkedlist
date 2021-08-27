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
        public boolean emptyCheck() {
            if (head == null) {
                return true;

            }
            return false;
        }
        public void display(Node head) {
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
