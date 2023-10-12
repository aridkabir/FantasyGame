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
    
    public Character(){
}
