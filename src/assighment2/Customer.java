package assighment2;

import java.time.LocalDate;

public class Customer {
    private String name;
    private int ruaint;

    public String getName() {
        return name;
    }

    public int getRuaint() {
        return ruaint;
    }

    public LocalDate getVisitTime() {
        return visitTime;
    }

    private LocalDate visitTime;

    public Customer(String name, int ruaint, LocalDate visitTime) {
        this.name = name;
        this.ruaint = ruaint;
        this.visitTime = visitTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", ruaint=" + ruaint +
                ", visitTime=" + visitTime +
                '}';
    }
}
