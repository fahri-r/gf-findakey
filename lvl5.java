import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl5 extends button
{
    boolean mouseOver = false;
 
    public void act()
    {
        if(level5.lv5==1){
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("lv5_2.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("lv5_1.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new level5());
            menu.backgroundMusic.stop();
            menu.music=0;
        }
    }else setImage("lv5_0.png");
    }
}