import java.util.Random;
import java.awt.Color;

public final class Dadu {
  public static final int DEFAULT_SISI = 6;

  private static Random randGenerator = new Random();

  private final int jumSisi;
  private int hasil;
  
  private Color color;
  
  public Color getColor() {
        return color;
  }
    
  public void setColor(Color color) {
        this.color = color;
    }
  
  public Dadu() {
    this(DEFAULT_SISI);
  }

  public Dadu(int numSides) {
    this.jumSisi = numSides;
  }

  public int lempar() {
    hasil = randGenerator.nextInt(jumSisi) + 1;

    return hasil;
  }

  public int getJumSisi() {
    return jumSisi;
  }

  public int getHasil() {
    return hasil;
  }

  @Override
  public String toString() {
    return "Jumlah sisi dadu: " + getJumSisi() + " hasil: " + getHasil();
  }
}
