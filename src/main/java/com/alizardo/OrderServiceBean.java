package com.alizardo;

import javax.ejb.Stateless;

@Stateless(name = "OrderService")
public class OrderServiceBean implements OrderService {

    @Override
    public String placeOrder(OrderDetails details) {
        return "Order placed";
    }

    @Override
    public OrderDetails retrieveOrder(int orderId) {
        return new OrderDetails();
    }
}
