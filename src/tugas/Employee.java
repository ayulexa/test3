package tugas;

public class Employee {
    private boolean isEmployee;

    public Employee(boolean isEmployee){
        this.isEmployee = isEmployee;
    }

    public double getDiscount(){
        return isEmployee ? 0.125 : 0.0;
    }
}
