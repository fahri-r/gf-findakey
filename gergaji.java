import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gergaji here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gergaji extends musuh
{
    public static int putar=1;
    /**
     * Act - do whatever the gergaji wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gergaji(){
    putar=1;
    }
    public void act() 
    {
        if(putar==1)turn(20);
    }   
}
