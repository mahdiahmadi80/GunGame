import test.game.Ball;
import test.game.Gun;
import test.game.Shooter;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Shooter {
    public static void main(String[] args) throws Exception {

        System.out.println("aslahe ra vared konid");
        Scanner scanner = new Scanner(System.in);

//        us is gun name
        String us = scanner.next();

//        sc is selected gun by user

        Shooter sc = new Shooter();
        sc.setGunByName(us);

        System.out.println("power:" + sc.getGun().getPower() + "\nSize ball:" + sc.getGun().getSize() + "\nBord:" + sc.getGun().getBord());

        System.out.println("size ball ra vared konid");
        float ballSize = scanner.nextFloat();
        System.out.println("meghdar ball ra vared konid");
        int ballCount = scanner.nextInt();


        sc.addBulletOfGivenSizeToGun(ballSize, ballCount);

        System.out.println(sc.getGun().getName());
        System.out.println(sc.getBall().getName());


        String




    }
}