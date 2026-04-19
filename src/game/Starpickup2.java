package game;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class Starpickup2 implements CollisionListener {
    private Character2 character2;

    public Starpickup2(Character2 character2) {
        this.character2 = character2;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof Star) {
            character2.increaseStars();
            System.out.println("Stars " + character2.getStars());
            collisionEvent.getOtherBody().destroy();
        }
    }
}
