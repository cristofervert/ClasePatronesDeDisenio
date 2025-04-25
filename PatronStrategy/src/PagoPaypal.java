public class PagoPaypal implements EstrategiaPago{
    private String correo;

    public PagoPaypal(String correo){
        this.correo = correo;
    }

    @Override
    public void pagar(int monto){
        System.out.printf("Pago %d por medio de paypal: %s\n", monto, correo);
    }
}
