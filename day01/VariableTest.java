public class VariableTest {
    public static void main(String[] args){

        //一 开 始 没 有 乘 客 。 
        int count = 0;
        // 第 一 站 ： 上 去 一 位 乘 客
        //在原有基础上 +1
        count=count+1;
        //System.out.println(count);
        // 第 二 站 ： 上 去 两 位 乘 客 ，下来一位乘客
        
        count=count+2-1;
        // 第 三 站 ： 上 去 两 位 乘 客 ， 下 来 一 位 乘 客 
        count=count+2-1;
        // 第 四 站 ： 下 来 一 位 乘 客 
        count=count-1;
        // 第 五 站 ： 上 去 一 位 乘 客 
        count=count+1;
        //请 问 ： 到 了 终 点 站 ， 车 上 一 共 几 位 乘 客 。
        System.out.println(count);

    }
    
}
