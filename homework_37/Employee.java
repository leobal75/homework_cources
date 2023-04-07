public abstract class Employee {
    private String name;
    private String email;
    private int ID_num;
    public Employee(String name, String email, int ID_num) {
        this.name = name;
        this.email = email;
        this.ID_num = ID_num;
    }
    public void mailPaySlip() {
        System.out.println("Это метод класса Employee");
        System.out.println("Уважаемый " + this.name + ", направляем информацию о зарплате на адрес " + this.email);
    }

    public String toString() {
        return name + " " + email + " " + ID_num;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getID_num() {
        return ID_num;
    }
}
