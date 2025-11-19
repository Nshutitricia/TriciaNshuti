package q1;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, java.util.Date createdDate, java.util.Date updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);

        if (categoryCode.length() < 3) throw new IllegalArgumentException("Code must be >= 3 chars");

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}
