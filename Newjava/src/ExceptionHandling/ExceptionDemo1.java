package ExceptionHandling;

public class ExceptionDemo1 {
    static void compute(int a) throws UserDefineException {
        System.out.println("called compute method" + a);
        if (a > 10) {
            throw new UserDefineException(a);
        }
        System.out.println("Exit from program");
    }

    public static void main(String[] args) {
        try {
            compute(11);
        } catch (UserDefineException e) {
            System.out.println("Handle user defined exception");
            e.printStackTrace();
        }
    }
}