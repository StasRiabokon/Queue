/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myqueue;

/**
 *
 * @author yasta
 */
public class QueueClass implements MyQueue {

    private int size;
    private Object[] queueArr;
    private int rear;
    private int front;
    private final int sizeOfQueue = 1000;
    private int nElem;

    public QueueClass() {
        size = sizeOfQueue;
        queueArr = new Object[size];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public int getNumberOfElements() {
        return nElem;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > sizeOfQueue) {
            System.out.println("No! " + sizeOfQueue + " is max size of Stack");
        }
        this.size = size;
    }

    @Override
    public void insert(Object element) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (rear == size - 1) {
                rear = -1;
            }
            queueArr[++rear] = element;
            nElem++;
        }
    }

    @Override
    public Object delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0;
        } else {
            Object temp = queueArr[front++];
            if (front == size) {
                front = 0;
            }
            nElem--;
            return temp;
        }

    }

    public boolean isFull() {
        return (nElem == size);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    @Override
    public void deleteAll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else if (front < rear) {
            for (int i = front; i <= rear; i++) {
                System.out.println(queueArr[i]);
            }
            rear = -1;
            front = 0;
        } else {
            for (int i = 0; i <= rear; i++) {
                System.out.println(queueArr[i]);
            }
            for (int i = front; i < size; i++) {
                System.out.println(queueArr[i]);
            }
            rear = -1;
            front = 0;
        }
    }

}
