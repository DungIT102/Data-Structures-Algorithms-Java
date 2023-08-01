/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author levan
 */
public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(7);
        myQueue.enqueue(8);
        myQueue.printQueue();
        
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.printQueue();
    }
}
