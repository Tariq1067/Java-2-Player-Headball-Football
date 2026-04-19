package game;

import city.cs.engine.*;


public class Star extends DynamicBody {
    private static final Shape starShape = new CircleShape(1);

    private static final BodyImage image = new BodyImage("data/star111.png",3f);

    public Star(World w) {
        super(w,starShape);
        addImage(image);
    }
}
