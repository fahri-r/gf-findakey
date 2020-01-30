import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class retry extends button
{
    /**
     * Act - do whatever the retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean mouseOver = false;
 
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("retry1.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("retry0.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
        if(level.retry==1)Greenfoot.setWorld(new level1());
        else if(level.retry==2)Greenfoot.setWorld(new level2());
        else if(level.retry==3)Greenfoot.setWorld(new level3());
        else if(level.retry==4)Greenfoot.setWorld(new level4());
        else if(level.retry==5)Greenfoot.setWorld(new level5());
        }  
    }      
}
