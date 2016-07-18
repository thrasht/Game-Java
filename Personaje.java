import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personaje extends Actor implements Constantes
{


    public void move(int direction)
    {
       //setDirection(Greenfoot.getRandomNumber(4));//setdirection: modifica la variable de instancia de direccion
        
        if (!canMove(direction)) 
        {
            return;
        }
        else
        switch(direction) 
        {
            case SOUTH :
                setLocation(getX(), getY() + 1);
                break;
            case EAST :
                setLocation(getX() + 1, getY());
                break;
            case NORTH :
                setLocation(getX(), getY() - 1);
                break;
            case WEST :
                setLocation(getX() - 1, getY());
                break;
        }
        
    }
    
    public boolean canMove(int direction)
    {
        World myWorld = getWorld();
        int x = getX();
        int y = getY();
        switch(direction) {
            case SOUTH :
                y++;
                break;
            case EAST :
                x++;
                break;
            case NORTH :
                y--;
                break;
            case WEST :
                x--;
                break;
        }
        // test for outside border
      
        List obstaculo = myWorld.getObjectsAt(x, y, bloque.class);
        if(obstaculo.isEmpty())
        {
            if (x >= myWorld.getWidth() || y >= myWorld.getHeight())
                return false;
                
            else if (x < 0 || y < 0) 
            return false;
        }        
        
        else
            return false;
            
       obstaculo = myWorld.getObjectsAt(x, y, obstaculo.class);
        if(obstaculo.isEmpty())
        {
            if (x >= myWorld.getWidth() || y >= myWorld.getHeight())
                return false;
                
            else if (x < 0 || y < 0) 
            return false;
        }        
        
        else
            return false;
        
        return true;
            }
    
      
   
        
    /**
     * Tell how man
    /**
     * Act - do whatever the Personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
