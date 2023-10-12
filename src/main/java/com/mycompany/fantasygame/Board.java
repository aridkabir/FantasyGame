/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fantasygame;

/**
 *
 * @author Arid
 */
public class Board {

    private int currentTurns;
    private int RNG;
    private int length;
    private int width;
    private int numOfPlayers;
    private int numOfEnemies;
    private boolean isGameOver;

    public Board(int currentTurns, int RNG, int length, int width, int numOfPlayers, int numOfEnemies, boolean isGameOver) {
        this.currentTurns = currentTurns;
        this.RNG = RNG;
        this.length = length;
        this.width = width;
        this.numOfPlayers = numOfPlayers;
        this.numOfEnemies = numOfEnemies;
        this.isGameOver = isGameOver;
    }

    public int getCurrentTurns() {
        return currentTurns;
    }

    public void setCurrentTurns(int currentTurns) {
        this.currentTurns = currentTurns;
    }

    public int getRNG() {
        return RNG;
    }

    public void setRNG(int RNG) {
        this.RNG = RNG;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public int getNumOfEnemies() {
        return numOfEnemies;
    }

    public void setNumOfEnemies(int numOfEnemies) {
        this.numOfEnemies = numOfEnemies;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public double generateRandomNumber() {
        return Math.random()*10;
    }

    public void initiateBattle(){
        
    }
    
}
