package q1;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, java.util.Date createdDate, java.util.Date updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode);

        if (!supplierEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (supplierPhone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }
}
