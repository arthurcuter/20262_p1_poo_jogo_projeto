package br.com.arthur;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString 
public class Inimigo {
    private static final int VIDA_PADRAO = 10;
    private static final int VIDA_MINIMA_PADRAO = 0;
    private static final int VIDA_MAXIMA_PADRAO = 20;
    private static final int DANO_PADRAO = 1;
    private static final int DANO_MINIMO_PADRAO = 1;
    private static final int DANO_MAXIMO_PADRAO = 2;
    
    private String nome;
    private int vida;
    private int dano;

    public Inimigo(String nome, int vida, int dano) {
        if(vida >= 1 && vida <= 20) {
            this.vida = vida;
        } else {
            this.vida = VIDA_PADRAO;
        }
        if (dano >= 1 && dano <= 2) {
            this.dano = dano;
        } else {
            this.dano = DANO_PADRAO;
        }
        this.nome = nome;
    }

    public Inimigo(String nome) {
        this(nome, VIDA_PADRAO, DANO_PADRAO);
    }
    
    void receberGolpe() {
        if(vida > 0) {
            vida--;
        } else {
            vida = VIDA_MINIMA_PADRAO;
        }
        System.out.println(nome +" recebeu 1 de dano.");
    }

    boolean estaDerrotado() {
        if(vida == 0) return true;
        return false;
    }
    
}
