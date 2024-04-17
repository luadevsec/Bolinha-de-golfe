
public class Item {
    
    public static enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW,
        ORANGE,
        PURPLE,
        PINK,
        BLACK,
        WHITE;
    }
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int size;
    private int valor;

    private Color color = null;

    public Item(int x, int y) {
        this.x = x;
        this.y = y;
        this.dx = getRandomNumber(1, 10);
        this.dy = getRandomNumber(1, 10);
        this.size = getRandomNumber(5, 20);
        this.valor = this.size * getRandomNumber(10, 100) / (dx + dy);
        this.color = Color.values()[getRandomNumber(0, Color.values().length - 1)];
    }
    public Item() {
        this.x = getRandomNumber(10, 700);
        this.y = getRandomNumber(10, 500);
        this.dx = getRandomNumber(1, 10);
        this.dy = getRandomNumber(1, 10);
        this.size = getRandomNumber(5, 20);
        this.valor = this.size * getRandomNumber(10, 100) / (dx + dy);
        this.color = Color.values()[getRandomNumber(0, Color.values().length - 1)];
    }
    

    public int x() {
        return x;
    }

    

    public void x(int x) {
        this.x = x;
    }

    public int y() {
        return y;
    }

    public void y(int y) {
        this.y = y;
    }

    public int dx() {
        return dx;
    }

    public void dx(int dx) {
        this.dx = dx;
    }

    public int dy() {
        return dy;
    }

    public void dy(int dy) {
        this.dy = dy;
    }

    public int size() {
        return size;
    }

    public void size(int size) {
        this.size = size;
    }

    public int valor() {
        return valor;
    }

    public void valor(int valor) {
        this.valor = valor;
    }

    public Color cor() {
        return color;
    }

    public void cor(Color color) {
        this.color = color;
    }

    private int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }


}