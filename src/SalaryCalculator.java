public class SalaryCalculator {
    public static void salaryCalculator(double weeklyHours,
                                        double payRate, double vacationDay)
    {
        vacationDay = (vacationDay * 8);
        double incomeTax = ((weeklyHours * payRate) * 52) * 0.15;
        double yearlySalary = ((((weeklyHours - vacationDay) * payRate)) * 52) - incomeTax;
        System.out.println("This employee's yearly salary is " + yearlySalary);
    }
    public static void main(String[] args) {
        salaryCalculator(20, 16.00, 0);
    }
}
