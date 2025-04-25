public class UsuarioChat extends Usuario {
    public UsuarioChat(MediadorChat chat, String nombre){
        super(chat, nombre);
    }
    @Override
    public void enviar(String mensaje){
        System.out.printf("%s> %s\n", this.nombre, mensaje);
        chat.enviarMensaje(mensaje, this);
    }
    @Override
    public void recibir(String mensaje){
        System.out.printf("%s recibiendo %s\n", this.nombre, mensaje);
    }
}
