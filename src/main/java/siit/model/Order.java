package siit.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private Integer id;
    private Integer customerId;
    private LocalDateTime placed;
    private String Number;
    private List<OrderProduct> orderProduct;

    public Order(Integer id, Integer customerId, LocalDateTime placed, String number) {
        this.id = id;
        this.customerId = customerId;
        this.placed = placed;
        Number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getPlaced() {
        return placed;
    }

    public void setPlaced(LocalDateTime placed) {
        this.placed = placed;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public List<OrderProduct> getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(List<OrderProduct> orderProduct) {
        this.orderProduct = orderProduct;
    }
}
