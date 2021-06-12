public class Point {
    // write your code here
    private int x;
    private int y;
    
    // constructors 
    public Point(){} // no-arg constructor
    public Point(int x, int y){ // Parameterized constructor
        this.x = x;
        this.y = y;
    }
    
    // instance methods
    //getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
         this.y = y;
    }
    public double distance(){ // method without parameters
        return distance(0,0);
    }
    public double distance(int x, int y){ // returns distance btn this points(x,y)
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Point another) {// returns distance btn this point & another point
        return distance(another.x, another.y);
    }// end of instance methods
}