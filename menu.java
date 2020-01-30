import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public static GreenfootSound backgroundMusic;
    public static int music=0;
    public menu()
    {    
        super(1111, 600, 1); 
        GreenfootImage bg = new GreenfootImage("background.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
        if (music==0)music();
    }
    public void music()
    {
        backgroundMusic = new GreenfootSound("intro.wav");
        backgroundMusic.playLoop();
        music=1;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        credits credits = new credits();
        addObject(credits,getWidth()/2-150,getHeight()/2+150);
        objective objective = new objective();
        addObject(objective,getWidth()/2+150,getHeight()/2+150);
        
        select select = new select();
        addObject(select,getWidth()/2+150,getHeight()/2-30);
        start start = new start();
        addObject(start,getWidth()/2-150,getHeight()/2-30);
        
        title title = new title();
        addObject(title,getWidth()/2,getHeight()/2-190);
        
        kunci kunci = new kunci();
        addObject(kunci,getWidth()/2+170,getHeight()/2-185);
        
        cover cover = new cover();
        addObject(cover,getWidth()/2,getHeight()/2);
    }
}
