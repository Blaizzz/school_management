package efrei.fr;

public class Subject {
    private String subjectCode;
    private String subjectDescription;
    private Double grade;

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Subject(String subjectCode, String subjectDescription, Double grade) {
        this.subjectCode = subjectCode;
        this.subjectDescription = subjectDescription;
        this.grade = grade;
    }

    public Subject() {
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectDescription='" + subjectDescription + '\'' +
                ", grade=" + grade +
                '}';
    }
}
