package game;

import city.cs.engine.*;

public class Character1 extends Walker{
    private static final Shape character1Shape = new PolygonShape(-1.5f,1.94f,
            1.4f,1.92f,
            1.65f,-1.9f,
            -1.54f,-1.84f);

    private static final BodyImage image = new BodyImage("data/Lol.png",4f);
    private int stars;


     public Character1(World world) {
         super(world, character1Shape);
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

