package Level3.Ex1;

public class TennisNews extends News {
    private String competition;
    private String player;

    private static final double INIT_PRICE = 150;
    private static final double PLAYER_BONUS = 100;

    private static final int INIT_SCORE = 5;

    {
        setPrice(INIT_PRICE);
        setScore(INIT_SCORE);
    }

    public TennisNews(Editor editor, String holder, String competition, String player) {
        super(editor, holder);
        this.competition = competition;
        this.player = player;
    }

    public String getCompetition() {
        return competition;
    }

    public String getPlayer() {
        return player;
    }

    @Override
    public double calculateNewsPrice() {
        double totalPrice = super.getPrice();
        if(player.equalsIgnoreCase("Nadal") ||
            player.equalsIgnoreCase("Federer") ||
            player.equalsIgnoreCase("Djokovic")) totalPrice += PLAYER_BONUS;
        return totalPrice;
    }
}
