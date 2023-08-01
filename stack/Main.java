/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author levan
 */
public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(3);
        myStack.printStack();
        
        System.out.println("Pop(): ");
        myStack.pop();
        myStack.printStack();
        
        System.out.println("Pop(): ");
        myStack.pop();
        myStack.printStack();
    }
}
