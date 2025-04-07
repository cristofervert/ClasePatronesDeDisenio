import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Patron Flyweight");
        FlyweightFactory f = new FlyweightFactory();
        PersonajeConcreto p1 = f.getPersonaje("Mago");
        PersonajeConcreto p2 = f.getPersonaje("Barbaro");
        p1.mostrarPos(new int[]{1,0});
        p2.mostrarPos(new int[]{5,3});
        PersonajeConcreto p3 = f.getPersonaje("Mago");
        p3.mostrarPos(new int[]{9,2});

        /*
        HashMap<String,String> ejemplo = new HashMap<>();
        ejemplo.put("hola","hello");
        ejemplo.put("adios","goodbye");
        ejemplo.put("uno","one");
        System.out.println(ejemplo);
        System.out.println(ejemplo.size());
        ejemplo.remove("hola");
        System.out.println(ejemplo);
        System.out.print(ejemplo.get("adios"));*/
    }
}