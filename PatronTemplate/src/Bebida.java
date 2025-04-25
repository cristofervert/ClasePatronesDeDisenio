public abstract class Bebida {

    public final void base(){
        hervirAgua();
        agrarrarCuchara();
        agrarrarTaza();
        brew();
        agregarAditivos();
        System.out.println();
    }
    protected void hervirAgua(){
        System.out.println("Hervir agua");
    }
    protected void agrarrarTaza(){
        System.out.println("Agarrando taza");
    }
    protected void agrarrarCuchara(){
        System.out.println("Agarrando cuchara");
    }

    protected abstract void brew();
    protected abstract void agregarAditivos();
}
