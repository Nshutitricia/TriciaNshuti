package q2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, java.util.Date createdDate, java.util.Date updatedDate,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);
        if (licenseNumber.isEmpty()) throw new IllegalArgumentException("License not empty");
        if (experienceYears < 2) throw new IllegalArgumentException("Experience >= 2 years");
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }

    public String getPilotName() { return pilotName; }
    public String getLicenseNumber() { return licenseNumber; }
    public int getExperienceYears() { return experienceYears; }
}
