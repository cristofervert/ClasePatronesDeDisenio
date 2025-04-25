public class Cafe extends Bebida{

    @Override
    protected void brew(){
        System.out.println("No usando bolsa");
    }
    @Override
    protected void agregarAditivos(){
        System.out.println("Agregando leche");
    }
}
