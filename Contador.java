import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    
    int start;
    int n;
    
    public Contador(int n, int start)
    {
        this.start = start;
        this.n = n;
        
        switch(n)
        {
            case 1:
                setImage(new GreenfootImage("puntos: "+start, 20, Color.WHITE, Color.BLACK));
                break;
            case 2:
                setImage(new GreenfootImage("Vidas: "+start, 20, Color.WHITE, Color.BLACK));
                break;
            case 3:
                setImage(new GreenfootImage("Balas: "+start, 20, Color.WHITE, Color.BLACK));
                break;
            case 4:
                setImage(new GreenfootImage("Nivel: "+start, 20, Color.WHITE, Color.BLACK));
                break;
        }
    }
    
    public void cambiaCont(int amount)
    {
        
        start += amount;
        switch(n)
        {
            case 1:
                setImage(new GreenfootImage("puntos: " + start, 20, Color.WHITE, Color.BLACK));
                break;
            case 2:
                setImage(new GreenfootImage("Vidas: "+start, 20, Color.WHITE, Color.BLACK));
                break;
            case 3:
                setImage(new GreenfootImage("Balas: "+start, 20, Color.WHITE, Color.BLACK));
                break;
            case 4:
                setImage(new GreenfootImage("Nivel: "+start, 20, Color.WHITE, Color.BLACK));
                break;
        }
        
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
