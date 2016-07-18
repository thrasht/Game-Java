import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage
import java.awt.Color;
import java.util.Random;

/**
 * A world where wombats live.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class WombatWorld extends World
{
    private Contador puntos;
    private Contador vid;
    private Contador municion;
    private Contador level;
        
        
    public WombatWorld() 
    {
        super(22,14, 43);  
        
        menu();
        
        //prepare();
        
    }
    
    public void menu()
    {
        setBackground("FondoI.jpg");
        
        removeObjects(getObjects(obstaculo.class));
        removeObjects(getObjects(bloque.class));
        removeObjects(getObjects(Enemigo.class));
        removeObjects(getObjects(Fantasma.class));
        removeObjects(getObjects(meta.class));
        removeObjects(getObjects(Vida.class));
        removeObjects(getObjects(Recarga.class));
        removeObjects(getObjects(Llave.class));
        removeObjects(getObjects(Jugador.class));
        removeObjects(getObjects(Nivel.class));
        removeObjects(getObjects(Contador.class));
        
        addObject( new Boton( "bJugar.png", 1 ), 11, 6  );
        addObject( new Boton( "bAyuda.png", 2 ) , 11, 8 );
        addObject( new Boton( "bCreditos.png", 3), 11, 10 );
    }
        

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    

    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    /*public void randomLeaves(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }*/


    public void ayuda()
    {
      setBackground("Ayuda.JPG");
    }
    
    public void creditos()
    {
      setBackground("Creditos.JPG");
    } 
    
    public Contador cPuntos()
    {
        return puntos;
    }
    
    public Contador cVidas()
    {
        return vid;
    }
    
    public Contador cNivel()
    {
        return level;
    }
    
    public Contador cMuniciones()
    {
        return municion;
    }
    
    
    
    public void prepare()
    {
        
        puntos = new Contador(1,0);
        addObject(puntos,20,4);
        vid = new Contador(2,5);
        addObject(vid,20,6);
        municion = new Contador(3,30);
        addObject(municion,20,8);
        level = new Contador(4,1);
        addObject(level,20,10);
       
        
        setBackground("Fondo.jpg");
        Jugador jugador = new Jugador();
        addObject(jugador, 7, 5);
        bloque obstaculo = new bloque();
        addObject(obstaculo, 3, 3);
        bloque obstaculo2 = new bloque();
        addObject(obstaculo2, 3, 5);
        bloque obstaculo3 = new bloque();
        addObject(obstaculo3, 3, 7);
        bloque obstaculo4 = new bloque();
        addObject(obstaculo4, 3, 9);
        bloque obstaculo5 = new bloque();
        addObject(obstaculo5, 5, 9);
        bloque obstaculo6 = new bloque();
        addObject(obstaculo6, 8, 9);
        bloque obstaculo7 = new bloque();
        addObject(obstaculo7, 7, 3);
        bloque obstaculo8 = new bloque();
        addObject(obstaculo8, 10, 3);
        bloque obstaculo9 = new bloque();
        addObject(obstaculo9, 10, 5);
        bloque obstaculo10 = new bloque();
        addObject(obstaculo10, 10, 7);
        bloque obstaculo11 = new bloque();
        addObject(obstaculo11, 6, 3);
        bloque obstaculo12 = new bloque();
        addObject(obstaculo12, 5, 3);
        bloque obstaculo13 = new bloque();
        addObject(obstaculo13, 3, 6);
        bloque obstaculo14 = new bloque();
        addObject(obstaculo14, 3, 8);
        bloque obstaculo15 = new bloque();
        addObject(obstaculo15, 2, 9);
        bloque obstaculo16 = new bloque();
        addObject(obstaculo16, 10, 8);
        bloque obstaculo17 = new bloque();
        addObject(obstaculo17, 10, 9);
        bloque obstaculo18 = new bloque();
        addObject(obstaculo18, 9, 3);
        bloque obstaculo19 = new bloque();
        addObject(obstaculo19, 12, 3);
        bloque obstaculo20 = new bloque();
        addObject(obstaculo20, 13, 3);
        Llave llave = new Llave();
        addObject(llave, 14, 6);
        Enemigo enemigo = new Enemigo();
        addObject(enemigo, 11, 3);
        Enemigo enemigo2 = new Enemigo();
        addObject(enemigo2, 6, 2);
        Fantasma fantasma = new Fantasma();
        addObject(fantasma, 6, 9);
        Fantasma fantasma2 = new Fantasma();
        addObject(fantasma2, 2, 11);
        obstaculo obstaculo21 = new obstaculo();
        addObject(obstaculo21, 10, 6);
        fantasma.setLocation(4, 11);
        removeObject(obstaculo15);
        bloque obstaculo22 = new bloque();
        addObject(obstaculo22, 4, 9);
        bloque obstaculo23 = new bloque();
        addObject(obstaculo23, 6, 9);
        bloque obstaculo24 = new bloque();
        addObject(obstaculo24, 7, 9);
        bloque obstaculo25 = new bloque();
        addObject(obstaculo25, 9, 9);
        bloque obstaculo26 = new bloque();
        addObject(obstaculo26, 11, 9);
        bloque obstaculo27 = new bloque();
        addObject(obstaculo27, 13, 9);
        bloque obstaculo28 = new bloque();
        addObject(obstaculo28, 12, 9);
        bloque obstaculo29 = new bloque();
        addObject(obstaculo29, 14, 9);
        bloque obstaculo30 = new bloque();
        addObject(obstaculo30, 14, 3);
        bloque obstaculo31 = new bloque();
        addObject(obstaculo31, 15, 3);
        bloque obstaculo32 = new bloque();
        addObject(obstaculo32, 16, 4);
        bloque obstaculo33 = new bloque();
        addObject(obstaculo33, 16, 3);
        bloque obstaculo34 = new bloque();
        addObject(obstaculo34, 16, 5);
        bloque obstaculo35 = new bloque();
        addObject(obstaculo35, 16, 6);
        bloque obstaculo36 = new bloque();
        addObject(obstaculo36, 16, 7);
        bloque obstaculo37 = new bloque();
        addObject(obstaculo37, 16, 8);
        bloque obstaculo38 = new bloque();
        addObject(obstaculo38, 16, 9);
        bloque obstaculo39 = new bloque();
        addObject(obstaculo39, 15, 9);
        bloque obstaculo40 = new bloque();
        addObject(obstaculo40, 3, 4);
        bloque obstaculo41 = new bloque();
        addObject(obstaculo41, 4, 3);
        bloque obstaculo42 = new bloque();
        addObject(obstaculo42, 8, 3);
        enemigo.setLocation(12, 6);
        bloque obstaculo43 = new bloque();
        addObject(obstaculo43, 11, 3);
        bloque obstaculo44 = new bloque();
        addObject(obstaculo44, 10, 4);
        removeObject(obstaculo5);
        removeObject(obstaculo24);
        removeObject(obstaculo28);
        removeObject(obstaculo29);
        bloque obstaculo45 = new bloque();
        addObject(obstaculo45, 3, 10);
        bloque obstaculo46 = new bloque();
        addObject(obstaculo46, 3, 11);
        fantasma.setLocation(1, 9);
        removeObject(fantasma2);
        removeObject(fantasma);
        bloque obstaculo47 = new bloque();
        addObject(obstaculo47, 4, 11);
        bloque obstaculo48 = new bloque();
        addObject(obstaculo48, 5, 11);
        bloque obstaculo49 = new bloque();
        addObject(obstaculo49, 6, 11);
        bloque obstaculo50 = new bloque();
        addObject(obstaculo50, 7, 11);
        bloque obstaculo51 = new bloque();
        addObject(obstaculo51, 8, 11);
        bloque obstaculo52 = new bloque();
        addObject(obstaculo52, 9, 11);
        bloque obstaculo53 = new bloque();
        addObject(obstaculo53, 10, 11);
        bloque obstaculo54 = new bloque();
        addObject(obstaculo54, 11, 11);
        bloque obstaculo55 = new bloque();
        addObject(obstaculo55, 12, 11);
        bloque obstaculo56 = new bloque();
        addObject(obstaculo56, 13, 11);
        bloque obstaculo57 = new bloque();
        addObject(obstaculo57, 14, 11);
        bloque obstaculo58 = new bloque();
        addObject(obstaculo58, 15, 11);
        bloque obstaculo59 = new bloque();
        addObject(obstaculo59, 16, 11);
        bloque obstaculo60 = new bloque();
        addObject(obstaculo60, 16, 10);
        removeObject(obstaculo25);
        removeObject(obstaculo17);
        removeObject(obstaculo26);
        obstaculo22.setLocation(4, 8);
        obstaculo23.setLocation(6, 8);
        obstaculo6.setLocation(8, 8);
        obstaculo27.setLocation(13, 8);
        obstaculo39.setLocation(15, 8);
        llave.setLocation(4, 10);
        meta meta = new meta();
        addObject(meta, 15, 4);
        obstaculo obstaculo61 = new obstaculo();
        addObject(obstaculo61, 5, 8);
        obstaculo obstaculo62 = new obstaculo();
        addObject(obstaculo62, 5, 9);
        obstaculo obstaculo63 = new obstaculo();
        addObject(obstaculo63, 4, 9);
        obstaculo obstaculo64 = new obstaculo();
        addObject(obstaculo64, 5, 10);
        obstaculo obstaculo65 = new obstaculo();
        addObject(obstaculo65, 6, 10);
        obstaculo obstaculo66 = new obstaculo();
        addObject(obstaculo66, 6, 9);
        obstaculo obstaculo67 = new obstaculo();
        addObject(obstaculo67, 7, 9);
        obstaculo obstaculo68 = new obstaculo();
        addObject(obstaculo68, 7, 10);
        obstaculo obstaculo69 = new obstaculo();
        addObject(obstaculo69, 7, 8);
        obstaculo obstaculo70 = new obstaculo();
        addObject(obstaculo70, 7, 8);
        obstaculo obstaculo71 = new obstaculo();
        addObject(obstaculo71, 6, 7);
        obstaculo obstaculo72 = new obstaculo();
        addObject(obstaculo72, 8, 7);
        obstaculo obstaculo73 = new obstaculo();
        addObject(obstaculo73, 7, 7);
        obstaculo obstaculo74 = new obstaculo();
        addObject(obstaculo74, 5, 7);
        obstaculo obstaculo75 = new obstaculo();
        addObject(obstaculo75, 5, 7);
        obstaculo obstaculo76 = new obstaculo();
        addObject(obstaculo76, 4, 7);
        obstaculo obstaculo77 = new obstaculo();
        addObject(obstaculo77, 9, 7);
        obstaculo obstaculo78 = new obstaculo();
        addObject(obstaculo78, 9, 8);
        obstaculo obstaculo79 = new obstaculo();
        addObject(obstaculo79, 9, 9);
        obstaculo obstaculo80 = new obstaculo();
        addObject(obstaculo80, 8, 9);
        obstaculo obstaculo81 = new obstaculo();
        addObject(obstaculo81, 8, 10);
        obstaculo obstaculo82 = new obstaculo();
        addObject(obstaculo82, 9, 10);
        removeObject(obstaculo61);
        removeObject(obstaculo66);
        jugador.setLocation(4, 4);
        obstaculo obstaculo83 = new obstaculo();
        addObject(obstaculo83, 9, 6);
        obstaculo obstaculo84 = new obstaculo();
        addObject(obstaculo84, 9, 5);
        obstaculo83.setLocation(8, 6);
        obstaculo84.setLocation(4, 6);
        obstaculo obstaculo85 = new obstaculo();
        addObject(obstaculo85, 5, 6);
        enemigo2.setLocation(7, 6);
        obstaculo obstaculo86 = new obstaculo();
        addObject(obstaculo86, 6, 6);
        obstaculo obstaculo87 = new obstaculo();
        addObject(obstaculo87, 6, 5);
        obstaculo obstaculo88 = new obstaculo();
        addObject(obstaculo88, 6, 4);
        obstaculo obstaculo89 = new obstaculo();
        addObject(obstaculo89, 7, 4);
        obstaculo obstaculo90 = new obstaculo();
        addObject(obstaculo90, 7, 5);
        obstaculo obstaculo91 = new obstaculo();
        addObject(obstaculo91, 8, 5);
        obstaculo obstaculo92 = new obstaculo();
        addObject(obstaculo92, 9, 4);
        obstaculo obstaculo93 = new obstaculo();
        addObject(obstaculo93, 8, 4);
        obstaculo obstaculo94 = new obstaculo();
        addObject(obstaculo94, 9, 5);
        obstaculo obstaculo95 = new obstaculo();
        addObject(obstaculo95, 11, 8);
        obstaculo obstaculo96 = new obstaculo();
        addObject(obstaculo96, 12, 8);
        obstaculo obstaculo97 = new obstaculo();
        addObject(obstaculo97, 14, 8);
        enemigo.setLocation(11, 10);
        obstaculo obstaculo98 = new obstaculo();
        addObject(obstaculo98, 13, 4);
        obstaculo obstaculo99 = new obstaculo();
        addObject(obstaculo99, 13, 5);
        obstaculo obstaculo100 = new obstaculo();
        addObject(obstaculo100, 13, 6);
        obstaculo obstaculo101 = new obstaculo();
        addObject(obstaculo101, 13, 7);
        obstaculo obstaculo102 = new obstaculo();
        addObject(obstaculo102, 15, 7);
        obstaculo obstaculo103 = new obstaculo();
        addObject(obstaculo103, 14, 7);
        obstaculo obstaculo104 = new obstaculo();
        addObject(obstaculo104, 14, 6);
        obstaculo obstaculo105 = new obstaculo();
        addObject(obstaculo105, 15, 6);
        obstaculo obstaculo106 = new obstaculo();
        addObject(obstaculo106, 14, 5);
        obstaculo106.setLocation(12, 4);
        Enemigo enemigo3 = new Enemigo();
        addObject(enemigo3, 12, 5);
        obstaculo obstaculo107 = new obstaculo();
        addObject(obstaculo107, 11, 5);
        obstaculo obstaculo108 = new obstaculo();
        addObject(obstaculo108, 11, 6);
        obstaculo obstaculo109 = new obstaculo();
        addObject(obstaculo109, 11, 7);
        obstaculo obstaculo110 = new obstaculo();
        addObject(obstaculo110, 13, 7);
        obstaculo obstaculo111 = new obstaculo();
        addObject(obstaculo111, 12, 7);
        obstaculo obstaculo112 = new obstaculo();
        addObject(obstaculo112, 12, 6);
        obstaculo103.setLocation(15, 10);
        obstaculo97.setLocation(15, 9);
        obstaculo111.setLocation(12, 10);
        obstaculo80.setLocation(14, 10);
        obstaculo108.setLocation(14, 9);
        obstaculo95.setLocation(11, 9);
        obstaculo79.setLocation(10, 9);
        obstaculo108.setLocation(13, 9);
        obstaculo102.setLocation(14, 7);

        Vida vida = new Vida();
        addObject(vida,15,10);

        obstaculo obs = new obstaculo();
        addObject(obs,15,10);

        Recarga recarga = new Recarga();
        addObject(recarga, 15, 7);
    }
    
    
    
    
    public void jugar()
    {
        
    }
    
    
    public void nivel3()
    {
        
    }
        
    
    
}