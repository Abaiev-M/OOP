package com.gmail.aba.homework01;

public class Product {
    private String productName;
    private double price;
    private Double Weight;
    private String dateOfManufacture;

    public Product(String productName, double price, Double weight, String dateOfManufacture) {
        this.productName = productName;
        this.price = price;
        Weight = weight;
        this.dateOfManufacture = dateOfManufacture;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", Weight=" + Weight +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                '}';
    }
}
