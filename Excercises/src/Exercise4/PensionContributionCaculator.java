package Exercise4;

import java.util.Scanner;

public class PensionContributionCaculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the monthly salary: ");
        int salary = in.nextInt();
        System.out.println("Enter the age: ");
        int age = in.nextInt();

        double employeeContribution = findEmployeeContribution(salary, age);
        double employerContribution = findEmployercontribution(salary, age);
        double totalContribution = employeeContribution + employerContribution;

        System.out.printf("The employee's contribution is: %.2f", employeeContribution);
        System.out.println();
        System.out.printf("The employer's contribution is: %.2f", employerContribution);
        System.out.println();
        System.out.printf("The total contribution is: %.2f", totalContribution);
    }
    public static double findEmployeeContribution (int salary, int age) {
        int salary1 = 0;
        double contribution = 0;
        if (salary > 6000) {
            salary1 = 6000;
        } else {
            salary1 = salary;
        }

        if (age > 65) {
            contribution = (double) salary1 * 0.05;
        } else if (age > 60) {
            contribution = (double) salary1 * 0.075;
        } else if (age > 55) {
            contribution = (double) salary1 * 0.13;
        } else {
            contribution = (double) salary1 * 0.2;
        }
        return contribution;
    }

    public static double findEmployercontribution (int salary, int age) {
        int salary1 = 0;
        double contribution = 0;
        if (salary > 6000) {
            salary1 = 6000;
        } else {
            salary1 = salary;
        }

        if (age > 65) {
            contribution = (double) salary1 * 0.075;
        } else if (age > 60) {
            contribution = (double) salary1 * 0.09;
        } else if (age > 55) {
            contribution = (double) salary1* 0.13;
        } else {
            contribution = (double) salary1 * 0.17;
        }
        return contribution;
    }

}
