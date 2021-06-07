//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Calculette {


    public static int add(int a, int b) {
        return a+b;
    }

    public static int sub(int a, int b) {
        return a-b;
    }

    public static int mul(int a, int b) {
        return a*b;
    }

    public static double div (int a, int b) throws Exception {
        if(b != 0) {
            return a/b;
        } else {
            throw new Exception("Division par zero");
        }
    }

    public static double avg(int[] tab) throws Exception {
        if(tab.length != 0) {
            int total = 0;
            for(int number: tab) {
                total += number;
            }
            return total/(tab.length);
        } else {
            throw new Exception("Liste vide");
        }

    }
}
