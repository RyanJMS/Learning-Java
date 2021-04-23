public class StudentProfile {
    String firstName;
    String lastName;
    int expectedGraduation;
    double GPA;
    String declaredMajor;

    public void nextYear(){
        expectedGraduation++;
    }

    public StudentProfile(String firstName, String lastName,
                          int expectedGraduation, double GPA,
                          String declaredMajor)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduation = expectedGraduation;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }



    public static void main(String[] args) {
        StudentProfile ryan = new StudentProfile("Ryan", "Schock",
                2021, 4.0, "Computer Science");
        System.out.println(ryan.firstName + " " + ryan.lastName + " " + ryan.expectedGraduation + " " +
                ryan.GPA + " " + ryan.declaredMajor);
        ryan.nextYear();
        System.out.println(ryan.firstName + " " + ryan.lastName + " will graduate in the year " + ryan.expectedGraduation);
    }
}
