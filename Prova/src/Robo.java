public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos;
    private int energiaMaxima;

    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
        totalDeRobos += 1;
    }


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }


    public void trabalhar(){
        energia = energia - 8;
    };
    public void trocarEnergia(Robo roboAlvo){
        int valorTroca = energia - (100 - roboAlvo.getEnergia());
        if(valorTroca < 0){
            roboAlvo.setEnergia(roboAlvo.getEnergia() + (100 - roboAlvo.getEnergia() + valorTroca));
            energia = 0;
        } else {
            roboAlvo.setEnergia(roboAlvo.getEnergia() + (100 - roboAlvo.getEnergia()));
            energia = valorTroca;
        }
    };
    public void recarregar(int horas){
        //Recarrega 10 de energia por hora
        energia = energia + (horas*10);
        if(energia > 100){
            energia = 100;
        }
    };

    @Override
    public String toString() {
        return  "\nenergia=" + energia +
                "\nnome='" + nome +
                "\nenergiaMaxima=" + energiaMaxima ;
    }
}
