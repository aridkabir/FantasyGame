/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fantasygame;

/**
 *
 * @author Arid and Talha
 */
public class Item {
    private String itemname;
    private double cost;
    private int level;

    public Item(String itemname, double cost, int level) {
        this.itemname = itemname;
        this.cost = cost;
        this.level = level;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    

}

