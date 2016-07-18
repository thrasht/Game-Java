import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala extends Personaje implements Constantes
{
    
    private Jugador Jug;
    private int direccion;
    /**
     * Constructor for a Shot. You must specify the ship the shot comes from.
     */
    public bala(Jugador Jug, int direccion)
    {
        this.Jug = Jug;
        this.direccion=direccion;
    }
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int ypos = getY();
        int xpos = getX();
        if(canMove(direccion))
        {
            if(direccion==NORTH)
            {
                ypos = ypos - 1;
            }
            else
            if(direccion==SOUTH)
            {
                ypos = ypos + 1;
            }
            else
            if(direccion==WEST)
            {
                xpos = xpos - 1;
            }
            else
            if(direccion==EAST)
            {
                xpos = xpos + 1;
            }
            setLocation(xpos, ypos);
            Actor obs = getOneIntersectingObject(Enemigo.class);
            
            if (obs != null)
            {
                
                
                
                    //getWorld().removeObject(obs);
                    getWorld().removeObject(this);
                
            }
            
        }
        else {
            // I reached the top of the screen
            getWorld().removeObject(this);// Add your action code here.
    }   
    

    
    
    }
}
