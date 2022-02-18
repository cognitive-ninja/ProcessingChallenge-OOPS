import processing.core.PApplet;

public class ProcessingChallenge extends PApplet {
    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;
    private static final int DIAMETER = 10;
    int xCenter=0;
    int yCenter=HEIGHT;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(xCenter++, yCenter);
        drawCircle(2 * xCenter, 2 * yCenter);
        drawCircle(3 * xCenter, 3 * yCenter);
        drawCircle(4 * xCenter, 4 * yCenter);
    }

    private void drawCircle(int xCenter, int HEIGHT) {
        ellipse(xCenter, HEIGHT/5, DIAMETER, DIAMETER);
    }
}
