package projeto_gripe;

import java.util.Random;

public class Virus {
    private int velocidade = 1, cor, x , y, passo;
    private Random ran = new Random();
    
    public Virus(){}

    public Virus(int velocidade, int cor, int xIni, int yIni) {
        setVelocidade(velocidade);
        setCor(cor);
        setX(xIni);
        setY(yIni);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
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
    
    public void mover(){
        int x = getX() ,y = getY();
        
        passo = ran.nextInt(3);
        if(passo == 0){
            setX(x += velocidade);
            setY(y);
            verificaBorda(x,y);
        }
        else if(passo == 1){
            setY(y += velocidade);
            setX(x);
            verificaBorda(x,y);
        }
        else if(passo == 2){
            setX(x -= velocidade);
            setY(y);
            verificaBorda(x,y);
        }
        else if(passo == 3){
            setY(y -= velocidade);
            setX(x);
            verificaBorda(x,y);
        }
    }
    
    public void verificaBorda(int x, int y){
        if(x > 59){
            setX(0);
        }
        else if(x < 0){
            setX(59);
        }
        
        if(y > 29){
            setY(0);
        }
        else if(y < 0){
            setY(29);
        }
    }
}
