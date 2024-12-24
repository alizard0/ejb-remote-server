package com.alizardo;

import java.util.List;

/**
 * Pojo for Order details.
 * @author alizardo
 */
public class OrderDetails {
    private int orderId;
    private float value;
    private List<String> items;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
