import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends level
{
    /**
     * Constructor for objects of class level1.
     * 
     */
    public static int lv1=1;
    private GreenfootImage teks;
    public level1()
    {    
        timer.timer=33*15;
        prepare();
        showText("Get the key to open the door",getWidth()/2,getHeight()/2-200);
    }
    
    
    public void prepare()
    {
        retry=1;
        pintu pintu = new pintu();
        addObject(pintu,64*11,600-64);
        player player = new player();
        addObject(player,55,503);
        rumput rumput = new rumput();
        addObject(rumput,0,600);
        rumput rumput2 = new rumput();
        addObject(rumput2,64,600);
        rumput rumput3 = new rumput();
        addObject(rumput3,64*2,600);
        rumput rumput4 = new rumput();
        addObject(rumput4,64*3,600);
        tanah tanah5 = new tanah();
        addObject(tanah5,64*4,600);
        duri duri6 = new duri();
        addObject(duri6,64*5,600-20);
        tanah tanah8 = new tanah();
        addObject(tanah8,64*6,600);
        duri duri8 = new duri();
        addObject(duri8,64*7,600-20);
        tanah tanah9 = new tanah();
        addObject(tanah9,64*8,600);
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
        tanah tanah16 = new tanah();
        addObject(tanah16,64*15,600);
        tanah tanah20 = new tanah();
        addObject(tanah20,64*16,600);
        tanah tanah19 = new tanah();
        addObject(tanah19,64*17,600);
        kunci kunci = new kunci();
        addObject(kunci,64*17,600-64*3);
        timer timer = new timer();
        addObject(timer,104,119);

        //tingkat 2
        rumput rumput5 = new rumput();
        addObject(rumput5,64*4,600-64);
        tanah tanah7 = new tanah();
        addObject(tanah7,64*6,600-64);
        rumput rumput9 = new rumput();
        addObject(rumput9,64*8,600-64);
        rumput rumput20 = new rumput();
        addObject(rumput20,64*15,600-64);
        rumput rumput18 = new rumput();
        addObject(rumput18,64*16,600-64);
        tanah tanah13 = new tanah();
        addObject(tanah13,64*17,600-64);

        //tingkat 3
        rumput rumput7 = new rumput();
        addObject(rumput7,64*6,600-64*2);
        rumput rumput17 = new rumput();
        addObject(rumput17,64*17,600-64*2);
    }
}
