package homework5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String telefonNumber;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, String telefonNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telefonNumber = telefonNumber;
        this.salary = salary;
        this.age = age;
    }

    public  void informationOutput(){
        System.out.printf("ФИО:"+fio +
                "\nДолжность:" + position +
                "\nЭлектронная почта:" + email +
                "\nНомер телефона:" + telefonNumber +
                "\nЗарплата:" + salary +
                "\nВозраст:" + age +"\n");

    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
