package bge.fr;

public class Cercle {

    private int x, y;
    double rayon;

    public Cercle(int x, int y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + ", " + y
                + " ; rayon : " + rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public int getX() {
        return x;
    }

}
