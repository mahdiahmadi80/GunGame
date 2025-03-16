package test.game;

import java.util.ArrayList;

public class Shooter implements ShootingContract {
    private Gun gun;
    private Ball ball;


    @Override
    public void setGunByName(String name) throws Exception {


        switch (name) {
            case "SubmachineGun":
                setGun(Gun.submachineGun);
                break;
            case "Assault Rifle":
                setGun(Gun.assaultRifle);
                break;
            case "Pistol":
                setGun(Gun.pistol);
                break;
            case "Shotgun":
                setGun(Gun.shotgun);
                break;
            case "Sniper Rifel":
                setGun(Gun.sniperRifel);
                break;

            default:
                throw new Exception("Aslahe eshtebah ast");
        }

    }

    @Override
    public void addBulletOfGivenSizeToGun(float size, int count) throws Exception {
        float sizeGun = gun.getSize();
        if (count > 0 && size == sizeGun && gun != null) {
            switch ((int) size) {
                case (int) 0.5:
                    setBall(Ball.A);
                    break;
                case 1:
                    setBall(Ball.B);
                    break;
                case 3:
                    setBall(Ball.C);
                    break;
                case 4:
                    setBall(Ball.D);
            }
        } else {
            throw new Exception("ball eshtebah entekhab shode ast");
        }
    }


    @Override
    public float shootToTarget(int targetX, int targetY, int targetDistance, int aimX, int aimY) throws Exception {

        int[][] Coordinates = new int[10][10];
        if (gun.getBord() < targetDistance) {
            System.out.println("0");
        } else {
            System.out.println("bord va fasele entekhabi ok bod shelik anjam shod");
            double a = gun.getPower() * ball.getDamage();
        }
        if (gun != null && ball != null) {
            System.out.println("gun and ball is ok");
        } else {
            throw new Exception("selah va ball entekhab nashode ast");
        }

        if (aimX <= Coordinates.length && aimY <= Coordinates.length) {
            System.out.println("shelik dar mokhtasat anjam shod");

        } else {
            System.out.println("0");
            throw new Exception("mokhtasat shelik kharej az mahdode ast");
        }

        return 0;
    }


    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
