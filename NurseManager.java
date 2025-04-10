import java.util.ArrayList;
import java.util.Scanner;

public class NurseManager { // instance of StaffMember
  public static final String DEPARTMENT = "Cardiology"; // example of static variable

  public static void showDepartmentInfo() { // example of static method
    System.out.println("Welcome to the " + DEPARTMENT + " department " + "All nurses operate in this department.");
  }

  ArrayList<String> patients = new ArrayList<>(); // example of array list

  {
    patients.add("John - Stable");
    patients.add("Jane - Critical");
    patients.add("Jim - Serious");
    patients.add("Jill - Stable");
  }

  public void listPatients() {
    for (String patient : patients) {
      System.out.println(patient);
    }
  }

  public void countCriticalPatients() { // countCriticalPatients is a method that counts the number of critical patients
    int criticalPatients = 0; // criticalPatients is a variable that counts the number of critical patients
    for (String patient : patients) {
      if (patient.contains("Critical")) {
        criticalPatients++; // increments the criticalPatients variable by 1 if the patient is critical
      }
    }
    System.out.println("Number of critical patients: " + criticalPatients); // prints the number of critical patients
  }

  public void listCriticalPatients() { // listCriticalPatients is a method that lists all critical patients
    for (String patient : patients) {
      if (patient.contains("Critical")) {
        System.out.println(patient);
      }
    }
  }

  public void countStablePatients() {
    int stablePatients = 0;
    for (String patient : patients) {
      if (patient.contains("Stable")) {
        stablePatients++;
      }
    }
    System.out.println("Number of stable patients: " + stablePatients);
  }

  public void listStablePatients() {
    for (String patient : patients) {
      if (patient.contains("Stable")) {
        System.out.println(patient);
      }
    }
  }

  public void dischargePatient(String ptName) {
    boolean removed = false; // removed is a boolean variable that is used to check if the patient has been

    for (int i = 0; i < patients.size(); i++) {
      if (patients.get(i).startsWith(ptName)) {
        patients.remove(i);
        removed = true;
        System.out.println("Discharged: " + ptName);
        break; // breaks out of the loop if the patient has been removed
      }
    }

    if (!removed) {
      System.out.println("Patient not found");
    }
  }

  // Example of method overloading
  public void admitPatient() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter patient name and status (e.g., Kira - Critical): ");
    String ptName = scanner.nextLine();

    patients.add(ptName);
    System.out.println("Admitted: " + ptName);
  }

  public void admitPatient(String ptName, String status) {
    String formatted = ptName + " - " + status;
    patients.add(formatted);
    System.out.println("Admitted: " + formatted);
  }

  public void admitPatient(String ptName) {
    String formatted = ptName + " - Unknown Status";
    patients.add(formatted);
    System.out.println("Admitted: " + formatted);
  }

}
