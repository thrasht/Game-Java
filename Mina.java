import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


/**
 * Write a description of class Mina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mina extends Actor
{
    Jugador J;
    int cont=0;
    
    public Mina(Jugador J)
    {
        this.J=J;
    }
    public void explota()
    {
        World myWorld = getWorld();
        Actor g;
        
        
        List obstaculos = getObjectsInRange(1,obstaculo.class);
        if(!obstaculos.isEmpty())
        {
            myWorld.removeObjects(obstaculos);
        }
    }
    /**
     * Act - do whatever the Mina wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld = getWorld();
        if(5==cont)
        {
            explota();// Add your action code here.
            myWorld.removeObject(this);
        }
        else
        cont++;
    }    
}
