package game;

import city.cs.engine.BodyImage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Character2controller implements KeyListener{

    private static final float WALKING_SPEED = 4;
    private Character2 character2;

    public Character2controller(Character2 character2){this.character2= character2;}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_A) {  //to the left
            character2.removeAllImages();
            character2.addImage(new BodyImage("data/lol2reverse.png",4f));
            character2.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_D) { // to the right
            character2.removeAllImages();
            character2.addImage(new BodyImage("data/lol2.png",4f));
            character2.startWalking(WALKING_SPEED);
        }
        else if (code == KeyEvent.VK_W) { // to the right
            character2.jump(11);

        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_A) {
            character2.stopWalking();
        } else if (code == KeyEvent.VK_D) {
            character2.stopWalking();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}


