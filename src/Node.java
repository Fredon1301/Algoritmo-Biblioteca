class Node {
    Livro livro;
    Node proximo;

    public Node(Livro livro) {
        this.livro = livro;
        this.proximo = null;
    }
}

class ListaEncadeada {
    private Node inicio;

    public void adicionar(Livro livro) {
        Node novo = new Node(livro);
        if (inicio == null) {
            inicio = novo;
        } else {
            Node temp = inicio;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
        }
    }

    public void listar() {
        Node temp = inicio;
        while (temp != null) {
            System.out.println(temp.livro);
            temp = temp.proximo;
        }
    }

    public Node getInicio() {
        return inicio;
    }
}
