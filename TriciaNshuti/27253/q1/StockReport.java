package q1;
import java.util.Date;
import java.util.Scanner;

public final class StockReport extends Inventory {
    private Date reportDate;
    private String remarks;

    public StockReport(int id, Date createdDate, Date updatedDate,
                       String warehouseName, String location, String contactNumber,
                       String categoryName, String categoryCode,
                       String supplierName, String supplierEmail, String supplierPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       Date purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                       Date saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       Date reportDate, String remarks) {
        super(id, createdDate, updatedDate,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue);

        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public void generateReport() {
        System.out.println("===== STOCK REPORT (27253) =====");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Warehouse: " + getWarehouseName());
        System.out.println("Location: " + getLocation());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Category: " + getCategoryName());
        System.out.println("Category Code: " + getCategoryCode());
        System.out.println("Supplier: " + getSupplierName());
        System.out.println("Supplier Email: " + getSupplierEmail());
        System.out.println("Supplier Phone: " + getSupplierPhone());
        System.out.println("Product: " + getProductName());
        System.out.println("Unit Price: " + getUnitPrice());
        System.out.println("Stock Limit: " + getStockLimit());
        System.out.println("Quantity Available: " + getQuantityAvailable());
        System.out.println("Reorder Level: " + getReorderLevel());
        System.out.println("Purchase Date: " + getPurchaseDate());
        System.out.println("Purchased Quantity: " + getPurchasedQuantity());
        System.out.println("Purchased From: " + getPurchaseSupplierName());
        System.out.println("Sale Date: " + getSaleDate());
        System.out.println("Sold Quantity: " + getSoldQuantity());
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Total Items: " + getTotalItems());
        System.out.println("Stock Value: " + getStockValue());
        System.out.println("Remarks: " + remarks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Enter quantity available: ");
        int qty = sc.nextInt();

        System.out.print("Enter unit price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter remarks for report: ");
        String remarks = sc.nextLine();

        StockReport r = new StockReport(
                1, new Date(), new Date(),
                "Main Warehouse", "Kigali", "0781234567",
                "Electronics", "ELC01",
                "ABC Supplier", "abc@gmail.com", "0788888888",
                product, price, 100,
                qty, 10,
                new Date(), 50, "ABC Supplier",
                new Date(), 5, "John Doe",
                200, 500000.0,
                new Date(), remarks
        );

        r.generateReport();
    }
}
