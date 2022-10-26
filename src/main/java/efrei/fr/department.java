package efrei.fr;

public class department {
    private double Grade;
    public double getGrade() {
        return Grade;
    }

    public department() {}

    public void setGrade(double grade) {
        Grade = grade;
    }

    public department(double grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "department{" +
                "Grade=" + Grade +
                '}';
    }
    
}
