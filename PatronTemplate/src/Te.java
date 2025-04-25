public class Te extends Bebida{

    @Override
    protected void brew(){
        System.out.println("Usando bolsa de te");
    }
    @Override
    protected void agregarAditivos(){
        System.out.println("Agregando miel");
    }
}
