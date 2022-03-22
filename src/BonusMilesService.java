public class BonusMilesService {
    public int calculate(int ticketPrice) {

        int bonusLevel = 20;
        int miles = (ticketPrice / bonusLevel);
        return miles;
    }
}