public class Person {
    // write your code here
    private String firstName;
   private String lastName;
   private int age;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String fName){
        firstName =fName;
    }
    public void setLastName(String lName){
         lastName = lName;
    }
    public void setAge(int a){
        if(a<0 || a>100){
            age = 0;
        }else{
            age=a;
        }
    }
    public boolean isTeen(){
        return  (age>12&&age<20)?true:false;
    }
    public String getFullName(){
        String fullName=firstName+" "+lastName;
        if(firstName.isEmpty()&&lastName.isEmpty()){
             return "";
        }
        if(firstName.isEmpty()){
            return lastName;
        }
        if(lastName.isEmpty()){
            return firstName;
        }
        return fullName;
    }
}