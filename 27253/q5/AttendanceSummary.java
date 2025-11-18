package q5;

import java.util.Date;
import java.util.Scanner;

public final class AttendanceSummary extends LeaveRequest {
    private Date reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, Date createdDate, Date updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             Date sessionDate, String topic, String status,
                             Date requestDate, String reason, boolean approved,
                             Date reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address,
              departmentName, departmentHead, courseName, courseCode, credits,
              instructorName, email, phone, studentName, studentID, age,
              sessionDate, topic, status, requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    public void generateSummary(String studentID) {
        System.out.println("===== ATTENDANCE SUMMARY =====");
        System.out.println("Student: " + getStudentName() + " | StudentID: " + studentID);
        System.out.println("Session Date: " + getSessionDate() + " | StudentID: " + studentID);
        System.out.println("Topic: " + getTopic() + " | StudentID: " + studentID);
        System.out.println("Status: " + getStatus() + " | StudentID: " + studentID);
        System.out.println("Leave Reason: " + getReason() + " | StudentID: " + studentID);
        System.out.println("Approved: " + isApproved() + " | StudentID: " + studentID);
        System.out.println("Total Present: " + totalPresent + " | StudentID: " + studentID);
        System.out.println("Total Absent: " + totalAbsent + " | StudentID: " + studentID);
        System.out.println("Report Date: " + reportDate + " | StudentID: " + studentID);
        double percentage = (totalPresent * 100.0) / (totalPresent + totalAbsent);
        System.out.println("Attendance Percentage: " + percentage + "% | StudentID: " + studentID);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentID = "27253";

        System.out.print("Enter student name: ");
        String sName = sc.nextLine();

        System.out.print("Enter attendance status (Present/Absent): ");
        String status = sc.nextLine();

        System.out.print("Enter leave reason (if any): ");
        String reason = sc.nextLine();

        boolean approved = true;

        AttendanceSummary summary = new AttendanceSummary(
                1, new Date(), new Date(),
                "ABC School", "SCH01", "Kigali",
                "Computer Science", "Alice",
                "OOP", "CS101", 3,
                "Dr. John", "john@example.com", "0780000000",
                sName, "ST123", 20,
                new Date(), "OOP Lecture", status,
                new Date(), reason, approved,
                new Date(), status.equalsIgnoreCase("Present") ? 1 : 0, status.equalsIgnoreCase("Absent") ? 1 : 0
        );

        summary.generateSummary(studentID);
    }
}
