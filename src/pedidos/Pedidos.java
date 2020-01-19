/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author br03329
 */
public class Pedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Order order = new Order();
        
        Scanner sc = new Scanner(System.in);
        /* Este trecho grava as informações do cliente da classe 
         * Cliente e as repassa ao objeto Order.
         */
        
        System.out.println("Enter client data:");
        System.out.printf("\tName: ");
        String name = sc.nextLine();
        System.out.printf("\tEmail: ");
        String email = sc.nextLine();
        System.out.printf("\tBirth date (DD/MM/YYYY): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = sdf.parse(sc.nextLine());
        Client c = new Client (name, email, birthDate);
        order.setClient(c);

        
        /*
        Este techo grava as informações do pedido e grava no objeto OrderItem
        */
        // Order Data
        System.out.println("Enter order data:");
        System.out.printf("\tStatus? ");
        String status = sc.nextLine();
        order.setStatus(OrderStatus.valueOf(status));
        System.out.printf("\tHow many items to this order? ");
        Integer n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            System.out.printf("Enter %d# item data: \n",  i);
            
            Product p = new Product();
            
            System.out.printf("\tProduct name: ");
            String pName = sc.nextLine();
            p.setName(pName);
            
            System.out.printf("\tProduct price: ");
            Double pPrice = sc.nextDouble();
            p.setPrice(pPrice);
            
            System.out.printf("\tQuantity: ");
            Integer pQuantity = sc.nextInt();
            
            OrderItem oi = new OrderItem(pQuantity,pPrice,p);
            order.addItem(oi);
        }
        
        
        
        
        order.setMoment(new Date());
        System.out.println(order.toString());
    }
    
}
