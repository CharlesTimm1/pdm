package Aula1;

import java.util.ArrayList;

public class Produto {
    String nome;
    float preco;
    String descricao;

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Camisetinha";
        produto1.preco = 1.0f;
        produto1.descricao = "Camisa do Binter";

        Produto produto2 = new Produto();
        produto2.nome = "Camisa";
        produto2.preco = 1000.00f;
        produto2.descricao = "Camisa do Tricolor Imortal Grêmio";

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Lista de produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Descrição: " + produto.descricao);
            System.out.println();
        }
    }
}
