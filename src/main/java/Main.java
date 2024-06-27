// Integrantes do grupo:
//
// João Paulo Ferreira Gomes - 2415050023
// Letícia Farias de Assis Arruda - 2415050016
// Giusepp de Couto Barros Júnior - 24150500XX
// Júlia Shiguemi Tanaka - 2415050022
// Julliane dos Santos de Sousa - 2415050001

package main.java;
import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Manifestacao> manifestacoes = new ArrayList<Manifestacao>();
		int opcaoDigitada = -1;
		while (opcaoDigitada != 7) {
			System.out.println("\n Bem vindo ao canal da Ouvidoria! \n");

			System.out.println("\n O que você deseja fazer? \n");

			System.out.println(
					"\n 1) Listar Manifestações: \n 2) Listagem de Manifestações por Tipo: \n 3) Criar uma nova Manifestação:  \n 4) Exibir quantidade de manifestações: \n 5) Pesquisar uma manifestação por código: \n 6) Excluir uma Manifestação pelo Código: \n 7) Sair do Sistema \n");

			opcaoDigitada = scanner.nextInt();
			scanner.nextLine();

			System.out.println("\n A opção escolhida foi: \n" + opcaoDigitada);

			// 1)ListagemdasManifestações
			if (opcaoDigitada == 1) {
				if (manifestacoes.isEmpty()) {
					System.out.println(" \n Não existem manifestações cadastradas!\n");
					
				} else {
					for (Manifestacao manifestacao : manifestacoes) {
						System.out.println("\n Suas manifestações registradas em sistema:\n " + manifestacao);
					}
				}
			}
			// 2) Listagem de Manifestações por Tipo
			if (opcaoDigitada == 2) {
				System.out.println(
						" Qual o tipo de manifestação você deseja buscar? \n 1) Reclamação \n 2)Elogio \n 3) Sugestão \n");
				int tipo = scanner.nextInt();

				if (tipo == 1) {
					for (Manifestacao manifestacao : manifestacoes) {
						if (manifestacao.getTipo().equals(TipoManifestacao.RECLAMACAO)) {
							System.out.println(manifestacao);
						}
					}

				} else if (tipo == 2) {
					for (Manifestacao manifestacao : manifestacoes) {
						if (manifestacao.getTipo().equals(TipoManifestacao.ELOGIO)) {
							System.out.println(manifestacao);
						}
					}
				} else if (tipo == 3) {
					for (Manifestacao manifestacao : manifestacoes) {
						if (manifestacao.getTipo().equals(TipoManifestacao.SUGESTAO)) {
							System.out.println(manifestacao);
						}
					}
				} else {
					System.out.println(" Opção Inválida!");
				}
			}
			// 3) Criar uma nova Manifestação
			else if (opcaoDigitada == 3) {

				System.out.println(" Digite seu nome:");
				String nome = scanner.nextLine();

				System.out.println(" Digite sua Descrição:");
				String novaDescricao = scanner.nextLine();

				System.out.println(
						" Qual o tipo de manifestação você deseja abrir? \n 1) Reclamação \n 2)Elogio \n 3) Sugestão \n");
				int tipo = scanner.nextInt();

				SecureRandom rand = new SecureRandom();
				int codigo = rand.nextInt(1, Integer.MAX_VALUE);

				if (tipo == 1) {
					Manifestacao man = new Manifestacao();
					man.setTipo(TipoManifestacao.RECLAMACAO);
					man.setNome(nome);
					man.setCodigo(codigo);
					man.setDescricao(novaDescricao);
					manifestacoes.add(man);
					System.out.println(" Nova manifestação criada com sucesso!");

				} else if (tipo == 2) {
					Manifestacao man = new Manifestacao();
					man.setTipo(TipoManifestacao.ELOGIO);
					man.setNome(nome);
					man.setCodigo(codigo);
					man.setDescricao(novaDescricao);
					manifestacoes.add(man);
					System.out.println(" Nova manifestação criada com sucesso!");

				} else if (tipo == 3) {
					Manifestacao man = new Manifestacao();
					man.setTipo(TipoManifestacao.SUGESTAO);
					man.setNome(nome);
					man.setCodigo(codigo);
					man.setDescricao(novaDescricao);
					manifestacoes.add(man);
					System.out.println(" Nova manifestação criada com sucesso!");
				} else {
					System.out.println(" Opção Inválida!");
				}

				// 4)Exibirquantidadedemanifestações
			} else if (opcaoDigitada == 4) {
				System.out.println(" A quantidade de manifestações é: " + manifestacoes.size());
			}

			// 5)Pesquisarumamanifestaçãoporcódigo
			else if (opcaoDigitada == 5) {
				System.out.println(" Digite o código:");
				int codigo = scanner.nextInt();
				Manifestacao man = null;
				for (Manifestacao manifestacao : manifestacoes) {
					if (manifestacao.getCodigo() == codigo) {
						man = manifestacao;
					}
				}
				if (man == null) {
					System.out.println("\n Não existe manifestação com esse código");
				} else {
					System.out.println(man);
				}
				
				//6)ExcluirumaManifestaçãopeloCódigo
			} else if (opcaoDigitada == 6) {
				System.out.println("\n Digite o código que deseja remover:");
				int codigo = scanner.nextInt();

				boolean excluido = manifestacoes.removeIf(manifestacao -> manifestacao.getCodigo() == codigo);
				if (excluido) {
					System.out.println("\n Manifestação excluída com sucesso");
				} else {
					System.out.println("\n Código inexistente");
				}
			} else {
				System.out.println("\n Obrigado por utilizar nosso canal da Ouvidoria, volte sempre!");
			}
		}
		 scanner.close();
	}
}
