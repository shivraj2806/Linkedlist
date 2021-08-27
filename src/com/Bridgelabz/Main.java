package com.Bridgelabz;

public class Main {
    public static void main(String[] args) {

        MyLinkedLink addLinkList = new MyLinkedLink();
        addLinkList.add(56);
        addLinkList.add(30);
        addLinkList.add(40);
        addLinkList.add(70);
        addLinkList.sort();
        addLinkList.display(addLinkList.head);

    }

}




