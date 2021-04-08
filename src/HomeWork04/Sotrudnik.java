package HomeWork04;

public class Sotrudnik {
    private String nameFIO;
    private String position;
    private int age;
    private long telNumber;
    private int salary;
    private int salaryChange;
    public static int count = 0;
    private int uid;

    public Sotrudnik(String nameFIO, String position, int age, long telNumber, int salary) {
        this.nameFIO = nameFIO;
        this.position = position;
        this.age = age;
        this.telNumber = telNumber;
        this.salary = salary;
        this.salaryChange = 0;
        this.uid = count; // Уникальный номер сотрудника = счетчику при добавлении.

    }

    public void shoName() {
        printThis(nameFIO + "\n");
    }

    public void shoPosition() {
        printThis(position + "\n");
    }

    public void shoAge() {
        printThis(Integer.toString(age) + "\n");
    }

    public String getNameFIO() {
        return nameFIO;
    }

    public String getCountAndFIO() {
        return "Уникальный номер сотрудника: " + uid + " Имя сотрудника: " + nameFIO;
    }

    public void setNameFIO(String nameFIO) {
        this.nameFIO = nameFIO;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        // printThis("age:" + getAge() + "\n");

        this.salary = salary;
    }

    public static void printThis(String args) {
        System.out.print(args);
    }

    // Блок смены ЗП.

    // public int getSalaryChange(){ return salaryChange;}
    // public void setSalaryChange(int salaryChange){this.salaryChange=salaryChange;}

    void changeSalary() {

        if ((age >= 35) && (salaryChange == 1)) {
            printThis("Попытка повторно сменить зарплату.\n");
        }

        if ((age >= 35) && (salaryChange == 0)) {
            salary *= 3;
            salaryChange = 1;
            printThis("Установлена ЗП по условию: " + salary + ".\n");
        } // Увеличиваем базовую ЗП в три раза и меняем признак смены ЗП.
        if (age < 35) {
            printThis("ЗП по условию не изменяется.\n");
        }

    }

}

