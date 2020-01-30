import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfmenu_btn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class credit extends World
{

    /**
     * Constructor for objects of class CopyOfmenu_btn.
     * 
     */
    public credit()
    {    
        super(1111, 600, 1); 
        GreenfootImage bg = new GreenfootImage("credit.png");
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
        menu_btn menu_btn = new menu_btn();
        addObject(menu_btn,getWidth()/2,getHeight()/2+230);
    }
}
