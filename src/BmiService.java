public class BmiService {
    public int calculate(int a, int b) {
        double heightMeter = (double) b / 100;
        double index = a / (heightMeter * heightMeter);
        int indexInt = (int) index;
        return indexInt;
    }
}
