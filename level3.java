import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public static int lv3=0;
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    public void prepare()
    {
        pintu pintu = new pintu();
        addObject(pintu,64*12,600-64*3);
        player player = new player();
        addObject(player,40,376);
        //tingkat1
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
        tanah tanah12 = new tanah();
        addObject(tanah12,64*11,600);
        tanah tanah13 = new tanah();
        addObject(tanah13,64*12,600);
        //tingkat 2
        tanah tanah14 = new tanah();
        addObject(tanah14,0,600-64);
        tanah tanah15 = new tanah();
        addObject(tanah15,64,600-64);
        duri duri = new duri();
        addObject(duri,64*2,600-64);
        duri duri16 = new duri();
        addObject(duri16,64*3,600-64);
        tanah tanah22 = new tanah();
        addObject(tanah22,64*4,600-64);
        tanah tanah17 = new tanah();
        addObject(tanah17,64*5,600-64);
        duri duri3 = new duri();
        addObject(duri3,64*6,600-64);
        duri duri18 = new duri();
        addObject(duri18,64*7,600-64);
        tanah tanah23 = new tanah();
        addObject(tanah23,64*8,600-64);
        duri duri19 = new duri();
        addObject(duri19,64*9,600-64);
        duri duri5 = new duri();
        addObject(duri5,64*10,600-64);
        tanah tanah20 = new tanah();
        addObject(tanah20,64*11,600-64);
        tanah tanah21 = new tanah();
        addObject(tanah21,64*12,600-64);
        kunci kunci = new kunci();
        addObject(kunci,64*4,600-64*3);
        
        
        rumput rumput14 = new rumput();
        addObject(rumput14,0,600-64*2);
        rumput rumput15 = new rumput();
        addObject(rumput15,64,600-64*2);
        rumput rumput16 = new rumput();
        addObject(rumput16,64*4,600-64*2);
        rumput rumput17 = new rumput();
        addObject(rumput17,64*5,600-64*2);
        rumput rumput18 = new rumput();
        addObject(rumput18,64*8,600-64*2);
        rumput rumput19 = new rumput();
        addObject(rumput19,64*11,600-64*2);
        rumput rumput20 = new rumput();
        addObject(rumput20,64*12,600-64*2);
    }
}
