package design;

public class EmployeeAbstract extends AbstractClass{

        public void breakTime(){
            System.out.println("employees should get 30 min paid break a day");
        }

    @Override
    public void abstractClass() {

    }

    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }
}
