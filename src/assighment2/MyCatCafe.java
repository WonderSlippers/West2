package assighment2;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyCatCafe implements CatCafe {
    public MyCatCafe(double balance, ArrayList<Cat> catlist) {
        this.balance = balance;
        this.catlist = catlist;
        this.customerArrayList = new ArrayList<Customer>();
    }

    private double balance = 0;
    private ArrayList<Cat> catlist = new ArrayList<Cat>();
    private ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

    public ArrayList<Cat> getCatlist() {
        return catlist;
    }

    @Override
    public void treatCustomer(Customer customer) throws CatNotFoundException {

        for (int i = 0; i < customer.getRuaint(); i++) {
            customerArrayList.add(customer);

            int a = (int) Math.round(Math.random() * (catlist.size() - 1));

            if (!catlist.isEmpty()) {
                balance+=catlist.get(a).price;
                System.out.println("被抽中的猫是"+catlist.get(a).toString());
                catlist.remove(a);

            } else throw new CatNotFoundException("没有猫猫了");
        }


    }

    @Override
    public void buyCat(Cat cat) throws InsufficientBalanceException {
        double left = this.balance - cat.price ;
        if (left >= 0) {
            catlist.add(cat);
            this.balance = left;
            System.out.println("购买成功！");
        } else {
            throw new InsufficientBalanceException("余额不足");
        }
    }

    @Override
    public void close() {
        LocalDate today=LocalDate.now();
        int ruaTime=0;
        for (Customer c:customerArrayList
             ) {
            if(c.getVisitTime().getYear()==today.getYear()&&
                    c.getVisitTime().getMonthValue()==today.getMonthValue()&&
                    c.getVisitTime().getDayOfMonth()==today.getDayOfMonth()){
                ruaTime+=c.getRuaint();
                System.out.println(c.toString());
            }
        }
        System.out.println("今天赚了"+ruaTime*15+"元");

    }
}
