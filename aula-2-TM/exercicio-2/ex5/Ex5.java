package class4.list2.ex5;

import java.util.Date;

public class Ex5 {
    public static void main(String[] args) {
        Data data = new Data(new Date());
        data.addDay();

        System.out.println(data);
    }
}
