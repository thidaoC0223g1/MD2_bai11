package deploystack;

import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {

        stack = new LinkedList();
    }

    public void push(T data) {
        stack.addFirst(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }
}
