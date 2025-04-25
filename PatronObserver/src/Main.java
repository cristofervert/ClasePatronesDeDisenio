public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Observer");
        ServidorCorreo servidor = new ServidorCorreo();
        Observador emp1 = new Empleado("Juan");
        Observador emp2 = new Empleado("Ana");
        Observador emp3 = new Empleado("Lucas");
        servidor.conectar(emp1);
        servidor.conectar(emp2);
        servidor.conectar(emp3);
        servidor.recibirCorreo("Junta: 11 de abril");
        servidor.desconectar(emp3);
        servidor.recibirCorreo("Proyecto: 30 de abril");
    }
}