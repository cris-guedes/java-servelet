/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entities.Player;
import Entities.Score;
import java.util.HashMap;

/**
 *
 * @author 55459
 */
public class StatisticsDao {
    HashMap<Player,Score> statisticList = new HashMap();
    
    public StatisticsDao(){}
    
    public void  create(Player player,Score score){
        statisticList.put(player, score);
    }
    
    public void update(Player player,int result){
        Score score =  statisticList.get(player);
        score.Games();
        switch (result) {
            case 0:
                score.Loss();
                System.out.println("loss");
                break;
            case 1:
                score.Wins();
                System.out.println("win");
                break;
            default:
                score.Ties();
                System.out.println("tie");
                break;
        }
    }
    
    public Score read(Player player){
        return statisticList.get(player);
        
    }
    
     
}
