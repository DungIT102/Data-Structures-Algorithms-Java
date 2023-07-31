 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author levan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(4);
        myLinkedList.append(6);
        myLinkedList.set(0, 0);
        myLinkedList.printList();
        
        System.out.println("Reverser LinkedList: ");
        myLinkedList.reverser();
        myLinkedList.printList();
        
        
    }
    
}
