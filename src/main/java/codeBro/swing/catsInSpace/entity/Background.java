package codeBro.swing.catsInSpace.entity;

import java.awt.*;

public class Background extends FlyingObject{
    public Background() {
    }

    public Background(Image image, int posX, int posY, int speedX, int speedY, int maxSpeedX, int maxSpeedY, int accelerationX, int accelerationY) {
        super(image, posX, posY, speedX, speedY, maxSpeedX, maxSpeedY, accelerationX, accelerationY);
    }
}
