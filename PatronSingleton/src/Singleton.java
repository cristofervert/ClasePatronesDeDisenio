public class Singleton {

    private static Singleton instance;
    private static int count;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }
    public int getCount(){
        return count;
    }
    public void setCount(){
        count++;
    }
}
