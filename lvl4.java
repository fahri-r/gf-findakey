import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl4 extends button
{
    boolean mouseOver = false;
 
    public void act()
    {
        if(level4.lv4==1){
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("lv4_2.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("lv4_1.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new level4());
            menu.backgroundMusic.stop();
            menu.music=0;
        }
    }else setImage("lv4_0.png");
    }
}
