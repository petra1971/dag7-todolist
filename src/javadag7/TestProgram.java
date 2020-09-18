package javadag7;

import java.util.Scanner;

public class TestProgram {

    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList toDoList = new ToDoList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit) {
            System.out.print("Skriv in ditt val: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;

                case 1:
                    addItem();
                    break;

                case 2:
                    toDoList.printTodoList();
                    break;

                case 3:
                    searchTodoItem();
                    break;

                case 4:
                    modifyTodoItem();
                    break;

                case 5:
                    removeItem();
                    break;

                case 6:
                    quit=true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Välj: ");
        System.out.println("\t 0 - Visa alternativ");
        System.out.println("\t 1 - Lägg till uppgift");
        System.out.println("\t 2 - Skriv ut Att-göra-listan");
        System.out.println("\t 3 - Sök i Att-göra-listan");
        System.out.println("\t 4 - Ändra en uppgift");
        System.out.println("\t 5 - Ta bort en uppgift");
        System.out.println("\t 6 - Avsluta applikationen");
    }

    public static void addItem(){
        System.out.print("Vad vill du lägga till? ");
        toDoList.addTodoItem(scanner.nextLine());
    }
    public static void searchTodoItem(){
        System.out.print("Vilken uppgift letar du efter? ");
        String searchTodoItem = scanner.nextLine();
        if (toDoList.inTodoList(searchTodoItem)) {
            int position = toDoList.findTodoItem(searchTodoItem);
            System.out.println("uppgiften finns på plats " + (position+1));
        }
        else {
            System.out.println("Uppgiften finns inte");
        }
    }
    public static void modifyTodoItem(){
        System.out.print("Vilken uppgift vill du ändra? ");
        String modifyItem = scanner.nextLine();
        System.out.print("Uppdaterad uppgift: ");
        String newItem = scanner.nextLine();
        toDoList.modifyTodoItem(modifyItem, newItem);
    }

    public static void removeItem(){
        System.out.println("Vilken av alla uppgifter att göra vill du ta bort? ");
        String item = scanner.nextLine();
        toDoList.removeTodoItem(item);
    }

}
