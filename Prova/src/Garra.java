public class Garra {
    private int pressao;

    public Garra(int pressao) {
        this.pressao = pressao;
    }

    public void agarrarPeca(){
        System.out.println("Peça padrão sendo agarrada!");
    }
    public void agarrarPeca(int posicao){
        System.out.println("Peça da posição " + posicao + " sendo agarrada!");
    }

    @Override
    public String toString() {
        return "Garra{" +
                "pressao=" + pressao +
                '}';
    }
}
