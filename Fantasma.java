import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fantasma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fantasma extends Personaje
{
    /**
     * Act - do whatever the Fantasma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vidas;
    int direction;
    
    public Fantasma()
    {
        vidas=5;
        direction=0;
    }
    
    public void act() 
    {
        direction=Greenfoot.getRandomNumber(4);
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
                Contador counter = mundo.cVidas(); 
                counter.cambiaCont(300);
                getWorld().removeObject(this);
            }
        }
    }
}
