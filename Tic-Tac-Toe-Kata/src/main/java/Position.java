import java.util.Objects;

public final class Position {
  private final int positionX;
  private final int positionY;

  public Position(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
  }

  public int positionX() {
    return positionX;
  }

  public int positionY() {
    return positionY;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Position) obj;
    return this.positionX == that.positionX && this.positionY == that.positionY;
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionX, positionY);
  }

  @Override
  public String toString() {
    return "Position[" + "positionX=" + positionX + ", " + "positionY=" + positionY + ']';
  }

  public int getPositionY() {
    return positionY;
  }

  public int getPositionX() {
    return positionX;
  }
}
