import java.util.Scanner;

public class Lab208 {
    public static void main(String[] args) {

    	final double EMPLOYEE_RATE_55_BELOW = 0.20;
        final double EMPLOYER_RATE_55_BELOW = 0.17;
        final double EMPLOYEE_RATE_56_TO_60 = 0.13;
        final double EMPLOYER_RATE_56_TO_60 = 0.13;
        final double EMPLOYEE_RATE_61_TO_65 = 0.075;
        final double EMPLOYER_RATE_61_TO_65 = 0.09;
        final double EMPLOYEE_RATE_ABOVE_65 = 0.05;
        final double EMPLOYER_RATE_ABOVE_65 = 0.075;
        final double SALARY_CEILING = 6000.00;

        double employeeContributionRate = 0.0;
        double employerContributionRate = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        double monthlySalary = scanner.nextDouble();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        if (age <= 55) {
            employeeContributionRate = EMPLOYEE_RATE_55_BELOW;
            employerContributionRate = EMPLOYER_RATE_55_BELOW;
        } else if (age <= 60) {
            employeeContributionRate = EMPLOYEE_RATE_56_TO_60;
            employerContributionRate = EMPLOYER_RATE_56_TO_60;
        } else if (age <= 65) {
            employeeContributionRate = EMPLOYEE_RATE_61_TO_65;
            employerContributionRate = EMPLOYER_RATE_61_TO_65;
        } else {
            employeeContributionRate = EMPLOYEE_RATE_ABOVE_65;
            employerContributionRate = EMPLOYER_RATE_ABOVE_65;
        }

        double contributableSalary = Math.min(monthlySalary, SALARY_CEILING);

        double employeeContribution = contributableSalary * employeeContributionRate;
        double employerContribution = contributableSalary * employerContributionRate;
        double totalContribution = employeeContribution + employerContribution;

        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);

        scanner.close();
    }
}
