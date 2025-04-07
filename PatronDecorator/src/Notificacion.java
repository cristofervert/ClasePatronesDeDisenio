public class Notificacion implements NotificacionInterfaz{
    private final String username;
    protected final String[] datos;

    public Notificacion(String username){
        this.username = username;
        this.datos = new String[]{"128098","juan@gmail.com"}; // base de datos?
    }
    @Override
    public String getUsername(){
        return username;
    }
    @Override
    public void enviarMsg(String mensaje){
        System.out.printf("Enviando %s a %s\n",mensaje, datos[1]);
    }
}
