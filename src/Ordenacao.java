class Ordenacao {

    public static void bubbleSortTitulo(ListaEncadeada lista) {
        if (lista.getInicio() == null) return;

        boolean trocou;
        do {
            trocou = false;
            Node atual = lista.getInicio();
            while (atual != null && atual.proximo != null) {
                if (atual.livro.titulo.compareTo(atual.proximo.livro.titulo) > 0) {

                    Livro temp = atual.livro;
                    atual.livro = atual.proximo.livro;
                    atual.proximo.livro = temp;
                    trocou = true;
                }
                atual = atual.proximo;
            }
        } while (trocou);
    }
//a

    public static void quickSortAutor(ListaEncadeada lista) {
        quickSortAutor(lista.getInicio(), getUltimo(lista.getInicio()));
    }

    private static void quickSortAutor(Node inicio, Node fim) {
        if (inicio != fim && inicio != null && fim != null) {
            Node pivo = partition(inicio, fim);


            if (pivo != inicio && pivo != null) {
                Node antesDoPivo = getAnterior(inicio, pivo);
                quickSortAutor(inicio, antesDoPivo);
            }

            if (pivo != fim && pivo != null && pivo.proximo != null) {
                quickSortAutor(pivo.proximo, fim);
            }
        }
    }

    private static Node partition(Node inicio, Node fim) {
        String pivo = fim.livro.autor;
        Node i = inicio;

        for (Node j = inicio; j != fim; j = j.proximo) {
            if (j.livro.autor.compareTo(pivo) < 0) {
                Livro temp = i.livro;
                i.livro = j.livro;
                j.livro = temp;
                i = i.proximo;
            }
        }
        Livro temp = i.livro;
        i.livro = fim.livro;
        fim.livro = temp;
        return i;
    }

    private static Node getAnterior(Node inicio, Node pivo) {
        Node atual = inicio;
        while (atual != null && atual.proximo != pivo) {
            atual = atual.proximo;
        }
        return atual;
    }

    private static Node getUltimo(Node inicio) {
        Node atual = inicio;

        while (atual != null && atual.proximo != null) {
            atual = atual.proximo;
        }
        return atual;
    }
}
