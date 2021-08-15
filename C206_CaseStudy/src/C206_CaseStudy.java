import java.util.ArrayList;

public class C206_CaseStudy {

	static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

	private static final int APPOINTMENT_OPTION = 13;
	private static final int APPOINTMENT_VIEW = 1;
	private static final int APPOINTMENT_ADD = 2;
	private static final int APPOINTMENT_UPDATE = 3;
	private static final int APPOINTMENT_DELETE = 4;
	private static final int APPOINTMENT_QUIT = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appointmentList.add(new Appointment("Alex Smith", "12/8/2021"));
		appointmentList.add(new Appointment("John Alexander", "18/5/2021"));
		appointmentList.add(new Appointment("Sleggar Law", "18/5/2021"));
		appointmentList.add(new Appointment("Roberta Lovelace", "18/5/2021"));

		int option = 0;

		while (option != 14) {
			C206_CaseStudy.optionMenu();
			option = Helper.readInt("Enter Option > ");

			if (option == 1) {

			} else if (option == 2) {

			} else if (option == 3) {

			} else if (option == 4) {

			} else if (option == 5) {

			} else if (option == 6) {

			} else if (option == 7) {

			} else if (option == 8) {

			} else if (option == 9) {

			} else if (option == 10) {

			} else if (option == 11) {

			} else if (option == 12) {

			} else if (option == APPOINTMENT_OPTION) {
				C206_CaseStudy.appointmentMenu();
				int optiOn = Helper.readInt("Enter Option > ");

				if (optiOn == APPOINTMENT_VIEW) {
					C206_CaseStudy.viewAppointment(appointmentList);
				} else if (optiOn == APPOINTMENT_ADD) {
					C206_CaseStudy.addAppointment(appointmentList);
				} else if (optiOn == APPOINTMENT_UPDATE) {
					C206_CaseStudy.updateAppointment(appointmentList);
				} else if (optiOn == APPOINTMENT_DELETE) {
					C206_CaseStudy.deleteAppointment(appointmentList);
				} else if (optiOn == APPOINTMENT_QUIT) {
					C206_CaseStudy.optionMenu();
				} else {
					System.out.println("Invalid Option");
				}
			} else {
				if (option != 14) {
					System.out.println("Invalid Option");
				}
			}

		}
	}

	public static void optionMenu() {
		Helper.line(60, "=");
		System.out.println("RC Cars Lovers App");
		Helper.line(60, "=");
		System.out.println("1. View Accounts");
		System.out.println("2. Add Account");
		System.out.println("3. Update Account");
		System.out.println("4. Delete Account");
		System.out.println("5. View RC Car");
		System.out.println("6. Add RC Car");
		System.out.println("7. Update RC Car");
		System.out.println("8. Delete RC Car");
		System.out.println("9. View RC Car Parts");
		System.out.println("10. Add RC Car Parts");
		System.out.println("11. Update RC Car Parts");
		System.out.println("12. Delete RC Car Parts");
		System.out.println("13. Appointment Menu");
		System.out.println("14. Exit");
	}

	public static void appointmentMenu() {
		Helper.line(60, "=");
		System.out.println("Appointment Menu");
		Helper.line(60, "=");
		System.out.println("1. View Appointment");
		System.out.println("2. Add Appointment");
		System.out.println("3. Update Appointment");
		System.out.println("4. Delete Appointment");
		System.out.println("5. Exit");
	}

	public static void viewAppointment(ArrayList<Appointment> appointmentList) {
		Helper.line(60, "=");
		System.out.println("VIEW APPOINTMENT");
		Helper.line(60, "=");

		String output = "";

		if (appointmentList.size() == 0) {
			System.out.println("No Appointments");
		} else {
			Helper.line(60, "");
			System.out.println("ALL APPOINTMENTS");
			Helper.line(60, "=");

			output = String.format("%-20s %-10s \n", "CUSTOMER NAME", "APPOINTMENT DATE");
			for (int i = 0; i < appointmentList.size(); i++) {
				output += String.format("%-20s %-10s \n", appointmentList.get(i).getCustName(),
						appointmentList.get(i).getAppointmentDate());
			}
			System.out.println(output);
		}

	}

	public static void addAppointment(ArrayList<Appointment> appointmentList) {
		Helper.line(60, "=");
		System.out.println("ADD APPOINTMENT");
		Helper.line(60, "=");
		
		String name = Helper.readString("Enter Customer's Name: ");
		String day = Helper.readString("Enter Appointment Day: ");
		String month = Helper.readString("Enter Appointment Month: ");
		String year = Helper.readString("Enter Appointment Year: ");
		String date = day + "/" + month + "/" + year;

		Appointment newAppointment = new Appointment(name,date);
		appointmentList.add(newAppointment);
		
	}

	public static void updateAppointment(ArrayList<Appointment> appointmentList) {
		Helper.line(60,"=");
		System.out.println("UPDATE APPOINTMENT");
		Helper.line(60,"=");
		

		String searchName = Helper.readString("Enter Customer's Appointment To Update: ");
		String newName = Helper.readString("Enter New Customer's Name: ");
		String newDay = Helper.readString("Enter New Appointment Day: ");
		String newMonth = Helper.readString("Enter New Appointment Month: ");
		String newYear = Helper.readString("Enter New Appointment Year: ");
		String newDate = newDay + "/" + newMonth + "/" + newYear;
		
		for (Appointment i : appointmentList) {
			if(!i.getCustName().equals(searchName)) {
				System.out.println("Cannot Be Found");;
			}
			else if(i.getCustName().equals(searchName)) {
				i.setCustName(newName);
				i.setAppointmentDate(newDate);
			}
			else {
				System.out.println("Invalid");
			}
			
		}
		
	}

	public static void deleteAppointment(ArrayList<Appointment> appointmentList) {
		Helper.line(60,"=");
		System.out.println("DELETE APPOINTMENT");
		Helper.line(60,"=");
		
		String searchName = Helper.readString("Enter Customer's Appointment To Delete: ");
		
		for (Appointment i : appointmentList) {
			if(!i.getCustName().equals(searchName)) {
				System.out.println("Cannot Be Found");;
			}
			else if(i.getCustName().equals(searchName)) {
				appointmentList.remove(i);
				System.out.println("Appointment Has Been Deleted");
				break;
			}
		}
	}
}
