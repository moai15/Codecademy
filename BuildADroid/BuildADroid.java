public class Droid {
    int batteryLevel;
    String name;
    String droidName;
  
  public Droid(String droidName) {
    this.batteryLevel = 100;
    this.droidName = droidName;
  }

  public String toString() {
    return "Hello, I'm the droid: " + droidName; 
  }

   public void performTask(String task) {
    System.out.println(droidName + " is performing task: " + task);
    batteryLevel -= 10;
    System.out.println("Battery level is now : " + batteryLevel);
  }

  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    Droid Joe = new Droid("Joe");
    Codey.performTask("dancing");
    Joe.performTask("levitating");

  }
}