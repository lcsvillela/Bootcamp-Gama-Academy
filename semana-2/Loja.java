package lojaWipro;

import java.util.Scanner;

public class Loja {

	static void exibirMenu(String[] produtos, double[] precos, int[] codigos, int[] estoques) {

		System.out.println("CÓDIGO  PRODUTO  QNTD. PRODUTOS  PRECO UNIT.");
		System.out.println("===============================================");

		for (int i = 0; i < produtos.length; i++) {

			//System.out.println("  " + codigos[i] + "\t" + produtos[i] + "\t     " + estoques[i] + "\t\t  " + precos[i]);
			System.out.printf("  %d \t %s\t\t %d\t\t  %.2f\n",codigos[i],produtos[i],estoques[i],precos[i]);

		}
		System.out.println("===============================================");
		System.out.println("Informe o código do produto desejado:");

	}

	public static void main(String[] args) {

		String[] produtos = { "Ovo", "Carne", "Açucar","Azeite","Mamão", "Banana","Limão","Batata","Goiaba","Carne" };
		double[] precos = { 10.20, 15.25, 2.00, 3.50, 4.00, 12.00, 8.50, 7.50, 6.50, 8.99};
		int[] codigos = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		int[] estoques = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int[][] carrinho = new int[10][2];
		char continuar = 's';
		int codigo = 0;
		int quantidade = 0;
		double valorTotal = 0.00;
		int opcao = 0;
		boolean opcaoInvalida = true;

		Scanner scanner = new Scanner(System.in);

		do {

			exibirMenu(produtos, precos, codigos, estoques);

			codigo = scanner.nextInt();

			if (codigo <= 10) {
				
				System.out.println("Digite a quantidade desejada do produto " + produtos[codigo - 1] + ":");
				quantidade = scanner.nextInt();

				if (estoques[codigo - 1] >= quantidade) {

					System.out.printf(quantidade + " un. de " + produtos[codigo - 1] + " foi adicionado ao carrinho!\n");
					estoques[codigo - 1] = estoques[codigo - 1] - quantidade;
			
					carrinho[codigo - 1][0] = codigo;
					carrinho[codigo - 1][1] += quantidade;

				} else {
				  System.out.println("Não temos essa quantidade do produto escolhido!");	
				}

				System.out.println("Deseja continuar a compra? S/N");

				continuar = scanner.next().charAt(0);

				System.out.println(Character.toLowerCase(continuar));

				while (Character.toLowerCase(continuar) != 'n' && Character.toLowerCase(continuar) != 's') {
					System.out.println("Opção Inválida! ");
					System.out.println("Deseja continuar a compra? S/N");
					continuar = scanner.next().charAt(0);
				}

			} else {
				
				System.out.println("Valor Inválido");
			}

		} while (continuar != 'n');

		System.out.println("==================================================================");
		System.out.println("Itens no carrinho");
		System.out.println("Código\t "+ "Produto\t" + "Quantidade\t" + "Preco Unitário\t" + "Preço Total\t");

		for (int i = 0; i < 10; i++) {

			if (carrinho[i][0] > 0) {

				System.out.println("  " + carrinho[i][1]+ "\t" +produtos[i] + "\t  " + carrinho[i][1] + "\t\t" + precos[i] + "\t\t"
						+ (precos[i] * carrinho[i][1]));

				valorTotal += (precos[i] * carrinho[i][1]);
			}
		}

		valorTotal = valorTotal * 1.09;

		do {

			System.out.println("==================================================================");
			System.out.printf("\nO valor total com imposto é %.2f Reais",valorTotal);
			System.out.println("\n\n==================================================================");
			System.out.println("\n[1] À Vista em dinheiro no cartão Mastercard, recebe 20% de desconto");
			System.out.println("[2] À Vista no cartão Mastercard, recebe 15% de desconto");
			System.out.println("[3] Duas vezes sem juros");
			System.out.println("[4] Em três vezes, 10% juros");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				valorTotal *= 0.8;
				opcaoInvalida = false;
				break;
			case 2:
				valorTotal *= 0.85;
				opcaoInvalida = false;
				break;
			case 3:
				opcaoInvalida = false;
				break;
			case 4:
				opcaoInvalida = false;
				valorTotal *= 1.1;
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}

		} while (opcaoInvalida);

		System.out.println("==================================================================");
		System.out.printf("Foi pago o valor de %.2f Reais\n",valorTotal);
		System.out.println("==================================================================");


		scanner.close();

	}

}

