import java.util.List;
import java.util.ArrayList;

public class Composito implements Figura{

    private List<Figura> figuras = new ArrayList<>();

    public void agregar(Figura f){
        figuras.add(f);
    }
    public void eliminar(Figura f){
        figuras.remove(f);
    }
    @Override
    public void dibujar(){
        for(Figura f: figuras){
            f.dibujar();
        }
    }
}
