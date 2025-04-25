public interface Sujeto {
    void conectar(Observador observador);
    void desconectar(Observador observador);
    void notificar();
}
