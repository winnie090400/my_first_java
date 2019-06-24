package lab07;

import java.util.Random;

public class Game {

    private static final int 剪刀 = 0;
    private static final int 石頭 = 1;
    private static final int 布 = 2;
    private static final String[] array = {"剪刀", "石頭", "布"};
    private static final Random r = new Random();

    public void 電腦出拳() {
        int c = 0;
        int s = 0;
        int p = 0;

        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(3);
            System.out.println(n + " " + array[n]);

            if (n == 0) {
                c++;
            } else if (n == 1) {
                s++;
            } else if (n == 2) {
                p++;
            }

        }
        System.out.println("剪刀 " + c + " 石頭 " + s + " 布 " + p);
    }

}
