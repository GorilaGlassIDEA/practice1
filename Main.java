import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        short[] n = new short[9];
        int k = 6;
        for (int i = 0; i < n.length; i++) {
            n[i] = (short) k;
            k += 2;
        }
        double[] x = new double[18];
        for (int i = 0; i < x.length; i++) {
            x[i] = new Random().nextDouble(-5.0, 14.0);
        }
        float[][] r = new float[9][18];

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if (n[i] == 14) {
                    r[i][j] =
                            (float) Math.sin(Math.pow(
                                    Math.pow(x[j], 0.5 * x[j]), 1.0 / 3.0)
                            );
                } else if (n[i] == 6 || n[i] == 8
                        || n[i] == 18 || n[i] == 20) {
                    r[i][j] =
                            (float) Math.pow(
                                    ((x[j] + 4.5) / 19) / 2.0
                                    , 2);
//                            (float) Math.pow(Math.tan((Math.atan((x[j] + 4.5) / 19.0))) / 2.0, 2);


                } else {
                    r[i][j] =
                            (float) Math.pow(Math.exp(1), Math.atan(
                                    Math.pow(Math.exp(1), Math.pow(-Math.abs(x[j]), 1.0 / 3.0))
                            ));
                }
            }
        }
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                try {
                    System.out.printf("%.4f ", r[i][j]);
                } catch (Exception exception) {
                    System.err.println("ERR");
                }
            }
            System.out.println();
        }
    }
}
