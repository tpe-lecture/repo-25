package tpe.oo.interfaces.impl;

import java.awt.Point;
import tpe.oo.interfaces.api.AnalogController;

/**
 * Implementierung eines analogen Joysticks.
 *
 * @author k.pettes
 *
 */
public class AnalogControllerImp implements AnalogController {

    private double x = 0.0;
    private double y = 0.0;

    /**
     * @see tpe.oo.interfaces.api.AnalogController#up
     */
    public void up(double percentage) {
        y -= percentage;
    }

    /**
     * @see tpe.oo.interface.api.AnalogController#down
     */
    public void down(double percentage) {
        y += percentage;
    }

    /**
     * @see tpe.oo.interface.api.AnalogController#left
     */
    public void left(double percentage) {
        x -= percentage;
    }

    /**
     * @see tpe.oo.interface.api.AnalgoController#right
     */
    public void right(double percentage) {
        x += percentage;
    }
    public Point getPosition() {
        return new Point((int)x,(int)y);
    }
}
