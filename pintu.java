import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pintu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pintu extends Actor
{
    private int delay=2;
    public void act() 
    {
        if(isTouching(player.class)&& player.konci==1)
        {
            setImage("pintu1.png");
            if (delay==0)
            {
            if (getWorld()instanceof level1){
                level2.lv2=1;
                Greenfoot.setWorld(new level2());}
            
            else if(getWorld()instanceof level2){
                level3.lv3=1;
                Greenfoot.setWorld(new level3());}
            else if(getWorld()instanceof level3){
                level4.lv4=1;
                Greenfoot.setWorld(new level4());}
            else if(getWorld()instanceof level4){
                level5.lv5=1;
                Greenfoot.setWorld(new level5());}
            else if(getWorld()instanceof level5){
                Greenfoot.setWorld(new gameOver());}
            }else delay--;
        }
        // Add your action code here.
    }    
}
