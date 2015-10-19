import java.awt.Point;

public abstract class StationaryPiece extends ArcadeGamePiece {
    StationaryPiece(PlayingField field, Point point) {
        super(field, point);
    }

    abstract void collideWithPaddle(Paddle paddle, Point point);

    abstract void collideWithPuck(Puck puck, Point point);
}
