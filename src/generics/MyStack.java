package src.generics;

import java.util.ArrayList;

public class MyStack <T> {
    private ArrayList<T> stack;

    public MyStack(){
        this.stack = new ArrayList<>();
    }

    public void push(T item){
        this.stack.add(item);
    }

    public T pop() {
        if (this.stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null; // or throw an exception
        }
        // Remove the last element (top of the stack)
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (this.stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null; // or throw an exception
        }

        return this.stack.get(this.stack.size() - 1);
    }

    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
}
