package br.com.elisafa;

public class Programa {

    public static void main(String[] args) {
        calcularMedia();

    }

    public static void calcularMedia(){
        double nota1 = 10;
        double nota2 = 8;
        double nota3 = 7.5;
        double nota4 = 6.6;

        double somanotas = nota1 + nota2 + nota3 + nota4;
        double media = somanotas / 4;

        System.out.println("A media das notas é: " + media);

    }
}
