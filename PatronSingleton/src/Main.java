public class Main {
    public static void main(String[] args) {
        System.out.println("Creacion de instancia unica");
        Singleton r = Singleton.getInstance();
        System.out.printf("cuenta = %d\n",r.getCount()); // %d -> para digitos
        r.setCount();
        System.out.printf("cuenta = %d\n",r.getCount());
        Singleton s = Singleton.getInstance(); // no importa si tenemos dos
        System.out.printf("cuenta = %d\n",s.getCount()); // %d -> para digitos
        s.setCount();
        System.out.printf("cuenta = %d\n",s.getCount());

    }
}