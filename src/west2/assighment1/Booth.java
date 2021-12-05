package west2.assighment1;

public class Booth {
    private static long onlyId=0;
    private long id;
    private  String name;
    private int total;
    private boolean isClosed;

    public Booth( String name, int total, boolean isClosed) {
        this.id = onlyId;
        onlyId++;
        this.name = name;
        this.total = total;
        this.isClosed = isClosed;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    @Override
    public String toString() {
        return "west2.assighment1.Booth{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total=" + total +
                ", isClosed=" + isClosed +
                '}';
    }

    //购买方法
    public static void purchase(Booth booth,int purchaseNum){
if(purchaseNum<0 ){
    System.out.println("购买失败,购买数量要大于0");
}
if(booth.isClosed) {
    System.out.println("购买失败,关门了");
}
if(purchaseNum< booth.total){
            System.out.println("购买失败,瓜不够");}
  else {
    booth.total -= purchaseNum;
    System.out.println("购买成功");
}
    }
 //进货方法
    public void restock(int restockNum){
      if (restockNum<=200){
        total+=restockNum;}
      else System.out.println("进货超过了200！进货失败");
    }
    public static void closeBooths(Booth[] booths){
        for (Booth booth:booths
             ) {
            if(!booth.isClosed){
                booth.isClosed=true;
            }
            else {
                System.out.println(booth.toString());
            }
        }
    }
}

