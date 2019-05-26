package com.sda.algorytmy;


public class LinkedListImpl<E> implements MyList<E>{


    private Node head;
    private int size = 0;
    public LinkedListImpl(){

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {

        if (size == 0) {
            head = new Node(e);
        } else {

            Node tmp = head;
            head = new Node(e);
            head.next = tmp;
            return true;
        }
        size++;
        return true;
    }

    public void printList(){

        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }

    }


    @Override
    public String toString() {
        return "LinkedListImpl{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean remove(int index){
        return false;


    }
    class Node{
        private Node next;
        private Object data;

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }

        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
              return data;

        }

    }

}
