import java.util.ArrayList;

public class Movimentadora extends Thread {
    private Painel painel;
    private ArrayList<Item> sandbox;
    
    public Movimentadora(Painel painel, ArrayList<Item> sandbox) {
        this.painel = painel;
        this.sandbox = sandbox;
    }
    
    @Override
public void run() {
    while (true) {
        for (Item item : sandbox) {
            item.x(item.x() + item.dx());
            item.y(item.y() + item.dy());
            
            if (item.x() < 0 || item.x() > painel.getWidth() - item.size()) {
                item.dx(-item.dx());
                // Adiciona o valor do item ao dinheiro quando a bola bate na parede
                Janela.earn(item.valor());
            }
            
            if (item.y() < 0 || item.y() > painel.getHeight() - item.size()) {
                item.dy(-item.dy());
                // Adiciona o valor do item ao dinheiro quando a bola bate na parede
                Janela.earn(item.valor());
            }
        }
        
        painel.repaint();
        
        try {
            Thread.sleep(1000 / 30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

}