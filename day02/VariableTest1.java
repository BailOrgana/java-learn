package day02;

public class VariableTest1 {
    public static void main(String[] args){

        //定义变量记录姓名
        String name = "大熊君";
        System.out.println(name);

        //定义变量记录年龄
        int age = 18;
        System.out.println(age);
        
        //定义变量记录性别
        char gender='男';
        System.out.println(gender);
        //定义变量记录身高
        double height=185.5;
        System.out.println(height);

        //定义变量记录是否单身
        //true 表示单身 false 表示不单身
        boolean flag =true;
        System.out.println(flag);


        System.out.println("=======================================");
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("性别:"+gender);
        System.out.println("身高:"+height);
        System.out.println("是否单身:"+flag);


    }
    
}
