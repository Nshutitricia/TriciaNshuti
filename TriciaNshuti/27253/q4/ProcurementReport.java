package q4;

import java.util.Date;
import java.util.Scanner;

public final class ProcurementReport extends Invoice {
    private Date reportDate;
    private String summary;

    public ProcurementReport(int id, java.util.Date createdDate, java.util.Date updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, java.util.Date orderDate, double totalAmount,
                             java.util.Date deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             Date reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
              supplierName, supplierTIN, contact, productName, unitPrice, quantity,
              poNumber, orderDate, totalAmount, deliveryDate, deliveredBy,
              inspectorName, status, remarks, invoiceNo, invoiceAmount);
        this.reportDate = reportDate;
        this.summary = summary;
    }

    public double calculateTotal() {
        return getInvoiceAmount();
    }

    public void displayAllData(String studentID) {
        System.out.println("===== PROCUREMENT REPORT =====");
        System.out.println("Organization: " + getOrgName() + " | StudentID: " + studentID);
        System.out.println("Department: " + getDeptName() + " | StudentID: " + studentID);
        System.out.println("Supplier: " + getSupplierName() + " | StudentID: " + studentID);
        System.out.println("Product: " + getProductName() + " | StudentID: " + studentID);
        System.out.println("Unit Price: " + getUnitPrice() + " | StudentID: " + studentID);
        System.out.println("Quantity: " + getQuantity() + " | StudentID: " + studentID);
        System.out.println("PO Number: " + getPoNumber() + " | StudentID: " + studentID);
        System.out.println("Delivery By: " + getDeliveredBy() + " | StudentID: " + studentID);
        System.out.println("Inspection Status: " + getStatus() + " | StudentID: " + studentID);
        System.out.println("Invoice No: " + getInvoiceNo() + " | StudentID: " + studentID);
        System.out.println("Invoice Amount: " + getInvoiceAmount() + " | StudentID: " + studentID);
        System.out.println("Report Date: " + reportDate + " | StudentID: " + studentID);
        System.out.println("Summary: " + summary + " | StudentID: " + studentID);
        System.out.println("Total Purchase: " + calculateTotal() + " | StudentID: " + studentID);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentID = "27253";

        System.out.print("Enter product name: ");
        String pName = sc.nextLine();

        System.out.print("Enter unit price: ");
        double uPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter summary for report: ");
        String summary = sc.nextLine();

        ProcurementReport report = new ProcurementReport(
                1, new Date(), new Date(),
                "Acme Corp", "Kigali", "info@acme.com",
                "Procurement", "PRC", "Best Supplier", "123456789", "0780000000",
                pName, uPrice, qty,
                "PO001", new Date(), uPrice*qty,
                new Date(), "John Doe",
                "Inspector Alice", "Passed", "All good",
                "INV001", uPrice*qty,
                new Date(), summary
        );

        report.displayAllData(studentID);
    }
}
