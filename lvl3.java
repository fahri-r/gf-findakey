import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl3 extends button
{
    boolean mouseOver = false;
 
    public void act()
    {
        if(level3.lv3==1){
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("lv3_2.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("lv3_1.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new level3());
            menu.backgroundMusic.stop();
            menu.music=0;
        }
    }else setImage("lv3_0.png");
    }
}