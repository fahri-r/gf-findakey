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
        super(1160, 600, 1); 
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
       showText("greenfoot.org",getWidth()/2,getHeight()/2-90);
       showText("Muhammad Fahri Ramadhan - Coder",getWidth()/2,getHeight()/2-60);
       showText("Kenney Game Studio - Game Assets",getWidth()/2,getHeight()/2-30);
       showText("pzUH - Button",getWidth()/2,getHeight()/2); 
       showText("TriMil - Jump Method",getWidth()/2,getHeight()/2+30);
       showText("Bethany McCarthy - Background Music",getWidth()/2,getHeight()/2+60);
       showText("Jonas Tyroller - SoundFX",getWidth()/2,getHeight()/2+90);
        menu_btn menu_btn = new menu_btn();
        addObject(menu_btn,getWidth()/2,getHeight()/2+230);
    }
}
