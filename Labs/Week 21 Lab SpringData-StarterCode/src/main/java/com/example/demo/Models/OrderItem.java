package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Order_Items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double priceAtPurchase;

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(optional = false)
    @JoinColumn(name = "seller_produce_id", nullable = false)
    private SellerProduce sellerProduce;

    public OrderItem() {}

    public OrderItem(Order order, SellerProduce sellerProduce,
                     int quantity, double priceAtPurchase) {
        this.order = order;
        this.sellerProduce = sellerProduce;
        this.quantity = quantity;
        this.priceAtPurchase = priceAtPurchase;
    }

    public Long getId() { return id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPriceAtPurchase() { return priceAtPurchase; }
    public void setPriceAtPurchase(double priceAtPurchase) {
        this.priceAtPurchase = priceAtPurchase;
    }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public SellerProduce getSellerProduce() { return sellerProduce; }
    public void setSellerProduce(SellerProduce sellerProduce) {
        this.sellerProduce = sellerProduce;
    }
}