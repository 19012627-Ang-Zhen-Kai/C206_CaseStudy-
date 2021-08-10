
public class Appointment {

	private String custName;
	private String appointmentDate;

	public Appointment(String custName, String appointmentDate) {
		super();
		this.custName = custName;
		this.appointmentDate = appointmentDate;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

}
