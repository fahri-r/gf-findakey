import greenfoot.*;


public class player extends Mover
{
    
    public static int konci;
    private GreenfootImage[] jalan=new GreenfootImage[8];
    private int delay=3;
    private int frame;                    
    public boolean facingRight;
    private GreenfootSound hit = new GreenfootSound("hit.wav");
    private GreenfootSound jump = new GreenfootSound("jump.wav");
    public player()
    {
        setMovementSpeed(6);
        setGravity(2);
        setBlockingClasses(  new Class[]{Platform.class}  );
        konci=0;
        facingRight=true;
    }
    
    
    public void act() 
    {
        kenaduri();
        kenagergaji();
        dapetKunci();
        if(!Greenfoot.isKeyDown("A")&&!Greenfoot.isKeyDown("D")){
        if (facingRight==true){
            setImage ("idle.png");
        }else{
         GreenfootImage idleKiri=new GreenfootImage("idle.png");
         idleKiri.mirrorHorizontally();
         setImage (idleKiri);}
        }
        
        doGravity();
        
        
        if(Greenfoot.isKeyDown("A"))
        {
            facingRight=false;
            moveLeft();
            
        
        if(delay==0){
            if(frame==7){
            frame=0;
        }else{frame++;}
        delay=3;
        }else{delay--;}
        
        GreenfootImage jalanKiri=new GreenfootImage(jalan[frame]=new GreenfootImage("walk"+frame+".png"));
        jalanKiri.mirrorHorizontally();
        setImage(jalanKiri);
        }
        
        
        if(Greenfoot.isKeyDown("D"))
        {
            facingRight=true;
            moveRight();
         
        if(delay==0){
            if(frame==7){
            frame=0;
        }else{frame++;}
        delay=3;
        }else{delay--;}
        setImage(jalan[frame]=new GreenfootImage("walk"+frame+".png"));
        }
        
        
        if(Greenfoot.isKeyDown("W") && onGround()) 
        {
            jump(24); 
            jump.play();
        }
    }     
    public void kenaduri(){
        if(isTouching(duri.class))
        {
            hit.play();
            if (delay==0)
            {
            Greenfoot.setWorld(new gameOver());
            }else delay--;
        }
    }
    public void kenagergaji(){
        if(isTouching(gergaji.class)&&gergaji.putar==1)
        {
            hit.play();
            if (delay==0)
            {
            Greenfoot.setWorld(new gameOver());
            }else delay--;
        }
    }
    public void dapetKunci()
    {
        if(isTouching(kunci.class))
        {
            removeTouching(kunci.class);
            konci=1;
        }
    }
}
