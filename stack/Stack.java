/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author levan
 */
public class Stack {
    private Node top;
    private int height;
    
    class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
        }
    }
    
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    
    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
            height++;
            return;
        }
        
        newNode.next = top;
        top = newNode;
        height++;
    }
    
    public Node pop() {
        if(height == 0) return null;
        
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
