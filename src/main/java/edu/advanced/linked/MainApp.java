package edu.advanced.linked;


import edu.advanced.linked.circular.CircularLinkedList;

public class MainApp {

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        System.out.println("-- Circular Linked List Example -->>\n");

        // Agregar al final de la lista linked
        circularLinkedList.addLast(12);
        circularLinkedList.addLast(15);
        circularLinkedList.addLast(9);
        // Agregar in inicio de la lista linked
        circularLinkedList.addFirst(41);
        circularLinkedList.addFirst(6);

        System.out.println("-- Lista Circular --");
        circularLinkedList.display();

        System.out.println("\n\n-- Tamaño --");
        System.out.println(circularLinkedList.getSize());

        System.out.println("\n-- Obtener el valor del nodo en la posicion 3 --");
        System.out.println(circularLinkedList.get(3));

        System.out.println("\nInsrta un nodo con valor 16 despues del 15");
        circularLinkedList.addAfterReference(15, 16);
        circularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(circularLinkedList.getSize());

        System.out.println("\nInsrta un nodo con valor 44 en la posición 5");
        circularLinkedList.add(5, 44);
        circularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(circularLinkedList.getSize());

        System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
        circularLinkedList.modifyByValue(12, 13);
        circularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(circularLinkedList.getSize());

        System.out.println("\nActualiza el valor nodo en la posición 0 por 17");
        circularLinkedList.modify(0, 17);
        circularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(circularLinkedList.getSize());

        System.out.println("\nElimina el nodo con el valor 41");
        circularLinkedList.removeByElement(41);
        circularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(circularLinkedList.getSize());

        System.out.println("\nElimina el nodo en la posición 4");
        circularLinkedList.remove(4);
        circularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(circularLinkedList.getSize());

        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(circularLinkedList.contains(30));

        System.out.println("\nConsulta la posicion del valor 16");
        System.out.println(circularLinkedList.indexOf(16));

        System.out.println("\nElimina la lista");
        circularLinkedList.clear();

        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(circularLinkedList.isEmpty());

        System.out.println("\n\n-- Fin de ejemplo lista simple --");
    }
}
