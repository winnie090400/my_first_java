
package lab07;

import java.util.ArrayList;
import java.util.Random;

public class 亂數Test {

    ArrayList<Integer> lotteryNum = new ArrayList<>();
    ArrayList<Integer> balls = new ArrayList<>();

    //建立樂透球 號碼1~49
    public void balls() {
        int i;
        for (i = 1; i < 50; i++) {
            balls.add(i);
        }
    }

    //抽出6個號碼
    public void getRandom() {

        Random r = new Random();
        for (int z = 1; z < 7; z++) {
            int x = balls.remove(r.nextInt(balls.size()));
            lotteryNum.add(x);
        }

        System.out.println("樂透號碼: " + lotteryNum);
    }

    public static void main(String[] args) {

        亂數Test a = new 亂數Test();
        a.balls();
        a.getRandom();

        亂數Test b = new 亂數Test();
        b.balls();
        b.getRandom();

        亂數Test c = new 亂數Test();
        c.balls();
        c.getRandom();

    }

}
