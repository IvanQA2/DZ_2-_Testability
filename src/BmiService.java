public class BmiService {
    public int calculate(int theWeight, int growth) {
        double heightMeter = (double) growth / 100;
        double index = theWeight / (heightMeter * heightMeter);
        int indexInt = (int) index;
        return indexInt;
    }
}
