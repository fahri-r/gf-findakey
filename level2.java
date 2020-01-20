import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public static int lv2=0;
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1160, 600, 1); 
        timer.timer=33*15;
        prepare();
    }
    
    public void prepare()
    {
        pintu pintu = new pintu();
        addObject(pintu,640,600-64);
        rumput rumput = new rumput();
        addObject(rumput,0,600);
        rumput rumput2 = new rumput();
        addObject(rumput2,64,600);
        rumput rumput3 = new rumput();
        addObject(rumput3,64*2,600);
        rumput rumput4 = new rumput();
        addObject(rumput4,64*3,600);
        rumput rumput5 = new rumput();
        addObject(rumput5,64*4,600);
        rumput rumput6 = new rumput();
        addObject(rumput6,64*5,600);
        rumput rumput7 = new rumput();
        addObject(rumput7,64*6,600);
        rumput rumput8 = new rumput();
        addObject(rumput8,64*7,600);
        rumput rumput9 = new rumput();
        addObject(rumput9,64*8,600);
        rumput rumput10 = new rumput();
        addObject(rumput10,64*9,600);
        rumput rumput11 = new rumput();
        addObject(rumput11,64*10,600);
        rumput rumput12 = new rumput();
        addObject(rumput12,64*11,600);
        rumput rumput13 = new rumput();
        addObject(rumput13,64*12,600);
        rumput rumput14 = new rumput();
        addObject(rumput14,64*13,600);
        rumput rumput15 = new rumput();
        addObject(rumput15,64*14,600);
        rumput rumput16 = new rumput();
        addObject(rumput16,64*15,600);
        rumput rumput17 = new rumput();
        addObject(rumput17,64*16,600);
        rumput rumput19 = new rumput();
        addObject(rumput19,64*17,600);
        rumput rumput18 = new rumput();
        addObject(rumput18,64*18,600);

        rumput rumput20 = new rumput();
        addObject(rumput20,0,384);
        rumput rumput21 = new rumput();
        addObject(rumput21,64,384);
        rumput rumput22 = new rumput();
        addObject(rumput22,320,384);
        rumput rumput23 = new rumput();
        addObject(rumput23,256,384);
        rumput rumput24 = new rumput();
        addObject(rumput24,384,384);
        tombol tombol = new tombol();
        addObject(tombol,384,320);
        kunci kunci = new kunci();
        addObject(kunci,64,600-64);
        player player = new player();
        addObject(player,52,288);
        timer timer = new timer();
        addObject(timer,104,119);
    }
}
