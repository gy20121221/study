package aost;

public class Private1 {
    String name;
    private int age;
    private boolean man;

    public void show(){
        int age=10;
        System.out.println("我是："+name+"年龄"+this.age);
        System.out.println(this);
        //通过谁调用的方法，谁就是this。

    }
    /**当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。
    如果需要访问本类当中的成员变量，需要使用格式:
    this.成员变量名
    **/
    public void setAge(int num){
        if (num>0&&num<200) {age=num;}
        else {System.out.println("数据不合理");}
    }

    public int getAge(){
        return age;
    }

    public void setMan(boolean b){
        man=b;
    }

    public boolean isMan(){
        return man;
    }

}
/*问题描述:定义Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案:用private关键字将需要保护的成员变量进行修饰。
一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
但是!超出了本类范围之外就不能再直接访问了。
只能间接访问其他成员
set中不能有返回值，get中必须有返回值。一般都设置setxxx或者getxxx
boolean返回参数一般用isxxx而不是getxxx
*/
