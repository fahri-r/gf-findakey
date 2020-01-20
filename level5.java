import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level5 extends World
{
    /**
     * Constructor for objects of class level5.
     * 
     */
    public static int lv5=0;
    public level5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1160, 600, 1);
        timer.timer=33*25;
        prepare();
    }
    
    public void prepare()
    {
        tombol tombol = new tombol();
        addObject(tombol,704,604-64*7);
        gergaji gergaji = new gergaji();
        addObject(gergaji,64*8,600-64*5);
        gergaji gergaji2 = new gergaji();
        addObject(gergaji2,64*5+32,600-64*2);
        pintu pintu = new pintu();
        addObject(pintu,64*4,600-128);
        player player = new player();
        addObject(player,39,56);
        duri duri = new duri();
        addObject(duri,0,580);
        duri duri2 = new duri();
        addObject(duri2,64,580);
        duri duri3 = new duri();
        addObject(duri3,64*2,580);
        duri duri4 = new duri();
        addObject(duri4,64*3,580);
        tanah tanah5 = new tanah();
        addObject(tanah5,64*4,600);
        rumput rumput5 = new rumput();
        addObject(rumput5,64*4,600-64);
        duri duri6 = new duri();
        addObject(duri6,64*5,580);
        duri duri7 = new duri();
        addObject(duri7,64*6,580);
        tanah tanah8 = new tanah();
        addObject(tanah8,64*7,600);
        rumput rumput8 = new rumput();
        addObject(rumput8,64*7,600-64);
        duri duri9 = new duri();
        addObject(duri9,64*8,580);
        duri duri10 = new duri();
        addObject(duri10,64*9,580);
        duri duri11 = new duri();
        addObject(duri11,64*10,580);
        duri duri12 = new duri();
        addObject(duri12,64*11,580);
        duri duri13 = new duri();
        addObject(duri13,64*12,580);
        duri duri14 = new duri();
        addObject(duri14,64*13,580);
        duri duri15 = new duri();
        addObject(duri15,64*14,580);
        duri duri16 = new duri();
        addObject(duri16,64*15,580);
        duri duri17 = new duri();
        addObject(duri17,64*16,580);
        duri duri18 = new duri();
        addObject(duri18,64*17,580);
        duri duri19 = new duri();
        addObject(duri19,64*18,580);
        kunci kunci = new kunci();
        addObject(kunci,64*8,600-64*4);
        
        
        rumput rumput14 = new rumput();
        addObject(rumput14,0,600-64*7);
        rumput rumput2 = new rumput();
        addObject(rumput2,64,600-64*7);
        rumput rumput15 = new rumput();
        addObject(rumput15,192,600-64*6);
        rumput rumput16 = new rumput();
        addObject(rumput16,320,600-64*6);
        rumput rumput17 = new rumput();
        addObject(rumput17,448,600-64*7);
        rumput rumput18 = new rumput();
        addObject(rumput18,576,600-64*7);
        rumput rumput19 = new rumput();
        addObject(rumput19,512,600-64*3);
        rumput rumput20 = new rumput();
        addObject(rumput20,704,600-64*6);
        timer timer = new timer();
        addObject(timer,104,119);
    }
}
