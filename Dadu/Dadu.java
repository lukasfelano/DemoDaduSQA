import java.util.Random;
import java.awt.Color;

public final class Dadu {
  public static final int DEFAULT_SISI = 6;

  private Random randGenerator = new Random();

  private final int jumSisi;
  private int hasil;
  private Random r;
  private Random g;
  private Random b;
  
  private Color[] color;
  
  public Dadu() {
    this(DEFAULT_SISI);
  }

  public Dadu(int numSides) {
    this.jumSisi = numSides;
    color =  new Color[jumSisi];
    
    for(int i=0 ;i<jumSisi;i++){ //perulangan untuk memberi warna pada tiap sisi
        r = new Random();
        g = new Random();
        b = new Random();
        
        color[i] = new Color(r.nextInt(256),g.nextInt(256),b.nextInt(256)); //memberikan warna sisi/tampungan warna
        
        if(i>0){ //untuk melakukan pengecekan apabila randomnya sama dengan yang sudah ditampung
            for(int j=i;j >0;j--){
                if(color[i] == color[i-j]){
                    color[i] = null;
                    i--;
                }
            }
        }
    }
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
