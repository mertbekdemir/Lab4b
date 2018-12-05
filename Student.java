public class Student
{
 { private String firstName; private String lastName; private String preferredName;
    public Student(String firstName, String lastName, String preferredName) {
        this.firstName = firstName; this.lastName = lastName; this.preferredName = preferredName;
    }

    public Student(String firstName, String lastName) { 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.preferredName = null;
    }
}
// or can leave it undefined (i.e., null or “”) } } }