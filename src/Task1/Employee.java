package Task1;

 class Employee {

   private  String name;
   private int age;
   private String department;

    void showEmployeeDetails(){
       System.out.println("Numele : "+getName()+"\nVirsta : "+getAge()+"\nDepartamentul : "+getDepartment());
   }
    void setName (String name){
       if (name.matches("[a-zA-Z]+")) {
           this.name = name;
       }else
       {throw new IllegalArgumentException("Numele trebuie sa contina doar litere!!!");}
   }
    String getName(){
       return name;
   }

    void setAge(int age){
       if (age<18) {
           throw new IllegalArgumentException("Virsta trebuie sa fie mai mare de 18 ani!!!");
       }else
       {this.age = age;}
   }
    int getAge(){
       return age;
   }
    void setDepartment(String department){
      this.department = department;
   }
    String getDepartment(){
       return department;
   }

    Employee(String name,int age,String department){
       setName(name);
       setAge(age);
       setDepartment(department);

   }
}
