public class BmiService {

    public int calculate(double height, int weight) {
        double bmw = weight / (height * height);
        return (int) bmw;

    }

}
