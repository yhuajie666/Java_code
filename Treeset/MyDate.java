package Exercise3.com.java1;

public class MyDate implements Comparable{
    private int year;
    private int month;
    private int day;

    public MyDate() {

    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof MyDate){
            MyDate d=(MyDate)o;
            int  years=this.getYear()-d.getYear();
            if(years!=0){
                return years;
            }
            int months=this.getMonth()-d.getMonth();
            if(months!=0){
                return months;
            }
            return this.getDay()-d.getDay();
        }
        throw new RuntimeException("传入的参数不一致!");
    }
}
