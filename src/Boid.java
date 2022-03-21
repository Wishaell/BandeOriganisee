import java.awt.*;
import java.util.ArrayList;

public class Boid {

    private final int MIN_WIDTH = 5;
    private final int MAX_TRAILS = 50;
    private final int SIZE = 10;
    private final int REPULSE_RANGE = 20;

    private Vector2D position;
    private Vector2D vitesse;
    private Vector2D forces;
    private ArrayList<Vector2D> trails;
    private ArrayList<Boid> neighbours;
    private ArrayList<Boid> flockNeighbours;
    private Flock flock;

    public Boid(Flock flock) {
        this(flock, Math.random() * GUI.SIMULATION_PANEL_WIDTH, Math.random() * GUI.HEIGHT);
    }

    public Boid(Flock flock, double x, double y) {
        position = new Vector2D(x, y);
        do {
            vitesse = new Vector2D(Math.random() * flock.getSpeedMax(), Math.random() * flock.getSpeedMax());
        } while (vitesse.norm() < MIN_WIDTH);

        forces = new Vector2D();

        trails = new ArrayList<>(MAX_TRAILS);

        this.flock = flock;
    }

    private void findNeighbours() {
    }

    private void computeForces() {

    }

    private void applyForces() {

    }

    public void drawBoid(Graphics g) {
        g.setColor(flock.getColor().getColor());
        g.fillOval((int)position.x - 5, (int)position.y - 5, 10, 10);
    }

    private double getDistanceTo(Boid boid) {
        return Vector2D.substract(this.position, boid.position).norm();
    }
}
