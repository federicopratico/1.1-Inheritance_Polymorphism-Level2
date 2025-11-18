package Level3.Ex1;

public class F1News extends News {
    private String team;

    private static final double INIT_PRICE = 100;
    private static final double TEAM_BONUS = 50;
    private static final int INIT_SCORE = 5;

    {
        setPrice(INIT_PRICE);
        setScore(INIT_SCORE);
    }

    public F1News(Editor editor, String holder, String team) {
        super(editor, holder);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public double calculateNewsPrice() {
        double totalPrice = super.getPrice();
        if(team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes"))
            totalPrice += TEAM_BONUS;
        return totalPrice;
    }
}
