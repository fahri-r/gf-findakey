import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level5 extends level
{
    /**
     * Constructor for objects of class level5.
     * 
     */
    public static int lv5=0;
    public level5()
    {    
        timer.timer=33*25;
        prepare();
    }
    
    public void prepare()
    {
        retry=5;
        tombol tombol = new tombol();
        addObject(tombol,64*15+32,600-64*2);
        gergaji gergaji = new gergaji();
        addObject(gergaji,64*8,600-64*2);
        gergaji gergaji2 = new gergaji();
        addObject(gergaji2,64*5+32,600-64*2);
        gergaji gergaji3 = new gergaji();
        addObject(gergaji3,64*2+32,600-64*2);
        pintu pintu = new pintu();
        addObject(pintu,64*4,600-128);
        player player = new player();
        addObject(player,39,56);
        tanah tanah = new tanah();
        addObject(tanah,0,600);
        rumput rumput = new rumput();
        addObject(rumput,0,600-64);
        tanah tanah1 = new tanah();
        addObject(tanah1,64,600);
        rumput rumput1 = new rumput();
        addObject(rumput1,64,600-64);
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
        tanah tanah10 = new tanah();
        addObject(tanah10,64*9,600);
        rumput rumput10 = new rumput();
        addObject(rumput10,64*9,600-64);
        duri duri11 = new duri();
        addObject(duri11,64*10,580);
        duri duri12 = new duri();
        addObject(duri12,64*11,580);
        tanah tanah13 = new tanah();
        addObject(tanah13,64*12,600);
        rumput rumput13 = new rumput();
        addObject(rumput13,64*12,600-64);
        duri duri14 = new duri();
        addObject(duri14,64*13,580);
        tanah tanah15 = new tanah();
        addObject(tanah15,64*16,600);
        rumput rumput15 = new rumput();
        addObject(rumput15,64*16,600-64);
        tanah tanah14 = new tanah();
        addObject(tanah14,64*15,600);
        rumput rumput14 = new rumput();
        addObject(rumput14,64*15,600-64);
        duri duri17 = new duri();
        addObject(duri17,64*14,580);
        duri duri18 = new duri();
        addObject(duri18,64*17,580);
        kunci kunci = new kunci();
        addObject(kunci,64-20,600-64*2);
        
        
        rumput rumput16 = new rumput();
        addObject(rumput16,0,600-64*7);
        rumput rumput2 = new rumput();
        addObject(rumput2,64,600-64*7);
        rumput rumput17 = new rumput();
        addObject(rumput17,192,600-64*7);
        rumput rumput20 = new rumput();
        addObject(rumput20,320,600-64*7);
        rumput rumput21 = new rumput();
        addObject(rumput21,448,600-64*7);
        rumput rumput18 = new rumput();
        addObject(rumput18,576,600-64*7);
        rumput rumput22 = new rumput();
        addObject(rumput22,704,600-64*7);
        timer timer = new timer();
        addObject(timer,104,119);
    }
}
