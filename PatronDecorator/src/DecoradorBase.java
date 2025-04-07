public class DecoradorBase implements NotificacionInterfaz{
    private final NotificacionInterfaz decorador;
    protected final String[] datos;

    public DecoradorBase(NotificacionInterfaz decorador){
        this.decorador = decorador;
        this.datos = new String[]{"128098","juan@gmail.com","juan_95"}; // base de datos?
    }
    @Override
    public String getUsername(){
        return decorador.getUsername();
    }
    @Override
    public void enviarMsg(String mensaje){
        decorador.enviarMsg(mensaje);
    }

}
