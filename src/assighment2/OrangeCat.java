package assighment2;

public class OrangeCat extends Cat{
    boolean isFat;

    public OrangeCat(String name, int age, String gender, boolean isFat) {
        super(name, age, gender, 200);
        this.isFat = isFat;
    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                ", isFat=" + isFat +
                '}';
    }
}
