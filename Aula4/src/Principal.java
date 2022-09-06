import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Livro liv = new Livro();
		Dvd dvd = new Dvd();
		Biblioteca biblioteca = new Biblioteca();
		int opcao = 0;
		System.out.println("Escolha uma opção para cadastrar (1- Livro || 2- DVD || 3- Imprimir || 4- sair): ");
		opcao = entrada.nextInt();
		
		while(opcao !=  4) {
			switch (opcao) {
			case 1:
				System.out.println("Você escolheu cadastrar um livro!!!: ");
				liv = new Livro();
				System.out.println("Informe o titulo do livro: ");
				liv.setTitulo(entrada.next());
				System.out.println("Informe o preço do livro: ");
				liv.setPreco(entrada.nextDouble());
				biblioteca.adicionaItem(liv);
				break;
			case 2:
				System.out.println("Você escolheu cadastrar um DVD!!!: ");
				dvd = new Dvd();
				System.out.println("Informe a duração do DVD: ");
				dvd.setDuracao(entrada.nextInt());
				biblioteca.adicionaItem(dvd);
				break;
			case 3:
				biblioteca.imprimir();
				break;
			default:
				System.out.println("Voce digitou um numero invalido!! ");
			}
			
		
			System.out.println("Escolha uma opção para cadastrar (1- Livro || 2- DVD || 3- Imprimir || 4- sair): ");
			opcao = entrada.nextInt();
		}
	}

}
