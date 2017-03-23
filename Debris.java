import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris here.
 * 
 * @author (Jared Muise) 
 * @version (a version number or a date)
 */
public class Debris extends Actor
{
    private int speed;
    
    public Debris()
    {
       int w = Greenfoot.getRandomNumber(20)+1; 
       int h = Greenfoot.getRandomNumber(20)+1;
       
       setRotation( Greenfoot.getRandomNumber(360) );
       getImage().scale(w,h);
       
       speed = Greenfoot.getRandomNumber(10)+5;
    }
    
    /**
     *  When the rock debris hit the edge of the world they will remove
     *  its self from the world.
     *  
     *  @param there are no parameters.
     *  @return there is nothing to retrun.
     */
    public void act()
    {
        move(speed);
        
        if( isAtEdge() )
        {
            getWorld().removeObject(this);
        }
    }
}
