import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends button
{
    boolean mouseOver = false;
 
    public void act()
    {
        if(level2.lv2==1){
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("lv2_2.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("lv2_1.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new level2());
            menu.backgroundMusic.stop();
            menu.music=0;
        }
    }else setImage("lv2_0.png");
    }
}