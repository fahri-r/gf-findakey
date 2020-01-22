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
        super(1111, 600, 1); 
        timer.timer=33*15;
        prepare();
    }
    
    public void prepare()
    {
        pintu pintu = new pintu();
        addObject(pintu,64*13+32,600-64*2);

        tanah tanah = new tanah();
        addObject(tanah,0,600);
        tanah tanah2 = new tanah();
        addObject(tanah2,64,600);
        tanah tanah3 = new tanah();
        addObject(tanah3,64*2,600);
        tanah tanah4 = new tanah();
        addObject(tanah4,64*3,600);
        tanah tanah5 = new tanah();
        addObject(tanah5,64*4,600);
        tanah tanah6 = new tanah();
        addObject(tanah6,64*5,600);
        tanah tanah7 = new tanah();
        addObject(tanah7,64*6,600);
        tanah tanah8 = new tanah();
        addObject(tanah8,64*7,600);
        tanah tanah9 = new tanah();
        addObject(tanah9,64*8,600);
        tanah tanah10 = new tanah();
        addObject(tanah10,64*9,600);
        tanah tanah11 = new tanah();
        addObject(tanah11,64*10,600);
        duri duri12 = new duri();
        addObject(duri12,64*11,600-20);
        tanah tanah13 = new tanah();
        addObject(tanah13,64*12,600);
        tanah tanah14 = new tanah();
        addObject(tanah14,64*13,600);
        tanah tanah15 = new tanah();
        addObject(tanah15,64*14,600);
        tanah tanah16 = new tanah();
        addObject(tanah16,64*15,600);
        duri duri17 = new duri();
        addObject(duri17,64*16,600-20);
        duri duri19 = new duri();
        addObject(duri19,64*17,600-20);

        rumput rumput = new rumput();
        addObject(rumput,0,600-64);
        rumput rumput2 = new rumput();
        addObject(rumput2,64,600-64);
        rumput rumput3 = new rumput();
        addObject(rumput3,64*2,600-64);
        rumput rumput4 = new rumput();
        addObject(rumput4,64*3,600-64);
        rumput rumput5 = new rumput();
        addObject(rumput5,64*4,600-64);
        rumput rumput6 = new rumput();
        addObject(rumput6,64*5,600-64);
        rumput rumput7 = new rumput();
        addObject(rumput7,64*6,600-64);
        rumput rumput8 = new rumput();
        addObject(rumput8,64*7,600-64);
        rumput rumput9 = new rumput();
        addObject(rumput9,64*8,600-64);
        rumput rumput10 = new rumput();
        addObject(rumput10,64*9,600-64);
        rumput rumput11 = new rumput();
        addObject(rumput11,64*10,600-64);
        rumput rumput13 = new rumput();
        addObject(rumput13,64*12,600-64);
        rumput rumput14 = new rumput();
        addObject(rumput14,64*13,600-64);
        rumput rumput15 = new rumput();
        addObject(rumput15,64*14,600-64);
        rumput rumput16 = new rumput();
        addObject(rumput16,64*15,600-64);

        rumput rumput20 = new rumput();
        addObject(rumput20,0,384-64);
        rumput rumput21 = new rumput();
        addObject(rumput21,64,384-64);
        rumput rumput22 = new rumput();
        addObject(rumput22,64*4,384-64);
        rumput rumput23 = new rumput();
        addObject(rumput23,64*5,384-64);
        rumput rumput24 = new rumput();
        addObject(rumput24,64*6,384-64);
        gergaji gergaji = new gergaji();
        addObject(gergaji,64*7+32,390-64);
        rumput rumput25 = new rumput();
        addObject(rumput25,64*9,384-64);
        kunci kunci = new kunci();
        addObject(kunci,64,600-64*2);
        gergaji gergaji2 = new gergaji();
        addObject(gergaji2,260,432);
        player player = new player();
        addObject(player,52,224);
        tombol tombol = new tombol();
        addObject(tombol,64*9,384-64*2);
        timer timer = new timer();
        addObject(timer,104,119);
    }
}
