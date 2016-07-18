import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    private GreenfootImage img;
    private int boton;
    
    public Boton( String cad, int num )
    {
      img = new GreenfootImage( cad);
      setImage( img );
      boton = num;
    }
    
    public void checaMovDeMouse()
    {
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse.getActor() == this){
                switch(boton){
                    
                    case 1: setImage("bJugar1.png");
                    break;
                    case 2: setImage("bAyuda1.png");
                    break;
                    case 3: setImage("bCreditos1.png");
                    break;
                    case 4: setImage("bIrMenu1.png");
                    break;
                    
                            
                    }
            }
            else{
                switch(boton){
                    
                    case 1: setImage(img);
                    break;
                    case 2: setImage(img);
                    break;
                    case 3: setImage(img);
                    break;
                    case 4: setImage(img);
                    break;
                    
                  }
            }
    }
   }
   
   public void checaBotonPre()
   {
      
       if(Greenfoot.mouseClicked(this)){
        
        WombatWorld mundo = (WombatWorld)getWorld();
        
        
        eliminaMenu();
        switch( boton )
        {
           case 1: mundo.prepare();
           break;
           case 2: mundo.ayuda();
           break;
           case 3: mundo.creditos();
           break;
           case 4: mundo.menu();
           break;
        }
       
        
        
        if(boton==2||boton==3||boton==1)
        mundo.addObject(new Boton("bIrMenu.png", 4), 10, 15 ); 
        
         
        
       // getWorld().removeObject( this );
        
      }
   }
   
   private void eliminaMenu()
   {
      getWorld().removeObjects(getWorld().getObjects(Boton.class));
   }
   
    public void act() 
    {
        checaMovDeMouse();
        checaBotonPre();
    }    
}
