package q6;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (orgCode == null || orgCode.length() < 3)
            throw new IllegalArgumentException("Org code must be ≥ 3 chars");
        if (rssbNumber == null || rssbNumber.length() != 8)
            throw new IllegalArgumentException("RSSB number must be 8 digits");
        if (!contactEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }
}
