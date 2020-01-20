import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cover extends Actor
{
    /**
     * Act - do whatever the cover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cover() 
    {
        GreenfootImage image=getImage();
        image.scale(image.getWidth()+10,image.getHeight()+10);
        setImage(image);
    }    
}
