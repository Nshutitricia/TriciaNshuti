package q4;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount;

    public Invoice(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, java.util.Date orderDate, double totalAmount,
                   java.util.Date deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
              supplierName, supplierTIN, contact, productName, unitPrice, quantity,
              poNumber, orderDate, totalAmount, deliveryDate, deliveredBy,
              inspectorName, status, remarks);
        if (invoiceAmount <= 0) throw new IllegalArgumentException("Invoice amount must be > 0");
        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceNo() { return invoiceNo; }
    public double getInvoiceAmount() { return invoiceAmount; }
}
