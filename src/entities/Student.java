package entities;

public class Student {
    String name;
    Double grade1;
    Double grade2;
    Double grade3;
    Integer weight1 = 30;
    Integer weight2 = 35;
    Integer weight3 = 35;

    public Student(String name, Double grade1, Double grade2, Double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public Double calculateWeightedAverage() {
        return ((this.grade1 * weight1) + (this.grade2 * weight2) + (this.grade3 * weight3)) / (weight1 + weight2 + weight3);
    }

    public Double getFinalGrade() {
        return calculateWeightedAverage();
    }

    public void displayStudentResult() {
        Double finalGrade = getFinalGrade();
        if (finalGrade >= 60) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAILED");
            displayMissingPoints();
        }
    }

    public Double getMissingPoints() {
        return 100 - getFinalGrade();
    }

    public void displayFinalGrade() {
        System.out.printf("FINAL GRADE = %.2f\n", getFinalGrade());
    }

    public void displayMissingPoints() {
        System.out.printf("MISSING %.2f POINTS\n", getMissingPoints());
    }

    public void displayFinalResult() {
        displayFinalGrade();
        displayStudentResult();
    }
}
