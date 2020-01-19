/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 * Classe que guarda o pedido, não sei porque tem dois preços, só segui o diagrama do exercício
 * @author br03329
 */
public final class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    /**
     *
     * @param quantity Integer Quantidade do Produto
     * @param price Double Preço unitário do produto
     * @param product Product Produto aqui
     */
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    /**
     *
     * @return Integer com Quantidade 
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity Integer
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return Double com o preço
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @param price Double
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     *
     * @return Te retorna o Product
     */
    public Product getProduct() {
        return product;
    }

    /**
     *
     * @param product Passa o Product para a classe
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     *
     * @return Soma do total, Preço * Quantidade
     */
    public Double subtotal (){
        return price * quantity;
    }
    
}
