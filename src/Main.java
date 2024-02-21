import java.lang.System;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Arroz", 5.60,10);
        Produto produto2 = new Produto("Feijão",8.60,5);
        Produto produto3 = new Produto("Macarrão", 11.8,8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + listaProdutos.size());
        System.out.println("Produto 2 da lista: " + listaProdutos.get(1).getNome());

        //imprimindo a lista de produtos utilizando o método System.out.println()
        System.out.println(listaProdutos);

    }
}