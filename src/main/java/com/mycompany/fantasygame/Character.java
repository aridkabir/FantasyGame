/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fantasygame;
import java.util.*;

/**
 *
 * @author Arid
 */

public class Character {
    private String name;
    private int HP;
    private int stamina;
    private int gold;
    private boolean isAlive;
    private Item equippedArmor;
    private ArrayList<Item> inventory = new ArrayList();
    private int positionX;
    private int positionY;
    
    public Character(String name)
    {
       this.name = name;
       this.HP = 10;
       this.stamina = 10;
       this.gold = 0;
       this.isAlive = true;
       this.positionX = 0;
       this.positionY = 0;
    }
    
    public void equip(Item item)
    {
        this.equippedArmor = item;
    }
    
    public void retreat()
    {
        //Code to retreat during battle
    }
}
