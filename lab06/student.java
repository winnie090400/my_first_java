
package lab06;


public class student {
    //物件的資料(屬性)
    private String name;
    private int [] scores = new int[3];
    private String[] subjects = {"國文","英文","數學"};
    
    //setter設定值
    public void setName(String name){
        if(name == null || name.length()<2){
            System.out.println("name不能為null或少於2個字");
            System.out.println("name" + name);
            return;
        }
        this.name = name;
    }
    
    public void setScores(int index, int score){
        if(index<0 || index >= scores.length || score<0 || score>100){
            System.out.println("index 不能 < 0 或"+scores.length+" , 分數必須 0~100");
            System.out.println("index" + index);
            System.out.println("score" + score);
            return;
        }
        this.scores[index] = score;
    }
    
    public void setScores(String subject, int score){
        int index = this.查詢subject在陣列第幾項(subject);
        if(index < 0){
            System.out.println("查無科目名稱 " + subject);
            return;
        }
        this.setScores(index, score);
    }
    
    private int 查詢subject在陣列第幾項(String subject) {
        for(int i =0; i<this.subjects.length;i++){
            //讀取第i項字串
            String string = this.subjects[i];
            //判斷內容是否相等
            if(string.equals(subject)){
                System.out.println("在第 "+i+ " 項找到了");
                return i;
            }
        }
        return -1;//用負數代表找不到
        
    }
    //Getter取值
    public int getTotal(){
        int total;
        total = 0; //總分歸零
        
        //使用for迴圈逐項取陣列資料
        for(int i=0; i<scores.length;i++){
            int score = scores[i]; //取得第i項成績
            total += score;        //累加
        }
        return total;
    }

    public void displayInfo(){
        //this參考目前執行中的物件
        System.out.println(this.name);
        //for迴圈簡化了while迴圈
        for (int i = 0; i < this.scores.length; i++){
            String string = this.subjects[i];
            System.out.print(string);
            System.out.print(" ");
            int score = this.scores[i];
            System.out.println(score);
        }
        System.out.println("-----------");
        
        int total = getTotal();
        System.out.println("總分: "+total);
        System.out.println("");
    }

    
}
