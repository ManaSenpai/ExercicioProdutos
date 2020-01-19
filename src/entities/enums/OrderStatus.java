package entities.enums;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author br03329
 */
public enum OrderStatus {

    /**
     * Status em que estamos aguardando o pagamento
     */
    PENDING_PAYMENT,

    /**
     * Status em que o pedido está sendo processado
     */
    PROCESSING,

    /**
     * Status em que o pedido foi enviado.
     */
    SHIPPED,

    /**
     * Status em que o pedido já foi entregue.
     */
    DELIVERED
}
