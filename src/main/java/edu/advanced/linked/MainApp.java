package edu.advanced.linked;


import edu.advanced.linked.circular.CicularLinkedList;

public class MainApp {

    public static void main(String[] args) {
        CicularLinkedList cicularLinkedList = new CicularLinkedList();

        System.out.println("-- Circular Linked List Example -->>\n");

        // Agregar al final de la lista linked
        cicularLinkedList.addLast(12);
        cicularLinkedList.addLast(15);
        cicularLinkedList.addLast(9);
        // Agregar in inicio de la lista linked
        cicularLinkedList.addFirst(41);
        cicularLinkedList.addFirst(6);

        System.out.println("-- Lista Circular --");
        cicularLinkedList.display();

        System.out.println("\n\n-- Tamaño --");
        System.out.println(cicularLinkedList.getSize());

        System.out.println("\n-- Obtener el valor del nodo en la posicion 3 --");
        System.out.println(cicularLinkedList.get(3));

        System.out.println("\nInsrta un nodo con valor 16 despues del 15");
        cicularLinkedList.addAfterReference(15, 16);
        cicularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(cicularLinkedList.getSize());

        System.out.println("\nInsrta un nodo con valor 44 en la posición 5");
        cicularLinkedList.add(5, 44);
        cicularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(cicularLinkedList.getSize());

        System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
        cicularLinkedList.modifyByValue(12, 13);
        cicularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(cicularLinkedList.getSize());

        System.out.println("\nActualiza el valor nodo en la posición 0 por 17");
        cicularLinkedList.modify(0, 17);
        cicularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(cicularLinkedList.getSize());

        System.out.println("\nElimina el nodo con el valor 41");
        cicularLinkedList.removeByElement(41);
        cicularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(cicularLinkedList.getSize());

        System.out.println("\nElimina el nodo en la posición 4");
        cicularLinkedList.remove(4);
        cicularLinkedList.display();
        System.out.print("| Tamaño: ");
        System.out.println(cicularLinkedList.getSize());

        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(cicularLinkedList.contains(30));

        System.out.println("\nConsulta la posicion del valor 16");
        System.out.println(cicularLinkedList.indexOf(16));

        System.out.println("\nElimina la lista");
        cicularLinkedList.clear();

        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(cicularLinkedList.isEmpty());

        System.out.println("\n\n-- Fin de ejemplo lista simple --");
    }
}
