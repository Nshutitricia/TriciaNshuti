package q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, java.util.Date createdDate, java.util.Date updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead,
              courseName, courseCode, credits);
        if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (phone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    public String getInstructorName() { return instructorName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
