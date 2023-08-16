package DoubleLinkedLists;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // DoubleLinkedList doubleLinkedList = new DoubleLinkedList(8);

        // doubleLinkedList.getHead();
        // doubleLinkedList.getTail();
        // doubleLinkedList.getLength();
        // doubleLinkedList.printList();

        printMenu();
    }

    static void printMenu(){
        DoubleLinkedList doublelinkedList = new DoubleLinkedList();

        Scanner scanner = new Scanner(System.in);
        int choice;
        int values;

        do {
            System.out.println("\n===== Eliga una opcion =====");
            System.out.println("1. Agregar un elemento al final");
            System.out.println("2. Agregar un elemento al principio");
            System.out.println("3. Remover el primero");
            System.out.println("4. Remover el ultimo");
            System.out.println("5. Obtener Primero");
            System.out.println("6. Obtener Ultimo");
            System.out.println("7. Saber el valor de un index");
            // System.out.println("8. SET");
            // System.out.println("9. INSERT");
            // System.out.println("10. REMOVE");
            // System.out.println("11. REVERT");
            System.out.println("12. Imprimir Toda la lista");
            System.out.println("13. Salir!!?\n");


            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    // APPEND
                    System.out.println("\nintroduce el nuevo elemento: ");
                    values = scanner.nextInt();
                    doublelinkedList.append(values);
                    break;
                case 2:
                    // Agregar un elemento al principio
                    System.out.println("\nintroduce el nuevo elemento: ");
                    values = scanner.nextInt();
                    doublelinkedList.preppend(values);
                    break;
                case 3:
                    //Remover el primer elemento
                    doublelinkedList.removeFirst();
                    System.out.println("\nSe ELIMINO el primero");
                    break;
                case 4:
                    // REMOVE LAST Remover el ultimo elemento
                    doublelinkedList.removeLast();
                    System.out.println("\nSe ELIMINO el ultimo");
                    break;
                case 5:
                    //Obtener el primer nodo
                    doublelinkedList.getHead();
                    break;
                case 6:
                    //Obtener el ultimo nodo
                    doublelinkedList.getTail();
                    break;
                
                case 7:
                    //Saber el valor de una posicion
                    System.out.println("\nIngresa el index del nodo que quieres saber");
                    values = scanner.nextInt();
                    System.out.println(doublelinkedList.get(values).value);
                    break;
                // case 8:
                //     //Cambiar el valor de un nodo con index SET
                //     System.out.println("\nIngresa el index");
                //     values = scanner.nextInt();
                //     System.out.println("Ingresa el valor");
                //     values = scanner.nextInt();
                //     doublelinkedList.set(values, values);
                //     break;
                // case 9:
                //     //INSERT colocar un nodo en una posicion
                //     System.out.println("\nIngresa el index");
                //     values = scanner.nextInt();
                //     System.out.println("Ingresa el valor");
                //     values = scanner.nextInt();
                //     doublelinkedList.insert(values, values);
                //     break;
                // case 10:
                //     //REMOVE borrar un nodo
                //     System.out.println("\nIngresa el index");
                //     values = scanner.nextInt();
                //     doublelinkedList.remove(values);
                //     break;
                // case 11:
                //     doublelinkedList.reverse();
                //     System.out.println("La lista a sido invertida");
                //     break;
                case 12:
                    doublelinkedList.printList();
                    break;
                case 13:
                    System.out.println("Saliendo Del Menu");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (choice != 13);
    }
}
