public class BracoArticulado extends Robo{
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int energia, String nome, int energiaMaxima, int numeroDeArticulacoes, int pressaoGarra, Camera camera) {
        super(energia, nome, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        this.garra = new Garra(pressaoGarra);
        this.camera = camera;
    }

    @Override
    public void trabalhar(){
        if(camera != null){
            if (camera.getQualidade() >= 50){
                garra.agarrarPeca(camera.acharPecas());
            } else {
                garra.agarrarPeca();
            }
        }
    }

    @Override
    public String toString() {
        return "\nBracoArticulado{" +
                "\nnumeroDeArticulacoes=" + numeroDeArticulacoes +
                "\ngarra=" + garra +
                "\ncamera=" + camera +
                super.toString() +
                '}';
    }
}
