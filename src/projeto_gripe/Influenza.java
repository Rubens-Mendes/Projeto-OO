package projeto_gripe;

public class Influenza extends Virus{
    private boolean celula;

    public Influenza(int cor, int xIni, int yIni) {
        setCor(cor);
        setX(xIni);
        setY(yIni);
    }

    public boolean estaNaCelula(int[][] mapa){
        if(mapa[getY()][getX()] == 2 || mapa[getY()][getX()] == 3 || mapa[getY()][getX()] == 4){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean colidiuLeucocito(int[][] mapa){
        if(mapa[getY()][getX()] == 6){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isCelula() {
        return celula;
    }

    public void setCelula(boolean celula) {
        this.celula = celula;
    }
}
