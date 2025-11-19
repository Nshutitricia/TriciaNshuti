package q3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, java.util.Date createdDate, java.util.Date updatedDate,
                        String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    public String getAuthorityName() { return authorityName; }
    public String getRegion() { return region; }
    public String getEmail() { return email; }
}
