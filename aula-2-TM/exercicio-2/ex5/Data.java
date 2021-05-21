package class4.list2.ex5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    private final GregorianCalendar gc = new GregorianCalendar();
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private Date date;

    public Data(Date date) {
        this.date = date;
    }

    public boolean isNotCorrect(){
        return date == null;
    }

    public void addDay(){
        if( isNotCorrect() ){
            System.out.println("Você passou uma data inválida!");
            return;
        }

        gc.add(Calendar.DAY_OF_MONTH, 1);
        date = gc.getTime();
    }


    public String toString(){
        if( isNotCorrect() ){
            return "Você passou uma data inválida!";
        }

        return formatter.format(date);
    }
}
