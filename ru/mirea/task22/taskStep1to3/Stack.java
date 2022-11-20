package ru.mirea.task22.taskStep1to3;

class Stack {
    private final double[] arr;
    private int top;
    private final int capacity;
    Stack(int size) {
        arr = new double[size];
        capacity = size;
        top = -1;
    }
    public void push(double x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            //System.exit(1);
        }
        else arr[++top] = x;
    }
    public Double pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            //System.exit(1);
            return null;
        }
        return arr[top--];
    }
    public int getSize() {
        return top + 1;
    }
    public Boolean isEmpty() {
        return top == -1;
    }
    public Boolean isFull() {
        return top == capacity - 1;
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
