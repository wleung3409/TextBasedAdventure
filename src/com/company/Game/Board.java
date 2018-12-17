package Room;

public class Board {
    public Board(String[][]floor){
        this.floor = floor;
    }
    public void fill(String str){
        for (int row =0; row < floor.length;row++)
        {for (int column = 0; column < floorfloor[row].length;column++){
            floor[row][column]=str;
        }
    }

}}