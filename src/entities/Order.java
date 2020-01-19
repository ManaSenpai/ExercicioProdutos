/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe que representa o pedido.
 * @author br03329
 */
public final class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> itemList = new ArrayList<>();
    
    /**
     * Construtor vazio :(
     */
    public Order(){}
    
    /**
     * Construtor com os parâmetros
     * @param status Status do pedido (OrderStatus)
     * @param client Cliente do pedido (Client)
     */
    public Order(OrderStatus status, Client client){
        this.status = status;
        this.client = client;
    }
    
    /**
     *
     * @return Retorna o momento do pedido (Date)
     */
    public Date getMoment (){
        return moment;
    }

    /**
     *
     * @param moment momento do pedido (Date, é importante sempre importar com o new Date() para pegar o horário atual)
     */
    public void setMoment (Date moment){
        this.moment = moment;
    }

    /**
     *
     * @return status (OrderStatus)
     */
    public OrderStatus getStatus (){
        return status;
    }

    /**
     * 
     * @param status (enum OrderStatus)
     */
    public void setStatus (OrderStatus status){
        this.status = status;
    }
    
    /**
     *
     * @return variável com o cliente (Client)
     */
    public Client getClient (){
        return client;
    }

    /**
     *
     * @param client (Client)
     */
    public void setClient (Client client){
        this.client = client;
    }

    /**
     * Adiciona um item na itemList
     * @param item (OrderItem)
     */
    public void addItem (OrderItem item){
        itemList.add(item);
    }

    /**
     * Remove um item da lista
     * @param item (OrderItem)
     */
    public void removeItem (OrderItem item){
        itemList.remove(item);
    }
    
    /**
     * Soma o total dos itens na itemList
     * @return Retorna a soma de todos os itens na itemList (Double)
     */
    public Double total(){
        Double sum = 0.0;
        for (OrderItem item : itemList){
            sum += item.subtotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment));
        sb.append("\n");
        sb.append("Order status: ");
        sb.append(status );
        sb.append("\n");
        sb.append("Client: ");
        sb.append(client.getName());
        sb.append(" (");
        sb.append(sdf2.format(client.getBirthDate()));
        sb.append(") - ");
        sb.append(client.getEmail());
        sb.append("\n");
        sb.append("ORDER ITEMS: \n");
        for (OrderItem item : itemList){
            sb.append(item.getProduct().getName());
            sb.append(", $");
            sb.append(item.getPrice()); 
            sb.append( ", Quantity ");
            sb.append(item.getQuantity());
            sb.append(", Subtotal: $");
            sb.append(item.subtotal());
            sb.append("\n");
        }
        sb.append("Total price: $");
        sb.append(total());
        return sb.toString();
    }
    
    
}
