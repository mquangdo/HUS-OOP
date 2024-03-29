package Lab5;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 1000; step++) {
            ball.move();
            System.out.println(box.collidesWith(ball));
            System.out.println(ball);
        }
    }
}
