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

    private double xPosition = 0.0; // Membervariable der x Position.
    private double yPosition = 0.0; // Membervariable der y Position.

    /**
     * @see tpe.oo.interfaces.api.AnalogController#up
     */
    @Override
    public void up(double percentage) {
        yPosition -= percentage;
    }

    /**
     * @see tpe.oo.interface.api.AnalogController#down
     */
    @Override
    public void down(double percentage) {
        yPosition += percentage;
    }

    /**
     * @see tpe.oo.interface.api.AnalogController#left
     */
    @Override
    public void left(double percentage) {
        xPosition -= percentage;
    }

    /**
     * @see tpe.oo.interface.api.AnalgoController#right
     */
    @Override
    public void right(double percentage) {
        xPosition += percentage;
    }
    public Point getPosition() {
        return new Point((int)xPosition,(int)yPosition);
    }
}
