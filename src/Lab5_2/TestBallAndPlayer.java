package Lab5_2;

public class TestBallAndPlayer {
    public static void main(String[] args) {
        Ball ball = new Ball(50,50,0);
        Player player1 = new Player(1,100,100);
        System.out.println("The ball at " + ball);
        System.out.println(player1.near(ball));
        Player player2 = new Player(2, 51,51);
        System.out.println(player2.near(ball));
        System.out.println(ball);
        player1.kick(ball);
        player1.move(-50, -50);
        System.out.println(player1.near(ball));
        player2.kick(ball);
        System.out.println("The new position of the ball is:" + ball);


    }
}
