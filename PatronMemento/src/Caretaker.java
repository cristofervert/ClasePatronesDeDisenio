import java.util.Stack;

public class Caretaker {
    public Stack<Memento> mementoStack = new Stack<>();

    public void save(Memento memento){
        mementoStack.push(memento);
    }
    public Memento restore(){
        if(mementoStack.isEmpty()){
            throw new RuntimeException("No hay estados previos");
        }
        return mementoStack.pop(); // LIFO
    }
}
