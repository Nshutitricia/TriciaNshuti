package q3;

import java.util.Date;
import java.util.Scanner;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, Date createdDate, Date updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     Date assessmentDate, double assessedTax,
                     Date paymentDate, double paymentAmount,
                     String receiptNo) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
              tin, taxpayerName, address, employerName, employerTIN, contact,
              employeeName, salary, employeeTIN, declarationMonth, totalIncome,
              assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = computeTax();
    }

    public double computeTax() {
        return getSalary() * getRate() - getPaymentAmount();
    }

    public void displayAllData(String studentID) {
        System.out.println("===== TAX RECORD =====");
        System.out.println("Receipt No: " + receiptNo + " | StudentID: " + studentID);
        System.out.println("Taxpayer Name: " + getTaxpayerName() + " | StudentID: " + studentID);
        System.out.println("TIN: " + getTin() + " | StudentID: " + studentID);
        System.out.println("Employer: " + getEmployerName() + " | StudentID: " + studentID);
        System.out.println("Employee Name: " + getEmployeeName() + " | StudentID: " + studentID);
        System.out.println("Salary: " + getSalary() + " | StudentID: " + studentID);
        System.out.println("Tax Rate: " + getRate() + " | StudentID: " + studentID);
        System.out.println("Assessment Date: " + getAssessmentDate() + " | StudentID: " + studentID);
        System.out.println("Payment Amount: " + getPaymentAmount() + " | StudentID: " + studentID);
        System.out.println("Total Tax: " + totalTax + " | StudentID: " + studentID);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentID = "27253";

        System.out.print("Enter taxpayer name: ");
        String tName = sc.nextLine();

        System.out.print("Enter TIN (9 digits): ");
        String tin = sc.nextLine();

        System.out.print("Enter employer name: ");
        String eName = sc.nextLine();

        System.out.print("Enter employee name: ");
        String empName = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter payment amount: ");
        double paymentAmt = sc.nextDouble();
        sc.nextLine();

        TaxRecord record = new TaxRecord(
                1, new Date(), new Date(),
                "Rwanda Revenue", "Kigali", "info@rra.gov.rw",
                "Income Tax", 0.15, "INC",
                tin, tName, "Kigali Address",
                eName, "123456789", "0780000000",
                empName, salary, "123456789",
                "November", salary, new Date(), salary*0.15,
                new Date(), paymentAmt, "RCPT001"
        );

        record.displayAllData(studentID);
    }
}
