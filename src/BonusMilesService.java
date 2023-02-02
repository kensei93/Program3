public class BonusMilesService {
    public int calculate(int cost) {
        int mileprice = 20;
        int price = (cost / mileprice);
        return price;
    }
}
