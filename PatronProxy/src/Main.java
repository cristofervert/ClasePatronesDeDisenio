public class Main {
    public static void main(String[] args) {
        System.out.println("Patron proxy");
        ServicioRemoto servicio = new ProxyServicioRemoto();
        servicio.conectarPagina();
        servicio.conectarPagina();
    }
}