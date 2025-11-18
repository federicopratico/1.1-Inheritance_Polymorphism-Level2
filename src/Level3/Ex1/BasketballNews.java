package Level3.Ex1;

public class BasketballNews extends News {
    private String competition;
    private String club;

    private static final double INIT_PRICE = 250;
    private static final double COMP_BONUS = 75;
    private static final double CLUB_BONUS = 75;
    private static final int INIT_SCORE = 5;

    {
        setPrice(INIT_PRICE);
        setScore(INIT_SCORE);
    }

    public BasketballNews(Editor editor, String holder, String competition, String club) {
        super(editor, holder);
        this.competition = competition;
        this.club = club;
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    @Override
    public double calculateNewsPrice() {
        double totalPrice = super.getPrice();
        if(competition.equalsIgnoreCase("Euroliga")) totalPrice += COMP_BONUS;
        if(club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Madrid")) totalPrice += CLUB_BONUS;
        return totalPrice;
    }
}
