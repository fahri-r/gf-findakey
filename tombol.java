import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol extends Actor
{
    /**
     * Act - do whatever the tombol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       GreenfootSound tombolsnd = new GreenfootSound("button.wav");
        if(gergaji.putar==1&&isTouching(player.class)){
        gergaji.putar=0;
        setImage("tombol1.png");
        tombolsnd.play();
    }
        
    }    
}
