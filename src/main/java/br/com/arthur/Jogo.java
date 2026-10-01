package br.com.arthur;
import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        System.out.println("=================================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG      ");
        System.out.println("      edicao POO em Java         ");
        System.out.println("=================================");
        System.out.println("Carregando save de "+nome+"...");

        Heroina heroina1 = new Heroina("Hornet");

        System.out.printf("%s\n", heroina1.toString());

    }
    
}
