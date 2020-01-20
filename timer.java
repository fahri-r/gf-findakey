import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int timer;
    public timer()
{
    updateImage();
}
 
public void act()
{
    timer--;
    if (timer % 33 == 0) updateImage();
    if (timer < 1) Greenfoot.stop();
}
 
private void updateImage()
{
    setImage(new GreenfootImage("Time Left: " + timer/33, 30, Color.BLACK, new Color(0, 0, 0, 0)));
}
}
