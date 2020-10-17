package projeto_gripe;

import java.util.Date;
import java.util.Random;

public class Leucocitos extends Celulas{
    private int velocidade = 1, passo;
    private int nascimento;
    
    private Random ran = new Random();
    private Date data = new Date();

    public Leucocitos(int nascimento, int cor, int xIni, int yIni) {
        setNascimento(nascimento);
        setCor(cor);
        setX(xIni);
        setY(yIni);
    }
    
    public void mover(){
        int x = getX() ,y = getY();
        passo = ran.nextInt(8);
        if(passo == 0){
            setX(x += velocidade);
            setY(y);
        }
        else if(passo == 1){
            setX(x -= velocidade);
            setY(y);
        }
        else if(passo == 2){
            setY(y += velocidade);
            setX(x);
        }
        else if(passo == 3){
            setY(y -= velocidade);
            setX(x);
        }
        else if(passo == 4){
            setX(x += velocidade);
            setY(y += velocidade);
        }
        else if(passo == 5){
            setX(x -= velocidade);
            setY(y -= velocidade);
        }
        else if(passo == 6){
            setX(x += velocidade);
            setY(y -= velocidade);
        }
        else if(passo == 7){
            setX(x -= velocidade);
            setY(y += velocidade);
        }
        verificaBorda(x,y);
    }
    
    public void verificaBorda(int xAtual, int yAtual){
        if(xAtual > 59){
            setX(0);
        }
        else if(xAtual < 0){
            setX(59);
        }
        if(yAtual > 29){
            setY(0);
        }
        else if(yAtual < 0){
            setY(29);
        }
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }
}
