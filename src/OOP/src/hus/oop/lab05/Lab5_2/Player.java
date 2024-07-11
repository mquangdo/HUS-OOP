package hus.oop.lab05.Lab5_2;
import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Ball ball = new Ball(50,50,0);
        Player player = new Player(1,51,51);
        System.out.println(ball);
        player.kick(ball);
        System.out.println(ball);
    }
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;
    public Player(int number, float x, float y){
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void jump(float zDisp){
        this.z += zDisp;
    }

    public void move(float xDisp, float yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    public boolean near(Ball ball){
        float ballXPos = ball.getX();
        float ballYPos = ball.getY();
        float playerXPos = this.x;
        float playerYPos = this.y;
        float dX = Math.abs(ballXPos - playerXPos);
        float dY = Math.abs(ballYPos - playerYPos);
        return Math.sqrt(dX * dX + dY * dY) < 8;
    }
    public void kick(Ball ball){
        try {
            if (!near(ball)){
                throw new Exception("The bar is way to far!");
            } else if(ball.getX() == this.x && ball.getY() == this.y && ball.getZ() == this.z){
                throw new Exception("The ball's position must be different from the player's!");
            }else {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the xPos of directional vector: ");
                int a = sc.nextInt();
                System.out.print("Enter the yPos of directional vector: ");
                int b = sc.nextInt();
                System.out.print("Enter the kick force: ");
                int f = sc.nextInt();
                ball.setXYZ(ball.getX() + (float) a * f / 10, ball.getY() + (float) b * f / 10, 0);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
