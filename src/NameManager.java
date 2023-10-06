public class NameManager {
    String first_name = "";
    String second_name = "";

    public void getName(String first_name, String second_name) {
        this.first_name = first_name;
        this.second_name = second_name;
    }

    public void printName() {
        System.out.println("Name: " + this.first_name + " " + this.second_name);
    }
}
