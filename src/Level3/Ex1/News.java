package Level3.Ex1;

public abstract class News {
    private Editor editor;
    private String holder;
    private String text;
    private int score;
    private double price;

    public News(Editor editor, String holder) {
        this.editor = editor;
        this.holder = holder;
        this.text = "";
    }

    public Editor getEditor() {
        return editor;
    }

    public String getHolder() {
        return holder;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public double getPrice() {
        return price;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "News{" +
                "editor=" + editor +
                ", holder='" + holder + '\'' +
                ", text='" + text + '\'' +
                ", score=" + score +
                ", price=" + price +
                '}';
    }

    public abstract double calculateNewsPrice();

}
