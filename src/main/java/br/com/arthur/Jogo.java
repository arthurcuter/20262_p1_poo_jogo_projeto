package br.com.arthur;
import java.util.Scanner;
import java.lang.Thread;
import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        System.out.println("=================================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG      ");
        System.out.println("      edicao POO em Java         ");
        System.out.println("=================================");
        System.out.println("Carregando save de "+nome+"...");

        Heroina heroina1 = new Heroina("Hornet");

        System.out.printf("%s\n", heroina1.toString());

        Inimigo inimigo1 = new Inimigo("Moss Mother", 12, 1);

        int opcao;
        int turnos = 1;
        do {
            System.out.printf("========== Turno %d ==========\n", turnos);
            System.out.printf("%s", heroina1.toString());
            System.out.println(inimigo1.toString());
            System.out.println("1-Atacar 2-Curar 0-Fugir");
            System.out.printf("Escolha: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    heroina1.atacar();
                    inimigo1.receberGolpe();
                    break;
                case 2:
                    heroina1.curar();
                    break;
                case 0:
                    System.out.println(nome + " fugiu da batalha.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            if(turnos % 3 == 0 && inimigo1.estaDerrotado() == false && opcao != 0) {
                System.out.println(inimigo1.getNome() + " ataca!");
                heroina1.receberDano(inimigo1.getDano());
            }

            turnos++;

            Thread.sleep(1000);

        } while (opcao != 0 && inimigo1.estaDerrotado() == false && heroina1.estaDerrotada() == false);

        if(inimigo1.estaDerrotado() == true) {
            System.out.println("Vitoria sobre " + inimigo1.getNome());
        } else {
            System.out.println("Fim de jogo.");
        }
        System.out.println(heroina1.toString());


        leitor.close();
    }
    
}
