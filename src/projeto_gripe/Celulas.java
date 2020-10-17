package projeto_gripe;

public class Celulas {
    private int x, y, cor;
    
    public Celulas(){}

    public Celulas(int x, int y, int cor) {
        setX(x);
        setY(y);
        setCor(cor);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
}
