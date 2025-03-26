public class LinuxFactory implements AbstractFactory{
    @Override //anotacion
    public Audio procesarAudio(){
        return new LinuxAudio();
    }
    @Override
    public Imagen procesarImagen(){
        return new LinuxImagen();
    }
}
