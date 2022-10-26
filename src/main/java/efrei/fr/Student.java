package efrei.fr;

public class Student {


    private String firstName;
    private String phone;
    private String email;
    private Integer yearRegister;
    private String studentNumber;
    private String LastName;

    public Student(){}

    public Student(String firstName, String phone, String email, Integer yearRegister, String studentNumber, String lastName) {
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.yearRegister = yearRegister;
        this.studentNumber = studentNumber;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getYearRegister() {
        return yearRegister;
    }

    public void setYearRegister(Integer yearRegister) {
        this.yearRegister = yearRegister;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "LastName='" + LastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", yearRegister=" + yearRegister +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }


}
