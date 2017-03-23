 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (Jared Muise)
 * Teacher Mr.Hardman
 * Lab #2 Explosion 
 * Date Last Modified: March 23th/2017
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        explode();
    } 
    
    /**
     *  The rock explodes into a bunch of pices.
     *  
     *  @param there are no parameters.
     *  @return there is nothing to return.
     */
    private void explode()
    {
        Greenfoot.playSound("MetalExplosion.wav");
        
        for(int i=0; i < 50; i++)
        {
             getWorld().addObject(new Debris(), getX(), getY() );
             
        }
        
        getWorld().removeObject( this );
        
    }
    
}
