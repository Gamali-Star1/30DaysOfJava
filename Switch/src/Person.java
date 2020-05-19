public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName1){
        this.firstName = firstName1;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName1){
        this.lastName = lastName1;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAge(int age1){
        if ((age1 < 0) || (age1 > 100))
            this.age = 0;
        else
            this.age = age1;
    }
    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if ((age > 12) && (age < 20))
            return true;
        else
            return false;
    }

    public String getFullName(){
        boolean isEmpty = true;
        if((firstName.isEmpty()) && (lastName.isEmpty()))
            return "";
        else if (lastName.isEmpty())
            return firstName;
        else if (firstName.isEmpty())
            return lastName;
        else
            return firstName + " " + lastName;
    }


}
