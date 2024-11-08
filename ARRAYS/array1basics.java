class array {
    // using arr.length() we can find the length of any array
    void maxarray() {
        int gh[] = { 2, 3, 4, 5, 6, 7, 8, 886 };
        int j = 0;
        int max = 0;
        while (j < gh.length) {
            if (max < gh[j]) {
                max = gh[j];
            }
            j++;
            System.out.println(max);
        }

        System.out.println();
    }

    void multiArray() {
        int[][] jkl = new int[3][3];
        int dm[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(dm[1][0]);
        System.out.println("2d array:--");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dm[i][j]);
            }
            System.out.println();
        }
        System.out.println(dm.length);
    }

    void demoarray() {
        int[] a = new int[5];
        float[] weights = new float[5];
        String[] name = new String[5];
        int[] kl = { 1, 2, 3, 4, 6, 0, 8, 5 };
        a[0] = 67;
        a[1] = 5;
        a[4] = 9;
        weights[0] = 67.5f;
        weights[3] = 45.9f;
        weights[2] = 23.4f;
        name[0] = "tanishq";
        name[2] = "aksh";
        System.out.println(a[0]);
        System.out.println(name[2]);
        System.out.println(weights[3]);
        System.out.println(name.length);
        // USING WHILE LOOP PRINTING ARRAY
        int x = 0, s = 0;
        while (kl.length > x) {
            s += kl[x];
            x++;
        }
        System.out.print("sum" + s);
        System.out.println();
        // USING FOR LOOP PRNTING ARRAY
        for (int i = 0; i < kl.length; i++) {
            System.out.print(kl[i]);
        }
        System.out.println();
        // USING FOR EACH LOOP PRINTING ARRAY
        for (int n : kl) {
            System.out.print(n);
        }
        System.out.println();
    }
}

public class array1basics {
    public static void main(String[] args) {

        array obj = new array();
        obj.demoarray();
        obj.multiArray();
        obj.maxarray();
    }
}
