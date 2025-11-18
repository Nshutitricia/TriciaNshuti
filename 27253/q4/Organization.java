package q4;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (!contactEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() { return orgName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}
