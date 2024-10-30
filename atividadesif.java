package atividadesif;

import java.util.Scanner;

/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.*/

public class atividadesif {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

        int a, b, c, soma;

        System.out.println("Digite um valor para a variavel A: ");
        a = ler.nextInt();

        System.out.println("Digite um valor para a variavel B: ");
        b = ler.nextInt();

        System.out.println("Digite um valor para a variavel C: ");
        c = ler.nextInt();

        soma = a+b;

        if (soma > c) {
            System.out.println("A soma entre os valores A e B é maior que o número armazena na variavel C");

             } else {
            System.out.println("A soma entre os valores A e B é inferior ao número armazenado na variavel C ");
        }
	}

}
