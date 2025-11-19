package q2;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        if (!contactEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (airlineCode.length() < 2 || airlineCode.length() > 4)
            throw new IllegalArgumentException("Airline code 2-4 letters");
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() { return airlineName; }
    public String getAirlineCode() { return airlineCode; }
    public String getContactEmail() { return contactEmail; }
}
