public class Main {
    public static void main(String[] args) {
        System.out.println("Metodo adapter");
        ImpresoraNueva impNueva = new ImpresoraNueva();
        impNueva.print();
        ImpresoraVieja impVieja = new ImpresoraVieja();
        AdaptadorImpresora adaptador = new AdaptadorImpresora(impVieja);
        adaptador.print();
    }
}