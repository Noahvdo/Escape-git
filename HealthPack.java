import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPack extends Pickups
{
    /**
     * Act - do whatever the HealthPack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int bounceFactor;
    
    public HealthPack(int _bounceFactor, boolean bounce) {
        super(_bounceFactor,bounce);
        bounceFactor = _bounceFactor;
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
