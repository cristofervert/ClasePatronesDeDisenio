public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Template");
        Bebida te = new Te();
        te.base();

        Bebida cafe = new Cafe();
        cafe.base();
    }
}