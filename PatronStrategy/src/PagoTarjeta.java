public class PagoTarjeta implements EstrategiaPago{
    private String numeroTarjeta;

    public PagoTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(int monto){
        System.out.printf("Pago %d por medio de tarjeta: %s\n", monto, numeroTarjeta);
    }
}
