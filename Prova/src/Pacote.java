public class Pacote {
    private int peso;

    public int getPeso() {
        return peso;
    }

    public Pacote(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "peso=" + peso +
                '}';
    }
}
