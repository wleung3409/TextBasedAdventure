package People;

/**
 * Person represents the player as they move through the game.
 */
public class Player {
    String name;
    int Points,xLoc,yLoc,steps;

    public int getPoints(){
        return Points;
    }
    public void setPoints(int Points){
        this.Points = Points;
    }
    public void setSteps(int steps){
        this.steps = steps;
        if (steps<1) {
            Runner.gameOff();
        }
    }
    public int getxLoc(){
        return xLoc;
    }
    public void setxLoc(int xLoc){
        this.xLoc = xLoc;
    }
    public void setyLoc(int yLoc){
        this.yLoc = yLoc;
    }

    public Player (String name,int xLoc,int yLoc, int Points){
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.Points = Points;
        // sets the players location,name and points
    }


}