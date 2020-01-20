import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu_btn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu_btn extends button
{
   boolean mouseOver = false;
 
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("menu1.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("menu0.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new menu());
        }  
    }
}