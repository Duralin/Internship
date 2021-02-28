package ru.webapp.Models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Stock {
    @NotEmpty(message ="Company should not be empty")
    private String company;
    @NotEmpty(message ="date should not be empty")
    private String date;
    @NotEmpty(message ="price should not be empty")
    private int price;


    public Stock(){

    }

    public Stock(String company, String date, int price){
        this.company = company;
        this.date = date;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}