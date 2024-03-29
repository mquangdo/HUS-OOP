package Lab5;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;

        try {
            double phi = Math.toRadians(direction);
            this.xDelta = (float) (speed * Math.cos(phi));
            this.yDelta = (float) (speed * Math.sin(phi));
            if (!(direction <= 180 && direction >= -180)){
                throw new Exception("Invalid direction!");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public float getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public float getXDelta(){
        return this.xDelta;
    }
    public void setXDelta(float xDelta){
        this.xDelta = xDelta;
    }
    public float getYDelta(){
        return this.yDelta;
    }
    public void setYDelta(float yDelta){
        this.yDelta = yDelta;
    }
    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }
    public void reflectHorizontal(){
        setXDelta(- this.xDelta);
    }
    public void reflectVertical(){
        setYDelta(- this.yDelta);
    }

    @Override
    public String toString() {
        return "Ball[(x = " + this.x + ",y = " + this.y + "),speed = " +  "(" + this.xDelta + ", " + this.yDelta + ")]";
    }
}
