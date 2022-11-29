public class BmiService {
    public int calculate(int weight, int growth) {
        double heightMeter = (double) growth / 100;
        double index = weight / (heightMeter * heightMeter);
        int indexInt = (int) index;
        return indexInt;
    }
}
