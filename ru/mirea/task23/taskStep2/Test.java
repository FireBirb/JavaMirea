package ru.mirea.task23.taskStep2;

public class Test {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue("Text1");
        linkedQueue.enqueue("Text2");
        linkedQueue.enqueue("Text3");
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.element());
        System.out.println(linkedQueue.dequeue());
    }
}
