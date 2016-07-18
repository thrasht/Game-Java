import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.util.List;
import java.util.ArrayList;

/**
 * Wombat. A Wombat moves forward until it can't do so anymore, at
 * which point it turns left. If a wombat finds a leaf, it eats it.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Jugador extends Personaje implements Constantes
{

    private int direction;
    private int llaves;
    private int vidas;
    private int nivel;
    private int balas;
   

    public Jugador()
    {
        setDirection(EAST);
        llaves = 0;
        vidas=5;
        nivel=1;
        balas=30;
        
    }
    
    
        

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        
        avanzaNivel();
        if(encuentraVida())
        aumentaVida();
        
        if(encuentraRecarga())
        recarga();
        
        
        if(foundLlave())
        {
            eatLlave();
        }
        else /*if(canMove())
        {*/detectKey();
        tocaEnemigo();   
             
           
        /*}
        else 
        {
            turnRandom();//turnLeft();
        }*/
    }

    /**
     * Check whether there is a leaf in the same cell as we are.
     */
    
    
    public boolean detectKey()
    {
        if (Greenfoot.isKeyDown("space")) 
        {
            if(balas>0)
            {
                WombatWorld mundo = (WombatWorld) getWorld();
                Contador counter = mundo.cMuniciones(); 
                counter.cambiaCont(-1);
                getWorld().addObject(new bala(this,direction), getX(), getY());
                balas--;
            }
        }
        else
        if (Greenfoot.isKeyDown("enter")) 
        {
            
                getWorld().addObject(new Mina(this), getX(), getY());
                
            
        }
        else
        if(Greenfoot.isKeyDown("left"))
        {
            setDirection(WEST);
            move(direction);
        }else
        if(Greenfoot.isKeyDown("right"))
        {
            setDirection(EAST);
            move(direction);
        }else if(Greenfoot.isKeyDown("down"))
        {
            setDirection(SOUTH);
            move(direction);
        }else
        if(Greenfoot.isKeyDown("up"))
        {
            setDirection(NORTH);
            move(direction);
        }else
        
        return false ;
        
        return true;
    }    
    
    /**
     * Sets the direction we're facing.
     */
    public void setDirection(int direction)
    {
        this.direction = direction; //this 
        switch(direction) {
            case SOUTH :
                setImage("jugador.jpg");
                setRotation(90);
                break;
            case EAST :
                setRotation(0);
                setImage("jugador.jpg");
                break;
            case NORTH :
                setImage("jugador.jpg");
                setRotation(270);
                break;
            case WEST :
                setImage("jugadorIzq.jpg");
                setRotation(0);
                break;
            default :
                break;
        }
    }

    /**
     * Tell how many leaves we have eaten.
     */
    public boolean foundLlave()
    {
        Actor llave = getOneObjectAtOffset(0, 0, Llave.class);
        if(llave != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Eat a leaf.
     */
    public void eatLlave()
    {
        Actor llave = getOneObjectAtOffset(0, 0, Llave.class);
        if(llave != null) {
            // eat the leaf...o come hoja
            getWorld().removeObject(llave);
            llaves++; 
        }
    }
    
    public int llavesConseguidas()
    {
        return llaves;
    }
    
    
    public void reduceVida()
    {
        vidas--;
    }
    
    public void aumentaVida()
    {
        vidas++;
        WombatWorld mundo = (WombatWorld) getWorld();
        Contador counter = mundo.cVidas(); 
        counter.cambiaCont(1);
    }
    public void tocaEnemigo()
    {
        World myWorld=getWorld();
        
        Actor enemig = getOneIntersectingObject(Enemigo.class);
        if(enemig!=null)
        {
            this.reduceVida();
            WombatWorld mundo = (WombatWorld) getWorld();
            Contador counter = mundo.cVidas(); 
            counter.cambiaCont(-1);
        }
        
        if(vidas<0)
        {
            Nivel N = new Nivel();
            myWorld.addObject(N, 0, 0);
            N.finali();
            myWorld.removeObject(this);
            
        }
    }
    
    public void avanzaNivel()
    {
        World myWorld = getWorld();
        Nivel N = new Nivel();
        myWorld.addObject(N, 0, 0);
        
        
        Actor Jug = getOneIntersectingObject(meta.class); 
        
        if(Jug != null&&llaves==1)
        {
            /*List obst = myWorld.getObjects(obstaculo.class);
            List bloq = myWorld.getObjects(bloque.class);
            */
            myWorld.removeObjects(myWorld.getObjects(obstaculo.class));
            myWorld.removeObjects(myWorld.getObjects(bloque.class));
            myWorld.removeObjects(myWorld.getObjects(Enemigo.class));
            myWorld.removeObjects(myWorld.getObjects(Fantasma.class));
            myWorld.removeObjects(myWorld.getObjects(meta.class));
            myWorld.removeObjects(myWorld.getObjects(Vida.class));
            myWorld.removeObjects(myWorld.getObjects(Recarga.class));
            
            WombatWorld mundo = (WombatWorld) getWorld();
            Contador counter = mundo.cPuntos(); 
            counter.cambiaCont(1000*nivel);
            nivel++;
            counter = mundo.cNivel(); 
            counter.cambiaCont(1);
            switch(nivel)
            {
                case 2:
                    setLocation(4,2);
                    N.n2();
                    llaves=0;
                    break;
                case 3:
                    setLocation(2,2);
                    N.n3();
                    llaves=0;
                    break;
                case 4:
                    setLocation(10,3);
                    N.finali();
                   
                    break;
            }
        }
    }
    
    public boolean encuentraVida()
    {
        World myWorld=getWorld();
        
        Actor vida = getOneIntersectingObject(Vida.class);
        if(vida!=null)
        {
            myWorld.removeObject(vida);
            return true;
        }
        else return false;
       
    }
    
    public boolean encuentraRecarga()
    {
        Actor recarga = getOneIntersectingObject(Recarga.class);
        
        if(recarga!=null)
        {
            getWorld().removeObject(recarga);
            return true;
        }
        else
        return false;
    }
    public void recarga()
    {
        
        balas = balas + 20;
        WombatWorld mundo = (WombatWorld) getWorld();
        Contador counter = mundo.cMuniciones(); 
        counter.cambiaCont(20);
    }
        
}