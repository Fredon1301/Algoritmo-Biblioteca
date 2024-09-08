import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Ordenar por Título (Bubble Sort)");
            System.out.println("4. Ordenar por Autor (Quick Sort)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); 
                    lista.adicionar(new Livro(titulo, autor, ano));
                    break;
                case 2:
                    lista.listar();
                    break;
                case 3:
                    Ordenacao.bubbleSortTitulo(lista);
                    System.out.println("Lista ordenada por título.");
                    lista.listar();
                    break;
                case 4:
                    Ordenacao.quickSortAutor(lista);
                    System.out.println("Lista ordenada por autor.");
                    lista.listar();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
