package br.com.arthur;

public class TesteHeroina {
    public static void main(String[] args) {
        Heroina heroina1 = new Heroina("Hornet");
        System.out.printf("%s", heroina1.toString());
        heroina1.curar();
        heroina1.atacar(9);
        System.out.printf("%s", heroina1.toString());
        heroina1.receberDano(4);
        System.out.printf("%s", heroina1.toString());
        heroina1.curar();
        System.out.printf("%s", heroina1.toString());
        heroina1.receberDano(10);
        System.out.printf("%s", heroina1.toString());
        System.out.println("Derrotada? " + heroina1.estaDerrotada());
    }    
}