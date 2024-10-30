package atividadesif;

import java.util.Scanner;

public class atividadeif2 {
	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int valor1;

        System.out.println("Digite um número: ");
        valor1 = ler.nextInt();

        if (valor1 % 2 == 0) {
            System.out.println("Esse número é par!");
        } else if (valor1 % 2 == 1) {
            System.out.println("Esse número é impar!");
        } else if (valor1 < 0) {
            System.out.println("Esse número é negativo!");
            
        }
	}
}
