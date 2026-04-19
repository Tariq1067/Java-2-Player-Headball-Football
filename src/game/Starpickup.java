package game;


import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class Starpickup implements CollisionListener {
    private Character1 character1;

    public Starpickup(Character1 character1){
        this.character1 = character1;

    }
    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody()instanceof Star){
            character1.increaseStars();
            System.out.println("Stars " + character1.getStars());
            collisionEvent.getOtherBody().destroy();
        }

    }
}
