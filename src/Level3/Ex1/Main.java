package Level3.Ex1;

public class Main {
    public static void main(String[] args) {
        FootballNews f = new FootballNews(null, "None", "Liga de campeones", "Espanyol", "Messi");
        BasketballNews b = new BasketballNews(null, "None", "Euroliga", "Madrid");

        System.out.println(f.calculateNewsPrice());
        System.out.println(b.calculateNewsPrice());


    }
}
