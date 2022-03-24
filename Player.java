package java.src.main.java.workshop.trivia;

public class Player {
    private final String name;

    private int position = 0;
    private int coins = 0;
    private boolean penaltyBox = false;


    public String getName() {
        return name;
    }
    public Player(String name) {
        this.name = name;
    }



    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }



    void moveTo(int newPosition){
        setPosition(newPosition);
    }


    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    void reward(int earned){
        setCoins(getCoins()+ earned);
    }


    boolean hasWon(){
        return this.coins >= 6;
    }

    void entersPenaltyBox(){
        this.penaltyBox = true;
    }

    void exitsPenaltyBox(){
        this.penaltyBox = false;
    }

    public boolean isInPenaltyBox() {
        return penaltyBox;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}