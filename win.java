import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends World
{

    /**
     * Constructor for objects of class CopyOfmenu.
     * 
     */
    public win()
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
        level.backgroundMusic.stop();
        level.music=0;
        win_ win_ = new win_();
        addObject(win_,getWidth()/2,getHeight()/2);
        menu_btn menu_btn = new menu_btn();
        addObject(menu_btn,getWidth()/2+120,getHeight()/2+200);
        select select = new select();
        addObject(select,getWidth()/2-120,getHeight()/2+200);
    }
}
