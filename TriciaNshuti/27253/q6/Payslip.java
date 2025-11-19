package q6;

import java.util.Date;
import java.util.Scanner;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private Date issueDate;

    public Payslip(int id, Date createdDate, Date updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, Date startDate, Date endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, Date issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
              deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
              month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
              payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public void displayAllDetails(String studentID) {
        System.out.println("=== PAYSLIP DETAILS | StudentID: " + studentID + " ===");
        System.out.println("Entity ID: " + getId() + " | Created: " + getCreatedDate() + " | Updated: " + getUpdatedDate() + " | StudentID: " + studentID);
        System.out.println("Organization Name: " + getOrgName() + " | Org Code: " + getOrgCode() + " | RSSB#: " + getRssbNumber() + " | Contact Email: " + getContactEmail() + " | StudentID: " + studentID);
        System.out.println("Department Name: " + getDeptName() + " | Dept Code: " + getDeptCode() + " | Manager: " + getManagerName() + " | StudentID: " + studentID);
        System.out.println("Employee ID: " + getEmployeeID() + " | Name: " + getFullName() + " | Position: " + getPosition() + " | Base Salary: " + getBaseSalary() + " | RSSB Registered: " + isRssbRegistered() + " | StudentID: " + studentID);
        System.out.println("Payroll Period: Month=" + getMonth() + " | Year=" + getYear() + " | Start=" + getStartDate() + " | End=" + getEndDate() + " | StudentID: " + studentID);
        System.out.println("Salary Structure: Basic=" + getBasicPay() + " | Transport=" + getTransportAllowance() + " | Housing=" + getHousingAllowance() + " | StudentID: " + studentID);
        System.out.println("Deductions: RSSB=" + getRssbContribution() + " | PAYE=" + getPayeTax() + " | Loan=" + getLoanDeduction() + " | StudentID: " + studentID);
        System.out.println("Allowances: Overtime Hours=" + getOvertimeHours() + " | Overtime Rate=" + getOvertimeRate() + " | Bonus=" + getBonus() + " | StudentID: " + studentID);
        System.out.println("Payroll: Gross Salary=" + getGrossSalary() + " | Total Deductions=" + getTotalDeductions() + " | Net Salary=" + getNetSalary() + " | StudentID: " + studentID);
        System.out.println("Payslip Number: " + payslipNumber + " | Issue Date: " + issueDate + " | StudentID: " + studentID);
        System.out.println("==============================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentID = "27253";

        System.out.print("Enter employee full name: ");
        String name = sc.nextLine();

        System.out.print("Enter base salary: ");
        double baseSalary = sc.nextDouble();

        Payslip p = new Payslip(
            1, new Date(), new Date(),
            "Tech Corp", "TC1", "12345678", "info@techcorp.com",
            "IT", "IT01", "Alice Manager",
            1001, name, "Developer", baseSalary, true,
            11, 2025, new Date(), new Date(),
            baseSalary, 100, 200,
            50, 0,
            10, 20, 100,
            "PS12345", new Date()
        );

        p.displayAllDetails(studentID);
    }
}
