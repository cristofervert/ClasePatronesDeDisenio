public abstract class Usuario {

    protected MediadorChat chat;
    protected String nombre;

    public Usuario(MediadorChat chat, String nombre){
        this.chat = chat;
        this.nombre = nombre;
    }
    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}
