package game;

import city.cs.engine.BodyImage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Character1controller implements KeyListener {

    private static final float WALKING_SPEED = 4;
    private Character1 character1;

    public Character1controller(Character1 character1){this.character1= character1;}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_LEFT) {  //to the left
            character1.removeAllImages();
            character1.addImage(new BodyImage("data/Lolreverse.png",4f));
            character1.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_RIGHT) { // to the right
            character1.removeAllImages();
            character1.addImage(new BodyImage("data/Lol.png",4f));
            character1.startWalking(WALKING_SPEED);
        }
        else if (code == KeyEvent.VK_UP) { // to the right
            character1.jump(11);

        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            character1.stopWalking();
        } else if (code == KeyEvent.VK_RIGHT) {
            character1.stopWalking();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}