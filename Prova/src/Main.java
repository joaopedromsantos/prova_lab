public class Main {
    public static void main(String[] args) {
        Camera camera_1 = new Camera(60);
        Camera camera_2 = new Camera(30);

        // Com câmera 1 vai encontrar peça pois a qualidade é maior que 50
        BracoArticulado bracoArticulado_1 = new BracoArticulado(
                90, "Starvin", 100,3, 40, camera_1
        );
        // Com câmera 2 não vai encontrar a peça por ser menos que 50
        BracoArticulado bracoArticulado_2 = new BracoArticulado(
                65, "Longt", 100,1, 20, camera_2
        );

        // Empilhador
        Empilhador empilhador_1 = new Empilhador(45, "Strong", 100,90);

        empilhador_1.adicionaPacote(20);
        empilhador_1.adicionaPacote(65);
        empilhador_1.adicionaPacote(30);
        empilhador_1.adicionaPacote(10);

        empilhador_1.removePacote(0);
        empilhador_1.mostraPacote();
        empilhador_1.trabalhar();

        // Braço Articulado
        bracoArticulado_1.trabalhar();
        bracoArticulado_1.trocarEnergia(bracoArticulado_2);

        bracoArticulado_2.trabalhar();
        bracoArticulado_2.recarregar(10);

        System.out.println(bracoArticulado_1);
        System.out.println(bracoArticulado_2);
        System.out.println(empilhador_1);

    }
}