public class Main {
  public static void main(String[] args) {
    NurseManager manager = new NurseManager();
    NurseManager.showDepartmentInfo();
    manager.listPatients();
    manager.countCriticalPatients();
    manager.listCriticalPatients();
    manager.countStablePatients();
    manager.listStablePatients();
    manager.dischargePatient("Jim");
    manager.listPatients();
    manager.admitPatient("Kira");
    manager.admitPatient("James", "Critical");
  }
}