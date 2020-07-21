package com.example.portfolio;

public class Item_phone {
    private String phone_name;
    private String phone_number;
    public Item_phone(String name, String number) {
        this.phone_name = name;
        this.phone_number = number;
    }
    public String getItemName() {
        return this.phone_name;
    }
    public String getItemNumber() {
        return this.phone_number;
    }
    public void setItemName(String name){ this.phone_name = name; }
    public void setItemNumber(String number) { this.phone_number = number; }

}
