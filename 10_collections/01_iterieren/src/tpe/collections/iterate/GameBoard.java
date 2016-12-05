package tpe.collections.iterate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Anzahl der Münzen. */
    private static final int NUM_COINS = 1000;

    /** Münzgenerator. */
    private CoinGenerator generator;

    /** Erstellt eine Liste. */
     ArrayList<Sprite> list;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(600, 600), Color.BLACK);

        generator = new CoinGenerator(this, NUM_COINS);
        list = new ArrayList<>();
        Iterator<Sprite> test = generator.iterator();
        test.forEachRemaining((next) -> list.add(next));

        // TODO: Münzen generieren
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public synchronized void drawGame(Graphics g) {
        list.forEach((s) -> s.draw(g));
        ;
    }
    // TODO: Münzen zeichnen

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        return true;
    }
}
