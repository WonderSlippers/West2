package assighment2;

public class BlackCat extends Cat{
    @Override
    public String toString() {
        return "BlackCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                '}';
    }

    public BlackCat(String name, int age, String gender) {
        super(name, age, gender, 350);

    }
}
