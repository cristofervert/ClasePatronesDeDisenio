public class DecoradorInstagram extends DecoradorBase{
    public DecoradorInstagram(NotificacionInterfaz ni){
        super(ni);
    }

    @Override
    public void enviarMsg(String mensaje){
        super.enviarMsg(mensaje);
        System.out.printf("Enviando %s a %s\n",mensaje, datos[2]);
    }
}


