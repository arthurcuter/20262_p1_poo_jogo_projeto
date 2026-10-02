package br.com.arthur;

import lombok.ToString;

public class TesteInimigo {
    public static void main(String[] args) {
        Inimigo inimigo1 = new Inimigo("Moss Mother", 12, 1);
        Inimigo inimigo2 = new Inimigo("Besouro Peregrino");
        Inimigo inimigo3 = new Inimigo("Inimigo Bugado", 50, 7);

        System.out.printf("%s\n%s\n%s\n", inimigo1.toString(), inimigo2.toString(), inimigo3.toString());

        while (inimigo2.estaDerrotado() == false) {
            inimigo2.receberGolpe();
        }
        System.out.printf("%s\nDerrotado? %s", inimigo2.toString(), inimigo2.estaDerrotado());  

    }
}
