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
