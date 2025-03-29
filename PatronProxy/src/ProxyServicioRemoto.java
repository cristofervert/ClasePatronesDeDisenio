public class ProxyServicioRemoto implements ServicioRemoto{

    private ServicioRemotoReal servicio;

    @Override
    public void conectarPagina(){

        if(servicio == null){
          System.out.println("Iniciando conexion");
          servicio = new ServicioRemotoReal();
        }
        servicio.conectarPagina();
    }

}
