/**
 * Created by Larry on 1/16/2015.
 */
public class For_loops {
    public static int[][] numArray;

    public static void main(String[] args) {
        numArray = new int[4][4];
        numArray[0][0] = 9;
        numArray[1][3] = 2;
        numArray[2][1] = 7;
        numArray[3][3] = 3;
        numArray[3][0] = 6;
        for (int i = 0; i < numArray.length; i++) {
            System.out.println();
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.println(numArray[i][j]);
            }
        }

    }
}

