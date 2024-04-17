import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Painel extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<Item> sandbox;
    
    public Painel(ArrayList<Item> sandbox) {
        this.sandbox = sandbox;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Item item : sandbox) {
            switch (item.cor()) {
                case RED:
                    g.setColor(Color.RED);
                    break;
                case BLUE:
                    g.setColor(Color.BLUE);
                    break;
                case GREEN:
                    g.setColor(Color.GREEN);
                    break;
                case YELLOW:
                    g.setColor(Color.YELLOW);
                    break;
                case ORANGE:
                    g.setColor(Color.ORANGE);
                    break;
                case PURPLE:
                    g.setColor(Color.MAGENTA);
                    break;
                case PINK:
                    g.setColor(Color.PINK);
                    break;
                case BLACK:
                    g.setColor(Color.BLACK);
                    break;
                case WHITE:
                    g.setColor(Color.WHITE);
                    break;
                
            }
            g.fillOval(item.x(), item.y(), item.size(), item.size());
        }
    }
}