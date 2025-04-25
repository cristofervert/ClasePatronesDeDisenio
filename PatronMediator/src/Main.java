public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Mediador");
        MediadorChat chat = new MediadorChatroom();
        Usuario u1 = new UsuarioChat(chat, "Ana");
        Usuario u2 = new UsuarioChat(chat, "Juan");
        Usuario u3 = new UsuarioChat(chat, "Lucas");

        chat.agregarUsuario(u1);
        chat.agregarUsuario(u2);
        chat.agregarUsuario(u3);

        u1.enviar("hola a todos");
        u2.enviar("hola!");
        u3.enviar(":)");
    }
}