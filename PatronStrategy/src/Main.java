public class Main {
    public static void main(String[] args) {

        System.out.println("PatronStrategy");
        CarroCompra carroCompra = new CarroCompra();
        carroCompra.setEstrategiaPago(new PagoPaypal("juan@gmail.com"));
        carroCompra.pagar(1000);

        carroCompra.setEstrategiaPago(new PagoTarjeta("4234-2132-2321-3132"));
        carroCompra.pagar(2000);
    }
}