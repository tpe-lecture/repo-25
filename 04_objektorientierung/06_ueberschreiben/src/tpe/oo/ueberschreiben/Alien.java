package tpe.oo.ueberschreiben;

import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.image.StripedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;

/**
 * Ein Alien.
 */
public class Alien extends AnimatedSprite {

    /** Geschwindigkeit des Alien X-Richtung. */
    private static final int ALIEN_SPEED = 15;

    /**
     * Neues Alien anlegen.
     *
     * @param board das Spielfeld
     * @param startPoint Start-Position
     */
    public Alien(Board board, Point startPoint, Direction direct) {
        super(board, startPoint, BoundaryPolicy.JUMP_BACK,
                new AnimatedImage(50, 5, "assets/spike_fist_move_strip5.png"));
        velocity.setVelocity(direct, ALIEN_SPEED);

    }

    /**
     * Alien explodieren lassen.
     */
    public void explode() {
        setActive(false);
        setImages(new AnimatedImage(20,
                new StripedImage("assets/explosion_1.png", 43)));
        setInvisibleAfterFrames(70);
    }

    /**
     * Alien explodiert wenn man mit der Maus darauf klickt.
     */
    public void mousePressed() {
        this.explode();
    }


}
