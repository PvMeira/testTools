package com.company.model;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class Sales extends Entity {

    private Long idSale;

    private Long idItem;

    private Integer quantity;

    private Double price;

    private String salesmanName;

    private Double totalValue;

    public Sales(Long id, Long idSale, Long idItem, Integer quantity, Double price, String salesmanName) {
        super(id);
        this.idSale = idSale;
        this.idItem = idItem;
        this.quantity = quantity;
        this.price = price;
        this.salesmanName = salesmanName;
    }

    public Sales(Long idSale, Long idItem, Integer quantity, Double price, String salesmanName) {
        this.idSale = idSale;
        this.idItem = idItem;
        this.quantity = quantity;
        this.price = price;
        this.salesmanName = salesmanName;
    }

    public Sales() {
    }

    public Long getIdSale() {
        return idSale;
    }

    public void setIdSale(Long idSale) {
        this.idSale = idSale;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
