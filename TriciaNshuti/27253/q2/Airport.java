package q2;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, java.util.Date createdDate, java.util.Date updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        if (code.length() != 3) throw new IllegalArgumentException("Airport code must be 3 letters");
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() { return airportName; }
    public String getCode() { return code; }
    public String getLocation() { return location; }
}
