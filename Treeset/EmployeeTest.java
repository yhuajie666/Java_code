package Exercise3.com.java1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee u1=(Employee)o1;
                    Employee u2=(Employee)o2;

                    MyDate d1=u1.getBirthday();
                    MyDate d2=u2.getBirthday();

                    return d1.compareTo(d2);
                }
                throw new RuntimeException("传入的参数不一致");
            }
        });

        Employee e1 = new Employee("dashna",16,new MyDate(2000,5,10));
        Employee e2 = new Employee("janny",25,new MyDate(1995,7,8));
        Employee e3 = new Employee("anny",20,new MyDate(2002,5,15));

        set.add(e1);
        set.add(e2);
        set.add(e3);


        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
