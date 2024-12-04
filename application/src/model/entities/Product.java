package model.entities;

import java.util.Objects;

public class Product {

    // Atributos da classe Product
    private String name;  // Nome do produto
    private Double price; // Preço do produto

    // Construtor que inicializa os atributos
    public Product(String name, Double price) {
        this.name = name;   // Inicializa o nome do produto
        this.price = price; // Inicializa o preço do produto
    }

    // Método getter para obter o nome do produto
    public String getName() {
        return name;
    }

    // Método setter para modificar o nome do produto
    public void setName(String name) {
        this.name = name;
    }

    // Método getter para obter o preço do produto
    public Double getPrice() {
        return price;
    }

    // Método setter para modificar o preço do produto
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        // Verifica se o objeto comparado é uma instância de Product
        if (!(o instanceof Product product)) return false;
        // Compara os atributos name e price, levando em conta possíveis valores nulos
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        // Gera um código hash baseado nos atributos name e price
        return Objects.hash(name, price);
    }
}