package com.example.recyclerview30032020;

import java.util.ArrayList;
import java.util.Arrays;

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

    public static ArrayList<Food> mock(){
        return new ArrayList<>(
                Arrays.asList(
                 new Food("Banh khot","Quan 1",20000,R.drawable.hinh_mon_banh_khot),
                 new Food("Banh my","Quan 2",20000,R.drawable.hinh_mon_banh_my),
                 new Food("Bi ngoi chien xu","Quan 3",20000,R.drawable.hinh_mon_bi_ngoi_chien_xu),
                 new Food("Bun mam","Quan 4",20000,R.drawable.hinh_mon_bun_mam),
                 new Food("Bun rieu","Quan 5",20000,R.drawable.hinh_mon_bun_rieu)
                )
        );
    }
}
