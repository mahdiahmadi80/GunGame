package test.game;

public class Ball {
    private String name;
    private double size;
    private double damage;


    private Ball(String name, double size, double damage) {
        this.name = name;
        this.size = size;
        this.damage = damage;
    }


    static final Ball A = new Ball("A", 0.5, 1);
    static final Ball B = new Ball("B", 1, 1.5);
    static final Ball C = new Ball("C", 3, 3);
    static final Ball D = new Ball("D", 4, 2);


    public Ball getGetBallA() {
        return A;
    }

    public static Ball getGetBallB() {
        return B;
    }

    public Ball getGetBallC() {
        return C;
    }

    public Ball getGetBallD() {
        return D;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
