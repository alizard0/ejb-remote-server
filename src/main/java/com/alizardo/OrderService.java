package com.alizardo;

import javax.ejb.Remote;

/**
 * This is the remote interface for OrderService
 * @author alizardo
 */
@Remote
public interface OrderService {
    String placeOrder(OrderDetails details);
    OrderDetails retrieveOrder(int orderId);
}
