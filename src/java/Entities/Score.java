/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Comparator;

/**
 *
 * @author 55459
 */
public class Score implements Comparable<Score>{
    private String onwer;
    private int games;
    private int loss;
    private int wins;
    private int ties;
    
    
    public Score(String onwer){
        this.onwer = onwer;
        this.games = 0;
        this.loss = 0;
        this.ties = 0;
        this.wins = 0;
    }
    
    public void Games(){
        games++;
    }
    
    public void Loss(){
        loss++;
    }
    
    public void Wins(){
        wins++;
    }
    
    public void Ties(){
        ties++;
    }

    public int getGames() {
        return games;
    }

    public int getLoss() {
        return loss;
    }

    public int getWins() {
        return wins;
    }

    public int getTies() {
        return ties;
    } 
     public String getOnwer() {
        return onwer;
    }

    public void setOnwer(String onwer) {
        this.onwer = onwer;
    }
    @Override
    public int compareTo(Score o) {
        return Integer.compare(getWins(), o.getWins());
    }
    
}
