import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends World
{

    /**
     * Constructor for objects of class level.
     * 
     */
    public static GreenfootSound backgroundMusic;
    public static int music=0;
    public static int retry=1;
    public level()
    {    
        super(1111, 600, 1); 
        if (music==0)music();
    }
    public static void music()
    {
        backgroundMusic = new GreenfootSound("bg.wav");
        backgroundMusic.playLoop();
        music=1;
    }
}
