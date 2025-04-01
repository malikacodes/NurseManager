public class Main {
  public static void main(String[] args) {
    NurseManager manager = new NurseManager();
    manager.listPatients();
    manager.countCriticalPatients();
    manager.listCriticalPatients();
  }
}