import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Personaje
{
    int direction;
    int vidas;

    public Enemigo()
    {
        direction=0;
        vidas=3;
    }
     /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        direction=Greenfoot.getRandomNumber(6);
        move(direction);
        tocaBala();
    } 
    public void reduceVidas()
    {
        vidas--;
    }
    public int vidas()
    {
        return vidas;
    }
    
    public void tocaBala()
    {
        Actor dano = getOneIntersectingObject(bala.class);
        
        if(dano!=null)
        {
            reduceVidas();
            if(vidas==0)
            {
                WombatWorld mundo = (WombatWorld) getWorld();
                Contador counter = mundo.cPuntos(); 
                counter.cambiaCont(100);
                getWorld().removeObject(this);
                
            }
        }
    }
    
    
        
}
