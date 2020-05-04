package com.example.recyclerview30032020;

public class Food {
    private String name;
    private String address;
    private Integer price;
    private Integer image;
    // Alt + insert

    public Food(String name, String address, Integer price, Integer image) {
        this.name = name;
        this.address = address;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
