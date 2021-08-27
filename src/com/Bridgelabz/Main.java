package com.Bridgelabz;

public class Main {
    public static void main(String[] args) {

        MyLinkedLink addLinkList = new MyLinkedLink();
        addLinkList.add(56);
        addLinkList.add(30);
        addLinkList.add(70);
        Node newHead = addLinkList.popMethod();
        addLinkList.display(newHead);

    }
}
