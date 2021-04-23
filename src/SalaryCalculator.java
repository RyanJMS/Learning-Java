public class SalaryCalculator {
    public static void salaryCalculator(double weeklyHours,
                                        double payRate, double vacationDay)
    {
        vacationDay = (vacationDay * 8);
        double yearlySalary = ((weeklyHours - vacationDay) * payRate) * 52;
        System.out.println("This employee's yearly salary is " + yearlySalary);
    }
    public static void main(String[] args) {
        salaryCalculator(40, 16.00, 1);
    }
}
