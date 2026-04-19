package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class GameWorld extends World {
        private Character1 character1;
        private Character2 character2;
    public GameWorld(){
        super();

        //make a ground platform
        Shape shape = new BoxShape(40, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));
        ground.setFillColor(Color.lightGray);
        //ground.addImage(new BodyImage("./data/grass.png",5f)).setOffset(new Vec2(0,-0.5F));

        // make a suspended platform
        Shape platformShape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(8, 6f));
        platform1.setAngleDegrees(45);
        platform1.setFillColor(Color.BLUE);

        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(-8, 6f));
        platform2.setAngleDegrees(-45);
        platform2.setFillColor(Color.BLUE);

        StaticBody platform3 = new StaticBody(this,platformShape);
        platform3.setPosition(new Vec2(15,-2));
        platform3.setFillColor(Color.BLUE);

        StaticBody platform4 = new StaticBody(this,platformShape);
        platform4.setPosition(new Vec2(-15,-2));
        platform4.setFillColor(Color.BLUE);



        // make walls

        Shape wallShape = new BoxShape(0.25f,7);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-19.7f,-4));
        wall1.setFillColor(Color.black);

        StaticBody wall2 = new StaticBody(this, wallShape);
        wall2.setPosition(new Vec2(19.7f,-4));
        wall2.setFillColor(Color.black);


        //drop ball in the middle of the grass
        Shape ballShape = new CircleShape(1f);
        DynamicBody ball = new DynamicBody(this, ballShape);
        ball.setPosition(new Vec2(-8.9f, 8));
        ball.addImage(new BodyImage("data/football.png",1.6f));

        //make a character (with an overlaid image)

        character1 = new Character1(this);
        character1.setPosition(new Vec2(11,-5));

        character2 = new Character2(this);
        character2.setPosition(new Vec2(-11,-5));




        Starpickup listener = new Starpickup(character1);
        character1.addCollisionListener(listener);
        Starpickup2 listener2= new Starpickup2(character2);
        character2.addCollisionListener(listener2);



        Goal goal = new Goal(this);
        goal.setPosition(new Vec2(16.4f,-8.5f));

        Goal goal2 = new Goal(this);
        goal2.removeAllImages();
        goal2.addImage(new BodyImage("data/goal8flip.png",9.5f));
        goal2.setPosition(new Vec2(-16.4f,-8.5f));




       Star star= new Star(this);
       star.setPosition(new Vec2(15,12));
       Star star1= new Star(this);
       star1.setPosition(new Vec2(-15f,12));
       Star star2 = new Star(this);
       star2.setPosition(new Vec2(0,0));



    }

    public Character1 getCharacter1() {
        return character1;
    }
    public Character2 getCharacter2()  {return character2;}
    }

