public class Main {
    public static void main(String[] args) {
        Model m = DB_rancia();
        View v = new View();
        Controller c = new Controller(m,v);
        c.updateView();
        c.setControllerData("perro");
        c.updateView();
    }

    public static Model DB_rancia(){ // para simular MVC real
        Model m = new Model();
        m.setId(12);
        m.setData("changos");
        return m;
    }
}