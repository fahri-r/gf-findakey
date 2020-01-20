import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl1 extends button
{
    boolean mouseOver = false;
 
    public void act()
    {
        if(level1.lv1==1){
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("lv1_2.png");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("lv1_1.png");  
             mouseOver = false;  
         } 
 
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new level1());
            menu.backgroundMusic.stop();
            menu.music=0;
        }
    }else setImage("lv1_0.png");
    }
}