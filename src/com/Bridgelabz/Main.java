package com.Bridgelabz;

public class Main {
    public static void main(String[] args) {

        MyLinkedLink addLinkList = new MyLinkedLink();
        addLinkList.insertAtHead(70);
        addLinkList.insertAtHead(30);
        addLinkList.insertAtHead(56);
        addLinkList.display(addLinkList.head);

    }
}
