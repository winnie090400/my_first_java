
public class Ex05_時間換算 {


    public static void main(String[] args) {
        int age = 50;
        int days = age * 365;
        int hrs = days * 24;
        int mins = hrs * 60;
        long secs = mins * 60;
        long millis = secs * 1000;
        
        System.out.println(days + "天");
        System.out.println(hrs + "小時");
        System.out.println(mins + "分鐘");
        System.out.println(secs + "秒");
        System.out.println(millis + "毫秒");
    }
    
}
