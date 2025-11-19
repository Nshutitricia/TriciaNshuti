package q2;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, java.util.Date createdDate, java.util.Date updatedDate,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift);
        if (age <= 0) throw new IllegalArgumentException("Age must be > 0");
        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female"))
            throw new IllegalArgumentException("Gender must be valid");
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getPassengerName() { return passengerName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContact() { return contact; }
}
