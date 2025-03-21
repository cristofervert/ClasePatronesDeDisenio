public class Factory {

    public Comida getInstance(String select){
        switch(select){
            case "a":
                return new Pizza();
            case "b":
                return new Taco();
            case "c":
                return new Ceviche();
            default:
                return null;
        }
    }
}
