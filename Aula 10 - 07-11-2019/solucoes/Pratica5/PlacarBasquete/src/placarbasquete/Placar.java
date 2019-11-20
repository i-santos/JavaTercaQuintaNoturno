package placarbasquete;

public class Placar {

    private int pontuacaoMandante;
    private int pontuacaoVisitante;
    private int faltasMandante;
    private int faltasVisitante;
    
    public Placar() {
        System.out.println("Instanciando um objeto da classe Placar");
        pontuacaoMandante = 0;
        pontuacaoVisitante = 0;
        faltasMandante = 0;
        faltasVisitante = 0;
    }
    
    public Placar(int pontuacaoMandante, 
            int pontuacaoVisitante, 
            int faltasMandante, 
            int faltasVisitante) 
    {
        this.pontuacaoMandante = pontuacaoMandante;
        this.pontuacaoVisitante = pontuacaoVisitante;
        this.faltasMandante = faltasMandante;
        this.faltasVisitante = faltasVisitante;
        
    }
    
    public void cesta2PontosMandante() {
        pontuacaoMandante += 2;
    }
    
    public void cesta3PontosMandante() {
        pontuacaoMandante += 3;
    }

    public void cesta2PontosVisitante() {
        pontuacaoVisitante += 2;
    }
    
    public void cesta3PontosVisitante() {
        pontuacaoVisitante += 3;
    }
    
    public void faltaDoMandante() {
        faltasMandante++;
    }
    
    public void faltaDoVisitante() {
        faltasVisitante++;
    }

    public int getPontuacaoMandante() {
        return pontuacaoMandante;
    }

    public void setPontuacaoMandante(int pontuacaoMandante) {
        this.pontuacaoMandante = pontuacaoMandante;
    }

    public int getPontuacaoVisitante() {
        return pontuacaoVisitante;
    }

    public void setPontuacaoVisitante(int pontuacaoVisitante) {
        this.pontuacaoVisitante = pontuacaoVisitante;
    }

    public int getFaltasMandante() {
        return faltasMandante;
    }

    public void setFaltasMandante(int faltasMandante) {
        this.faltasMandante = faltasMandante;
    }

    public int getFaltasVisitante() {
        return faltasVisitante;
    }

    public void setFaltasVisitante(int faltasVisitante) {
        this.faltasVisitante = faltasVisitante;
    }
    
    
}
