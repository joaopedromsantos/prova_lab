import java.util.Arrays;

public class Empilhador extends Robo{
    private Pacote[] pacotes = new Pacote[20];
    private int pesoMaximo;
    private boolean proibidoCriacao = false;

    public Empilhador(int energia, String nome, int energiaMaxima, int pesoMaximo) {
        super(energia, nome, energiaMaxima);
        this.pesoMaximo = pesoMaximo;
    }

    public void adicionaPacote(int peso){
        if(!proibidoCriacao){
            int soma = 0;
            for (Pacote pacote : pacotes) {
                if (pacote != null) {
                    soma += pacote.getPeso();
                }
            }
            if(peso + soma <= pesoMaximo){
                for(int i=0; i < pacotes.length; i++){
                    if(pacotes[i] == null){
                        pacotes[i] = new Pacote(peso);
                        break;
                    }
                }
            } else {
                proibidoCriacao = true;
                System.out.println("Peso máximo atingido! Adicionar peças foi proibido");
            }
        }
    }
    public void removePacote(int posicao){
        pacotes[posicao] = null;
    }
    public void mostraPacote(){
        for(int i=0; i < pacotes.length; i++){
            if(pacotes[i] != null){
                System.out.println(pacotes[i]);
            }
        }
    }

    @Override
    public String toString() {
        return
                "\nEmpilhador{" +
                "\npacotes=" + Arrays.toString(pacotes) +
                "\npesoMaximo=" + pesoMaximo +
                "\nproibidoCriacao=" + proibidoCriacao +
                super.toString() +
                '}';
    }
}
