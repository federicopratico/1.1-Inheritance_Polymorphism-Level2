package Level3.Ex1;

public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;


    private static final double INIT_PRICE = 300;
    private static final double COMP_BONUS = 100;
    private static final double CLUB_BONUS = 100;
    private static final double PLAYER_BONUS = 100;

    private static final int INIT_SCORE = 5;

    // this block executes every time an object is created
    {
        setPrice(INIT_PRICE);
        setScore(INIT_SCORE);
    }

    public FootballNews(Editor editor, String holder, String competition, String club, String player) {
        super(editor, holder);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    public String getPlayer() {
        return player;
    }

    @Override
    public double calculateNewsPrice() {
        double totalPrice = super.getPrice();
        if(competition.equalsIgnoreCase("liga de campeones")) totalPrice += COMP_BONUS;
        if(club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Madrid")) totalPrice += CLUB_BONUS;
        if(player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) totalPrice += PLAYER_BONUS;
        return totalPrice;
    }
}
