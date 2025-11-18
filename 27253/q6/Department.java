package q6;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptCode == null || deptCode.length() < 3)
            throw new IllegalArgumentException("Dept code must be ≥ 3 chars");
        if (managerName == null || managerName.isEmpty())
            throw new IllegalArgumentException("Manager name cannot be empty");
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }
}
