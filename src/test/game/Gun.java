package test.game;

public class Gun {
    private Ball ball ;
    private String name;
    private double bord;
    private double power;
    private double size;


    private Gun(String name, double bord, double power, double size) {
        this.name = name;
        this.bord = bord;
        this.power = power;
        this.size = size;
    }

    static final Gun submachineGun = new Gun("Submachine Gun", 100, 10, 0.5);
    static final Gun assaultRifle = new Gun("Assault Rifle", 200, 20, 1);
    static final Gun pistol = new Gun("Pistol", 80, 8, 0.5);
    static final Gun shotgun = new Gun("Shotgun", 50, 40, 4);
    static final Gun sniperRifel = new Gun("Sniper Rifel", 1000, 30, 3);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBord() {
        return bord;
    }

    public void setBord(double bord) {
        this.bord = bord;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public float getSize() {
        return (float) size;
    }

    public void setSize(double size) {
        this.size = size;
    }




    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
}

