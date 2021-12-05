package west2.assighment1;

import west2.assighment1.Booth;
import west2.assighment1.StaticMethod;

public class test {
    public static void main(String[] args) {
        int[]s={59, 64, 86, 48, 76};
        System.out.println(StaticMethod.AverGrade(s));
        System.out.println(StaticMethod.highestScore(s));
        Booth liu=new Booth("刘华强",0,false);
        Booth sarilang=new Booth("撒日朗",5,true);
        System.out.println(liu.toString());
        Booth[]b={liu,sarilang};
       Booth.closeBooths(b);
       Booth.purchase(sarilang,2);

    }
}
