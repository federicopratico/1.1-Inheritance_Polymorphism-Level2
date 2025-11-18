package Level3.Ex1;

public class MotorbikeNews extends News {
    private String team;

    private static final double INIT_PRICE = 100;
    private static final double TEAM_BONUS = 50;

    private static final int INIT_SCORE = 5;


    {
        setPrice(INIT_PRICE);
        setScore(INIT_SCORE);
    }

    public MotorbikeNews(Editor editor, String holder, int score, double price, String team) {
        super(editor, holder);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public double calculateNewsPrice() {
        double totalPrice = super.getPrice();
        if(team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) totalPrice += TEAM_BONUS;
        return totalPrice;
    }
}
