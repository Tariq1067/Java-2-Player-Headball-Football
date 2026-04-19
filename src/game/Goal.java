package game;

import city.cs.engine.*;

public class Goal extends StaticBody{
        private static final Shape goalShape = new PolygonShape(-2.09f,-1.35f, -1.29f,1.55f, 1.82f,1.24f);

        private static final BodyImage image = new BodyImage("data/goal8.png",9.5f);

        public Goal(World world){
            super(world,goalShape);
            addImage(image);

        }
    }

