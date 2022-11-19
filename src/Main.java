public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("вес - 102 кг / рост - 186 см");
        System.out.println("индекс массы тела: " + service.calculate(102, 186));

        System.out.println("");
        System.out.println("вес - 80 кг / рост - 105 см");
        System.out.println("индекс массы тела: " + service.calculate(80, 105));

        System.out.println("");
        System.out.println("вес - 130 кг / рост - 167 см");
        System.out.println("индекс массы тела: " + service.calculate(130, 167));
    }
}