public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Facade");
        Motor m = new Motor();
        Alternador a = new Alternador();
        Luces l = new Luces();
        Carro c = new Carro(m,a,l);
        c.iniciarCarro();
        c.detenerCarro();
    }
}