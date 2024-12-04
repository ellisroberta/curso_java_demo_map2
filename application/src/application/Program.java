package application;

import model.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        // Cria um map para armazenar produtos e suas quantidades em estoque
        Map<Product, Double> stock = new HashMap<>();

        // Criação de instâncias de produtos
        Product p1 = new Product("Tv", 900.0);            // Produto 1: Televisão
        Product p2 = new Product("Notebook", 1200.0);     // Produto 2: Notebook
        Product p3 = new Product("Tablet", 400.0);        // Produto 3: Tablet

        // Adiciona os produtos ao estoque com suas quantidades
        stock.put(p1, 10000.0); // 10.000 unidades de TVs
        stock.put(p2, 20000.0); // 20.000 unidades de Notebooks
        stock.put(p3, 15000.0); // 15.000 unidades de Tablets

        // Cria um novo objeto Product que tem os mesmos atributos do produto p1
        Product ps = new Product("Tv", 900.0);

        // Verifica se o map contém a chave 'ps' (que é uma TV) e imprime o resultado
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}