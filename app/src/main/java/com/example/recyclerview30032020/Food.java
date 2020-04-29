package com.example.recyclerview30032020;

public class Food {
    private String name;
    private String address;
    private Integer price;
    private String image;
    // Alt + insert

    public Food(String name, String address, Integer price, String image) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
