package q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, java.util.Date createdDate, java.util.Date updatedDate,
                     String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);

        if (contactNumber.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public String getWarehouseName() { return warehouseName; }
    public String getLocation() { return location; }
    public String getContactNumber() { return contactNumber; }
}
