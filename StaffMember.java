public class StaffMember {
  protected String name;
  protected String staffID;

  public StaffMember(String name, String staffID) {
    this.name = name;
    this.staffID = staffID;
  }

  public void showInfo() {
    System.out.println("Name: " + name);
    System.out.println("Staff ID: " + staffID);
  }

}

class Nurse extends StaffMember {

  public Nurse(String name, String staffID) {
    super(name, staffID); // inherit name and ID from StaffMember
  }

  public void doRounding() {
    System.out.println(name + " is doing patient rounds.");
  }
}
