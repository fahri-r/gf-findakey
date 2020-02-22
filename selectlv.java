import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selectlv extends World
{

    /**
     * Constructor for objects of class CopyOfmenu.
     * 
     */
    public selectlv()
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
        lvl1 lvl1 = new lvl1();
        addObject(lvl1,getWidth()/2-250,getHeight()/4);
        lvl2 lvl2 = new lvl2();
        addObject(lvl2,getWidth()/2,getHeight()/4);
        lvl3 lvl3 = new lvl3();
        addObject(lvl3,getWidth()/2+250,getHeight()/4);
        lvl4 lvl4 = new lvl4();
        addObject(lvl4,getWidth()/2-150,getHeight()/4+130);
        lvl5 lvl5 = new lvl5();
        addObject(lvl5,getWidth()/2+150,getHeight()/4+130);
        menu_btn menu_btn = new menu_btn();
        addObject(menu_btn,getWidth()/2,getHeight()/5+400);
    }
}
