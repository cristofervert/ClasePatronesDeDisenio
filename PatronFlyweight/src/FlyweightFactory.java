import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, PersonajeConcreto> personajes = new HashMap<>();

    public PersonajeConcreto getPersonaje(String tipo){
        PersonajeConcreto personaje = personajes.get(tipo);
        if(personaje == null){
            personaje = new PersonajeConcreto(tipo);
            personajes.put(tipo, personaje);
        }
        return personaje;
    }
}
