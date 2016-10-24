package tpe.oo.ueberschreiben;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import de.smits_net.games.framework.sprite.Direction;
import de.smits_net.games.framework.board.Board;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Alien, das durch das Bild läuft. */
    private Alien alien;
    private Alien alien2;
    private Alien alien3;
    private Alien alien4;
    private Alien alien5;


    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 800), Color.BLACK);

        // Alien initialisieren
        alien = new Alien(this, new Point(156, 489 + new Random().nextInt(100)), Direction.EAST);
        alien2 = new Alien(this, new Point(784, 45 + new Random().nextInt(100)), Direction.WEST);
        alien3 = new Alien(this, new Point(371, 740 + new Random().nextInt(100)), Direction.SOUTHWEST);
        alien4 = new Alien(this, new Point(260, 721 + new Random().nextInt(100)), Direction.NORTH);
        alien5 = new Alien(this, new Point(400, 50 + new Random().nextInt(100)), Direction.NORTHEAST);

        // Alien soll auf Maus-Klicks reagieren
        addMouseListener(alien);
        addMouseListener(alien2);
        addMouseListener(alien3);
        addMouseListener(alien4);
        addMouseListener(alien5);

    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        alien.draw(g, this);
        alien2.draw(g, this);
        alien3.draw(g, this);
        alien4.draw(g, this);
        alien5.draw(g, this);
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        alien.move();
        alien2.move();
        alien3.move();
        alien4.move();
        alien5.move();
        return  alien.isVisible() ||
                alien2.isVisible()||
                alien3.isVisible()||
                alien4.isVisible()||
                alien5.isVisible();

    }
}
