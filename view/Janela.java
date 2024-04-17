import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela extends JFrame {

    private static final long serialVersionUID = 1L;
    private static int dinheiro;
    private static int preco;
    private static int bolas;
    private static ArrayList<Item> sandbox = new ArrayList<Item>();

    private Painel painel = new Painel(sandbox);
    private JButton comprar = new JButton("Comprar - " + preco);
    private static JLabel dinheiroLabel = new JLabel("Dinheiro: " + dinheiro);
    private static JLabel bolasLabel = new JLabel("Bolas: " + bolas);
    private JPanel painelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));


    public static void earn (int valor) {
        dinheiro += valor;
        atualizar();
    }

    public static void atualizar(){
        dinheiroLabel.setText("Dinheiro: " + dinheiro);
        bolasLabel.setText("Bolas: " + bolas);
        
    }

 
    public Janela() {
        super("Bolinha de golfe");
        painelSuperior.add(bolasLabel);
        painelSuperior.add(dinheiroLabel);
    
        // Definindo um tamanho para a janela
        setSize(800, 600); // Defina o tamanho desejado
    
        this.add(painelSuperior, BorderLayout.NORTH);
        this.add(painel, BorderLayout.CENTER);
        this.add(comprar, BorderLayout.SOUTH);
    
        this.setVisible(true);
    
        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dinheiro >= preco) {
                    sandbox.add(new Item());
                    dinheiro -= preco;
                    bolas++;
                    preco += 50;
                    comprar.setText("Comprar - " + preco);
                    atualizar();
                    painel.repaint();
                }
            }
        });
    
        new Movimentadora(painel, sandbox).start();
    }
    

    public static void main(String[] args) {
        new Janela();

    }
}