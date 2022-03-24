package java.src.main.java.workshop.trivia;

import java.src.main.java.workshop.trivia.Player;
import java.util.ArrayList;
import java.util.List;

public class Playerlist {
    private final List<Player> players = new ArrayList<>();
    private int currentPlayerIndex = 0;

    void add(String playerName){
        players.add(new Player(playerName));
    }


    int size(){
        return players.size();
    }

    Player currentPlayer(){
        return players.get(currentPlayerIndex);
    }


    Player nextPlayer(){
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        return players.get(currentPlayerIndex);
    }


}