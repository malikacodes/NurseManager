public class NurseManager { // NurseManager is a class that manages nurses and their patients
  String[] patients = { "John - Stable", "Jane - Critical", "Jim - Serious", "Jill - Stable" }; // patients is an array
                                                                                                // of strings that
                                                                                                // contains the
                                                                                                // patients' names and
                                                                                                // their statuses

  public void listPatients() {
    for (int i = 0; i < patients.length; i++) { // for loop that iterates through the patients array
      System.out.println(patients[i]); // prints the patient at index i
    }
  }

  public void countCriticalPatients() { // countCriticalPatients is a method that counts the number of critical patients
    int criticalPatients = 0; // criticalPatients is a variable that counts the number of critical patients
    for (int i = 0; i < patients.length; i++) {
      if (patients[i].contains("Critical")) {
        criticalPatients++; // increments the criticalPatients variable by 1 if the patient is critical
      }
    }
    System.out.println("Number of critical patients: " + criticalPatients); // prints the number of critical patients
  }

  public void listCriticalPatients() { // listCriticalPatients is a method that lists all critical patients
    for (int i = 0; i < patients.length; i++) {
      if (patients[i].contains("Critical")) {
        System.out.println(patients[i]);
      }
    }
  }
}
