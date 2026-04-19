package game;

import city.cs.engine.*;

public class Character2 extends Walker {
    private static final Shape character2Shape = new PolygonShape(-2.08f, 1.94f,
            1.94f, 1.94f,
            1.65f, -1.73f,
            -1.96f, -1.69f);

    private static final BodyImage image = new BodyImage("data/lol2.png", 4f);
    private int stars;


    public Character2(World world) {
        super(world, character2Shape);
        addImage(image);
        stars = 0;
    }

    public void setStars(int stars) {
        this.stars = stars;
        System.out.println(stars);
    }

    public int getStars() {
        return stars;
    }

    public void increaseStars() {
        stars++;
    }
}
