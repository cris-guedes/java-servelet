/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author 55459
 */
public class LastResult {
    public int computerChoose;
    public int playerChoose;
    public int resultado;

    public LastResult(int computerChoose, int playerChoose, int resultado) {
        this.computerChoose = computerChoose;
        this.playerChoose = playerChoose;
        this.resultado = resultado;
    }
    
  
    public int getComputerChoose() {
        return computerChoose;
    }

    public void setComputerChoose(int computerChoose) {
        this.computerChoose = computerChoose;
    }

    public int getPlayerChoose() {
        return playerChoose;
    }

    public void setPlayerChoose(int playerChoose) {
        this.playerChoose = playerChoose;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
}
