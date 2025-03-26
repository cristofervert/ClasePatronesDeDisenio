public class WindowsFactory implements AbstractFactory{
    @Override //anotacion
    public Audio procesarAudio(){
        return new WindowsAudio();
    }
    @Override
    public Imagen procesarImagen(){
        return new WindowsImagen();
    }
}
