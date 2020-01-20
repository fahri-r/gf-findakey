import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class select extends button
{
    boolean mouseOver = false;
 
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("select1.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("select0.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new selectlv());
        }  
    }   
}
