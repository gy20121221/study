package aost;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
/*java. text . DateFormat :是日期/时间格式化子类的抽象类
        作用:
        格式化(也就是日期->文本)、解析(文本->日期)
        成员方法:
        String format(Date date)按照指定的模式, 把Date日期，格式化为符合模式的字符串
        Date parse(String source) 把符合模式的字符串，解析为Date日期
        DateFormat类是一一个抽象类,无法直接创建对象使用，可以使用DateFormat的子类
        java. text. SimpleDateFormat extends DateFormat
        构造方法:
        SimpleDateFormat(String pattern) 用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。
        参数:
        String pattern:传递指定的模式
        模式:区分大小写的
        构造方法:
        Simpl eDateFormat (String pattern)用给定的模式和默认语言环境的E日期格式符号构造SimpleDateFormat。
        参数:
        String pattern :传递指定的模式
        模式:区分大小写的
        y m d h m s 年月日时分秒
        写对应的模式,会把模式替换为对应的日期和时间
        "yyyy-M-dd HH:mm:ss
        "yyyy年MM月dd日H时mm分ss秒”
        注意:
        模式中的字母不能更改,连接模式的符号可以改变

        */

/*
        使用DateFormat类中的方法format ,把日期格式化为文本
        String format(Date date)按照指定 的模式,把Date日期，格式化为符合模式的字符串
        使用步骤:
        1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        2.调用S impleDateFormat对象中的方法format,按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串(文本)
*/

/*
* 注意:
public Date parse(String source) throws ParseExcept ion
parse方法声明了一-个异常叫ParseException解析异常
如果字符串和构造方法中的模式不一样,那么程序就会抛出此异常
调用一一个抛出了异常的方法，就必须的处理这个异常,要么throws继续声明抛出这一个异常,要么try...catch自己处理这个异常
*/

/*

*jova. util. Calendar类:日历类
Calendar类是-一个抽象类。里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_ OF_ MONTH, HOUR )
Calendor类无法直接创建对象使用，里边有-一个静态方法叫getIns tance(),该方法返回了Calendar类的子类对象
static Calendar getInstance() 使用默认时区和语言环境获得一个日历。

* */

/*
*
*
* 将数组中指定的数据拷贝到另一个 数组中。
参数:
src -源数组。
srcPos -源数组中的起始位置。
dest -目标数组。
destPos -目标数据中的起始位置。
length -要复制的数组元素的数量。
练习:
将src数组中前3个元素，复制到dest数组的前3个位置.上
复制元素前: src数组元素[1,2,3,4,5], dest数组元素[6,7,8,9,10]
复制元素后: src数组元素[1,2,3,4,5], dest数组元素[1,2,3,9, 10]
*/
/*
 *StringBuilder() 字符串缓存区，用于减少字符串操作的内存浪费
 * 主要有append方法 添加字符串，返回添加后的字符串本身
 * 
 * */
public class Study5 {
    public static void main(String[] args) throws ParseException {
        Person p = new Person("lbw", 26);
        Person p2 = new Person("lbw", 26);
        String s = p.toString();
        System.out.println(s);
        System.out.println(p.equals(p2));
        System.out.println(System.currentTimeMillis());//获取当前系统时间到1970年1月1日00:00:00经历了多少毫秒
        Date();
        demoDate1();
        System.out.println("***********************");
        demoDate2("20001107");
        demDate3();
        //demDate4();
        demo();

    }

    private static void demo() {
        int[] src = {1, 1, 3, 65, 4};
        int[] dest = {5, 6, 98, 4, 8};
        System.out.println("复制前" + Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 3, 2);
        System.out.println("复制后" + Arrays.toString(dest));
    }


    //计算时间复杂度，计算程序运行时间
    private static void demDate4() {
        long a = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    //获取本地时间，时区，日历
    private static void demDate3() {
        Calendar calendar = Calendar.getInstance();//多态
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));//get获取方法
        calendar.set(Calendar.YEAR, 2077);//set 设置方法
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(calendar.YEAR, 3);//add增加方法
        System.out.println(calendar.get(Calendar.YEAR));
        Date date = calendar.getTime();// 把日历转化为date
        System.out.println(date);

    }

    //计算一个人的出生了多久，输入出生日期
    private static void demoDate2(String birthDate) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date1 = simpleDateFormat.parse(birthDate);
        long sc = date.getTime() - date1.getTime();
        System.out.println("您所经历的时间");
        System.out.println(sc / 1000 + "秒");
        System.out.println(sc / 1000 / 60 / 60 / 24 + "天");
        System.out.println(sc / 1000 / 60 / 60 / 24 / 365 + "年");

    }

    //格式化日期
    private static void demoDate1() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String text = simpleDateFormat.format(date);
        String text2 = simpleDateFormat2.format(date);
        System.out.println(date);
        System.out.println(text);
        System.out.println(text2);
        Date date1 = simpleDateFormat2.parse("2021年01月28日 22:56:01");
        System.out.println(date1);
    }

    private static void Date() {
        Date data = new Date();
        System.out.println(data);
    }
}
