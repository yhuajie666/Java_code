package Exercise3.com.one;

/**
 * JDK5.0新增使用关键字enum定义枚举类
 * Enum中常用的方法values()，valueOf()方法
 */
public class enumTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.toString());
        //values()方法 返回所有的枚举类对象构成的数组
        Season[] values = Season.values();
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        /**
         * valueOf()方法 返回枚举类中对象名是objname的对象
         * 如果没有objname的对象或不符合 则抛出运行时异常 IllegalArgumentException
         */
        Season spring1 = Season.valueOf("SPRING");
        System.out.println(spring1);



    }
}

enum Season{
    SPRING("春天","万物复苏"),
    SUMMER("夏天","烈日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    private final String seaaonname;
    private final String seasonDesc;

    private Season(String seaaonname, String seasonDesc) {
        this.seaaonname = seaaonname;
        this.seasonDesc = seasonDesc;
    }

    public String getSeaaonname() {
        return seaaonname;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seaaonname='" + seaaonname + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
