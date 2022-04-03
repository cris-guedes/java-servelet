/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author 55459
 */
public class Score {
    private int games;
    private int loss;
    private int wins;
    private int ties;
    
    
    public Score(){
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

   
    

   
    
    
}
