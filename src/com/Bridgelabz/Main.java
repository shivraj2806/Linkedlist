package com.Bridgelabz;

public class Main {
    public static void main(String[] args) {

        MyLinkedLink addLinkList = new MyLinkedLink();
        addLinkList.insertAtTail(56);
        addLinkList.insertAtTail(30);
        addLinkList.insertAtTail(70);
        addLinkList.display(addLinkList.head);

    }
}
