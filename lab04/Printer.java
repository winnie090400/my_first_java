
package lab04;
//工程師B
public class Printer {
//        無返回值    接受傳入Student參考
    public void print(Student x) {
                String s = x.fullName()+"\t"+ x.eng+"\t"+x.math +"\t"+(x.eng+x.math);
        System.out.println(s);
        return; //return可省略
    }
    public void printTotal(Calculator cal){
        String s =cal.title + "\t" + cal.total;
        System.out.println(s);
        return;
    }
    
    public void printAverage(Calculator cal){
        String s= cal.titleAverage + "\t" + (double)cal.total/(double)cal.count;
        System.out.println(s);
    }

}
