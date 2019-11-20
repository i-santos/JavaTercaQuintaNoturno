package placarbasquete;


public class PlacarBasquete {

    public static void main(String[] args) {

        Placar placar = new Placar();
        Placar placar2 = new Placar(1, 1, 1, 1);
        Placar placar3 = new Placar();
        
        // Simulação do jogo
        placar.cesta2PontosMandante();
        placar.cesta2PontosMandante();
        placar.cesta3PontosVisitante();
        placar.faltaDoMandante();
        placar.faltaDoVisitante();
        
        // Mostrar placar final
        System.out.println("Mandante:");
        System.out.println("\tFaltas: " + placar.getFaltasMandante());
        System.out.println("\tPontos: " + placar.getPontuacaoMandante());
        System.out.println("Visitante:");
        System.out.println("\tFaltas: " + placar.getFaltasVisitante());
        System.out.println("\tPontos: " + placar.getPontuacaoVisitante());
        
    }

}
