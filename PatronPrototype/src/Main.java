public class Main {
    public static void main(String[] args) {
        System.out.println("metodo prototype");
        Carro c = new Carro("Ford Fiesta", 4, 50.2F);
        // Carro c2 = new Carro(c.getNombre(), c.llantas, 50F);// reemplazamos esta copia por medio de la adicion de una interfaz
        System.out.printf("c = %s\n",c.toString());
        Carro c2 = c.clone();
        System.out.printf("c2 = %s\n",c2.toString());
    }
}