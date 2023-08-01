/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlist;

/**
 *
 * @author levan
 */
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(10);
        myDLL.printList();
        
        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.get(2).value);

        
          
    }
}
