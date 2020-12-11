package com.evan.leetcode.preface;

public class MyCircularQueue {

    private int[]  circularQueue;

    private int startPoint;
    private int endPoint;

    private int size;

    /**
     * Initializes the object with the size of the queue to be k.
     */
    MyCircularQueue(int k) {
        this.startPoint = -1;
        this.endPoint = -1;
        this.size = k;
        circularQueue = new int[k];
    }

    /**
     * Gets the front item from the queue. If the queue is empty, return -1.
     *
     * @return
     */
    int front() {
        if (this.isEmpty()) {
            return -1;
        }
        return circularQueue[startPoint];
    }

    /**
     * Gets the last item from the queue. If the queue is empty, return -1
     *
     * @return
     */
    int Rear() {
        if (this.isEmpty()) {
            return -1;
        }
        return circularQueue[endPoint];
    }

    /**
     * Inserts an element into the circular queue. Return true if the operation is successful.
     *
     * @param value
     * @return
     */
    boolean enQueue(int value) {

        //reject put new element if circular queue is full. Actually we also can replace the old value of start pointer
        if(this.isFull()){
            return false;
        }


        if(this.isEmpty()){
            startPoint = 0;
        }

        endPoint = forwardPointer(endPoint);
        circularQueue[endPoint]= value;
        System.out.println("start pointer :" + startPoint + " end pointer:" + endPoint+" size:"+size);
        return true;
    }

    /**
     * Deletes an element from the circular queue. Return true if the operation is successful.
     *
     * @return
     */
    boolean deQueue() {
        if (this.isEmpty()) {
            return false;
        }
        circularQueue[startPoint] = -1;
        startPoint = forwardPointer(startPoint);
        return true;
    }

    private int forwardPointer(int currentPointer) {
        return (currentPointer + 1) % size;
    }

    /**
     * Checks whether the circular queue is empty or not.
     *
     * @return
     */
    boolean isEmpty() {
        if (startPoint == -1) {
            return true;
        }
        return false;
    }

    /**
     * Checks whether the circular queue is full or not.
     *
     * @return
     */
    boolean isFull() {
        if ((endPoint + 1) % size == startPoint) {
            return true;
        }
        return false;
    }

    int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for (Integer item : circularQueue) {
            result += item + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);

        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
        myCircularQueue.enQueue(5);
        myCircularQueue.deQueue();
        myCircularQueue.deQueue();

        myCircularQueue.enQueue(2);

        System.out.println(myCircularQueue.toString());

    }
}
