import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends World
{

    /**
     * Constructor for objects of class CopyOfmenu.
     * 
     */
    public gameOver()
    {    
        super(1111, 600, 1); 
        GreenfootImage bg = new GreenfootImage("background.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        over over = new over();
        addObject(over,getWidth()/2,getHeight()/2);
        menu_btn menu_btn = new menu_btn();
        addObject(menu_btn,getWidth()/2+100,getHeight()/2+200);
        start start = new start();
        addObject(start,getWidth()/2-100,getHeight()/2+200);
    }
}
