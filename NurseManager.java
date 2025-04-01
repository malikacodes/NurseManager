public class NurseManager { // NurseManager is a class that manages nurses and their patients

  public void listPatients() { // listPatients is a method that lists all patients 
    String[] patients = {"John - Stable", "Jane - Critical", "Jim - Serious", "Jill - Stable"};
    for (int i = 0; i < patients.length; i++) { // for loop that iterates through the patients array
      System.out.println(patients[i]); // prints the patient at index i 
    }

  public void countCriticalPatients() { // countCriticalPatients is a method that counts the number of critical patients
    String[] patients = { "John - Stable", "Jane - Critical", "Jim - Serious", "Jill - Stable" };
    int criticalPatients = 0;
    for (int i = 0; i < patients.length; i++) {
      if (patients[i].contains("Critical")) {
        criticalPatients++;
      }
    }
    System.out.println("Number of critical patients: " + criticalPatients);
  }
}

public class Main {
  public static void main(String[] args) {
    NurseManager manager = new NurseManager(); // you create the NurseManager object
    manager.listPatients(); // calls listPatients()
    manager.countCriticalPatients(); // calls countCriticalPatients()
  }
}
