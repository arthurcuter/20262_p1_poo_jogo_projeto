package br.com.arthur;

public class Heroina {
    private static final int MASCARAS_MAXIMAS_PADRAO = 5;
    private static final int MASCARAS_MINIMAS_PADRAO = 0;
    private static final int MASCARAS_PADRAO = 5;
    private static final int SEDA_MAXIMA_PADRAO = 9;
    private static final int SEDA_MINIMA_PADRAO = 0;
    private static final int SEDA_PADRAO = 0;

    private String nome;
    private int mascaras;
    private int seda;

    void atacar () {
        if(seda < 9) seda++;
        System.out.println(nome+" ataca com a agulha!");
    }

    void atacar (int vezes) {
        for(int i = 1; i <= vezes; i++) {
            atacar();
        }
    }

    void receberDano(int dano) {
        if((mascaras - dano) < 1) {
            mascaras = MASCARAS_MINIMAS_PADRAO;
        } else {
            mascaras -= dano;
        }
        System.out.println(nome + " recebeu "+dano+" de dano");
    }
    
    void curar() {
        if(seda == SEDA_MAXIMA_PADRAO) {
            if((mascaras + 3) > MASCARAS_MAXIMAS_PADRAO) {
                mascaras = MASCARAS_MAXIMAS_PADRAO;
            } else {
                mascaras += 3;
            }
            seda = SEDA_MINIMA_PADRAO;
            System.out.printf("%s se amarrou com seda e recuperou mascaras\n", nome);
        }
        System.out.println(nome+"nao tem seda suficiente para se curar");
    }

    boolean estaDerrotada() {
        if(mascaras == 0) {
            return true;
        }
        return false;
    }

    Heroina (String nome) {
        mascaras = MASCARAS_PADRAO;
        seda = SEDA_PADRAO;
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }
    
    public int getMascaras () {
        return mascaras;
    }

    public int getSeda () {
        return seda;
    }

    @Override 
    public String toString () {
        return String.format("%s | Mascaras: %d/%d | Seda: %d/%d", 
        nome, mascaras, MASCARAS_MAXIMAS_PADRAO, seda, SEDA_MAXIMA_PADRAO);
    }
    
}
