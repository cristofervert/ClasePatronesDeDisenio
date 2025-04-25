public class CarroCompra {
    private EstrategiaPago estrategiaPago;

    public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }
    public void pagar(int monto){
        if(estrategiaPago == null){
            try {
                throw new Exception("Metodo de pago ausente");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        estrategiaPago.pagar(monto);
    }
}
