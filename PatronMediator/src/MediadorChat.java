 public interface MediadorChat {
    void agregarUsuario(Usuario usuario);
    void enviarMensaje(String mensaje, Usuario usuario);
}
