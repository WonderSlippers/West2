package assighment2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws CatNotFoundException, InsufficientBalanceException {
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        catArrayList.add(new BlackCat("BB", 1, "M"));
        catArrayList.add(new BlackCat("OO", 2, "F"));
        Customer a = new Customer("a", 1, LocalDate.now());
        Customer b = new Customer("b", 2, LocalDate.now());
        MyCatCafe m = new MyCatCafe(350, catArrayList);
        System.out.println("初始猫的情况：");
        for (Cat c : m.getCatlist()
        ) {
            System.out.println(c.toString());
        }
        System.out.println();
        m.treatCustomer(a);
        System.out.println("招待了第一个客人后：");
        for (Cat c : m.getCatlist()
        ) {
            System.out.println(c.toString());
        }
        System.out.println();
       try {
           m.treatCustomer(b);
       }catch (CatNotFoundException e){
           System.out.println(e.getMessage());
       }
        System.out.println("招待了第二个客人后:");
        for (Cat c : m.getCatlist()
        ) {
            System.out.println(c.toString());
        }
        System.out.println("购入猫猫");
       try {
           m.buyCat(new BlackCat("2B", 3, "M"));

           m.buyCat(new BlackCat("3B", 3, "M"));
           m.buyCat(new BlackCat("4B", 3, "M"));
           m.buyCat(new BlackCat("4B", 3, "M"));
       }catch (InsufficientBalanceException e){
           System.out.println(e.getMessage());
       }
       m.close();
       /////////////////////////////////////
        int[]arr1 = {1, 3, 5, 7, 9};
        int[]arr2 = {2, 4, 6, 8, 10};
        printCross.printCrossing(arr1,arr2);
        ///////////////////////////////////
        System.out.println(mailCheck.isValidEmail("1569931788@qq.com"));
        System.out.println(mailCheck.isValidEmail("fas@qq.com."));
    }




}
