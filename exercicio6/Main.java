import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Agenda agenda = new Agenda();
        List<Contato> contatos = new ArrayList<Contato>();

        int opcao;

        do {
            System.out.println("\n1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar contato por nome");
            System.out.println("4. Sair");

            System.out.print("Selecione uma opção: ");
            opcao = leitor.nextInt();

            leitor.nextLine();

            switch (opcao) {
                case 1:
                    agenda.adicionarContato(contatos);
                    break;
                case 2:
                    agenda.removerContato(contatos);
                    break;
                case 3:
                    agenda.buscarContato(contatos);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}

