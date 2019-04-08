package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable{
    private Stack<SomeType> myStack = new Stack<>();

    public MyStack() {
        //throw new UnsupportedOperationException("Method not yet implemented");
        this.myStack = myStack;
    }

    public Boolean isEmpty() {
        return myStack.size() == 0;
    }

    public void push(SomeType i) {
        myStack.add(i);
    }

    public SomeType peek() {
        return myStack.firstElement();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {
        if(myStack.size() != 0){
        return myStack.remove(myStack.size() - 1);
        }
        throw new EmptyStackException();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
