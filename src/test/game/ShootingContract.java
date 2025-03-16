package test.game;

public interface ShootingContract {
    void setGunByName(String name) throws Exception;

    void addBulletOfGivenSizeToGun(float size, int count) throws Exception;

    float shootToTarget(int targetX, int targetY, int targetDistance, int aimX, int aimY) throws Exception;
}
