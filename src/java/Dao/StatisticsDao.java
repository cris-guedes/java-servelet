/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entities.Player;
import Entities.Score;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author 55459
 */
public class StatisticsDao {

    HashMap<String, Score> statisticList = new HashMap();

    public StatisticsDao() {
    }

    public void create(Player player, Score score) {
        statisticList.put(player.name, score);
    }

    public void update(Player player, int result) {
        Score score = statisticList.get(player.name);
        System.out.println(player.name);
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

    public Score read(Player player) {
        return statisticList.get(player.name);

    }

    public Boolean readByName(String name) {
        return statisticList.containsKey(name);

    }

    public ArrayList<Score> getAll() {
        
        ArrayList<Score> list = new ArrayList();
        for( Score s :  this.statisticList.values()  ){
            list.add(s);
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        return list;

    }

}
