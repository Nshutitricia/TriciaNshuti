package q3;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, java.util.Date createdDate, java.util.Date updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (rate <= 0) throw new IllegalArgumentException("Rate must be > 0");
        if (code.length() < 3) throw new IllegalArgumentException("Code must be >= 3 chars");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() { return categoryName; }
    public double getRate() { return rate; }
    public String getCode() { return code; }
}
