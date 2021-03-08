package aost;


//debug
public class Study9 {
    public static void main(String[] args) {

    }


/*
    throws关键字:异常处理的第一种方式, 交给别人处理
    作用:
    当方法内部抛出异常对象的时候,那么我们就必须处理这个异常对象
    可以使用throws关键字处理异常对象， 会把异常对象声明抛出给方法的调用者处理(自己不处理,给别人处理)。最终交给JVM处理-- >中断处理
    使用格式:在方法声明时使用
    修饰符返回值类型方法名(参数列表) throws AAAExcepiton, BBBExcepiton...{
        throw new AAExcepiton("产生原因");
        throw new BBBExcepiton(”产生原因");
                注意:
        1. throws关键字必须写在方法声明处
        2. throws关键字后边声明的异常必须是Except ion或者是Exception的子类
        3.方法内部如果抛出了多个异常对象,那么throws后边必须也声明多个异常
        如果抛出的多个异常对象有子父类关系,那么直接声明父类异常即可
        4.调用了一个声明抛出异常的方法,我们就必须的处理声明的异常
        要么继续使用throws声明抛出，交给方法的调用者处理,最终交给JVM
        要么try...catch
*/

    }
