package game;

import city.cs.engine.UserView;
import city.cs.engine.World;

import java.awt.*;
import javax.swing.ImageIcon;

public class GameView extends UserView {

    private Image background;
    private Character1 character1;
    private Character2 character2;

    public GameView (World w, Character1 character1, Character2 character2, int width, int height){
        super(w,width,height);
        background = new ImageIcon("data/greenbok.png").getImage();
        this.character1 = character1;
        this.character2 = character2;
    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background,0,0,this);
    }

    @Override
    public void paintForeground(Graphics2D g){
        Font font = new Font("Calibri", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.white);

        g.drawString("Player 2 Stars: " + character2.getStars(), 20, 30);
        g.drawString("Player 1 Stars: " + character1.getStars(), 560, 30);
    }
}
