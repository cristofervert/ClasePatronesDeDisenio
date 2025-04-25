import java.util.ArrayList;

public class MediadorChatroom implements MediadorChat{
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    @Override
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    @Override
    public void enviarMensaje(String mensaje, Usuario envia){
        for(Usuario usuario: usuarios){
            if(usuario != envia){
                usuario.recibir(mensaje);
            }
        }
    }
}
