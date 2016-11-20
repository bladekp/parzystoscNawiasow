package pl.edu.pw.ee.zadanie2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stos {
    
    private Deque<Character> stos = new ArrayDeque<>();
    
    public Character pop(){
        return stos.pollFirst();
    }
    
    public void push(Character element){
        stos.offerFirst(element);
    }
    
    public int size(){
        return stos.size();
    }
    
}
