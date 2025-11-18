package q4;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        if (deptCode.length() < 3) throw new IllegalArgumentException("Dept code must be >= 3 chars");
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
}
