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
    public String templateResult;

    public LastResult(int computerChoose, int playerChoose, int resultado) {
        this.computerChoose = computerChoose;
        this.playerChoose = playerChoose;
        this.resultado = resultado;
        setTemplateResult(resultado);
    }
    public  void setTemplateResult(int result ){
        String template;
        
      switch (result) {
            case 0:
                template = "Voce Perdeu";
                break;
            case 1:
                template = "Voce venceu";
                break;
            default:
                
                template = "Empate";
                break;
        }
      templateResult = template;
    
    }

    public String getTemplateResult() {
        return templateResult;
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
