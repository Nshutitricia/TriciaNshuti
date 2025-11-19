package q5;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, java.util.Date createdDate, java.util.Date updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (code.length() < 3) throw new IllegalArgumentException("Code must be >= 3 chars");
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }
}
