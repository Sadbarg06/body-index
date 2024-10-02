public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 56;
        double height = 1.58;

        int bmw = service.calculate(1.58, 56);

        System.out.println(bmw);


    }

}
