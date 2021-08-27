package com.Bridgelabz;

public class Main {
    public static void main(String[] args) {

        MyLinkedLink addLinkList = new MyLinkedLink();
        addLinkList.add(56);
        addLinkList.add(70);
        addLinkList.insertAtMidPosition(2,30);
        addLinkList.display(addLinkList.head);

    }
}
