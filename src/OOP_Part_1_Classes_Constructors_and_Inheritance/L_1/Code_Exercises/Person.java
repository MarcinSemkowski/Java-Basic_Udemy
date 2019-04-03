package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises;

public class Person {

private String firstName;
private String lastName;
private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if((age > 100) || (age < 0)){
            this.age = 0;
       }
       else{
           this.age = age;
       }



    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTeen(){
        boolean resultIsTeen = (age > 12 && age < 20)
                ? true
                : false;
        return resultIsTeen ;
    }
    public String getFullName() {
        String fullName = ((lastName.isEmpty()) && (firstName.isEmpty()))
                ? " "
                : ((!lastName.isEmpty()) && (!firstName.isEmpty()))
                ? firstName + " " + lastName
                : ((!firstName.isEmpty()) && (lastName.isEmpty()))
                ? firstName
                : lastName;
        return fullName;


    }

}
