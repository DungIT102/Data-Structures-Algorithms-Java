/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlist;

/**
 *
 * @author levan
 */
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    
    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    
    class Node {
        int value;
        Node next;
        Node prev;
        
        Node(int value) {
            this.value = value;
        }
        
    }
    
    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    
    public Node removeLast() {
        if(length == 0) return null;
        
        Node temp = tail;
        if(length == 1) {
            head = null;
            tail = null;
            length--;
            return temp;
        }
        
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
    
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
    }
    
    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
            length--;
            return temp;
        }
        
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        return temp;
    }
    
    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        if(index < (length / 2)) {
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            
            return temp;
        }
        
        Node temp = tail;
        for(int i = length - 1; i > index; i--){
            temp = temp.prev;
        }
        
        return temp;
    }
    
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        
        return false;
    }
    
    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }
    
    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();
        
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        
        return temp;
    }
}
