package javadag7;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> toDoList = new ArrayList<String>();

    public void addTodoItem(String item) {
        toDoList.add(item);
    }

    public void printTodoList(){
        System.out.println("Du har " + toDoList.size() + " saker på din Att-göra-lista");
        for(int i = 0; i < toDoList.size(); i++){
            System.out.println(i+1 + ": " + toDoList.get(i));
        }
    }

    public int findTodoItem(String item) {
        return toDoList.indexOf(item);
    }

    public boolean inTodoList(String item){
        int position = findTodoItem(item);
        if(position >= 0){
            return true;
        }
        return false;
    }

    public void modifyTodoItem(String item, String newItem){
        int position = findTodoItem(item);
        if(position >= 0){
            modifyTodoItem(position, newItem);
        }
    }

    public void modifyTodoItem(int position, String newItem){
        toDoList.set(position, newItem);
        System.out.println("Uppgiften på " + (position+1) + " på din att-göra-lista är ändrad ");
    }

    public void removeTodoItem(String item) {
        int position = findTodoItem(item);
        if (position >= 0) {
            removeTodoItem(position);
        }
    }

    public void removeTodoItem(int position){
        toDoList.remove(position);
        System.out.println("uppgiften på " + (position+1) + " på din att-göra-lista är borttagen");
    }
}
