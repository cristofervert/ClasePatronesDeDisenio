public class Main {
    public static void main(String[] args) {

        System.out.println("Patron Decorator");
        NotificacionInterfaz n = new DecoradorWhatsapp(
                new DecoradorInstagram(
                        new Notificacion("Juan")
                )
        );
        n.enviarMsg("hola sdfsadf");
    }
}