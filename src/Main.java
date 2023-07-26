public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int iml = service.calculate(92, 1.8);
        System.out.println(iml);

    }

}
