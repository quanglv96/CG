package DSA_stack.reverse;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<E> {
    private LinkedList<E> stack;
    public MyStack(){
        stack=new LinkedList();
    }
    public void push(E element){

        stack.addLast(element);
    }
    public E pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }else{
            return false;
        }
    }

    public void get(int i) {
        System.out.println(stack.get(i));
    }
}
