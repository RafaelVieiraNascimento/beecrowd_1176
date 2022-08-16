package program;

/*
beecrowd | 1176 - Fibonacci em Vetor

Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido.
Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo
é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem
caber em um inteiro de 64 bits sem sinal.

Entrada
A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso
de teste contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.

Saída
Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (T != 0) {
			
			long aux1 = 0;
			long aux2 = 1;
			long aux3 = 0;

			int N = sc.nextInt();
			
			for (int i = 0; i < N; i++) {
					aux3 = aux2;
					aux2 = aux1 + aux2;
					aux1 = aux3;
			}
			System.out.printf("Fib(%d) = %d\n",N ,aux3);
			T--;
		}
		sc.close();
	}
}