package q2;
import java.util.Date;

public class Payment extends Booking {
    private Date paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, Date createdDate, Date updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   Date bookingDate, String seatNumber, String travelClass,
                   Date paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate,
                airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass);
        if (amountPaid <= 0) throw new IllegalArgumentException("Payment must be > 0");
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    public Date getPaymentDate() { return paymentDate; }
    public String getPaymentMethod() { return paymentMethod; }
    public double getAmountPaid() { return amountPaid; }
}
