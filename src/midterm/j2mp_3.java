public class j2mp_3 {
    public static void main(String[] args) {
    Payroll joshua = new Payroll("Joshua", 22);
    Payroll employee = new Payroll();
    employee.setName("");
    employee.setId(-3);
    employee.setHourRate(30);
    employee.setHoursWorked(90);
    }
}

class Payroll{
 String name;
 int id;
 double hourRate;
 int hoursWorked;

 Payroll(){}

 Payroll(String name, int id){
     this.name = name;
     this.id = id;
 }

 void setName(String name){
     try {
         if (name.equals("")) {
             throw new EmptyString("Cant be an empty String");
         }else {
             this.name = name;
         }
     }catch (EmptyString e){
         System.out.println(e.getMessage());
     }

 }

 String getName(){
     return this.name;
 }

 void setId(int id){
     try {
         if (id == 0 || id < 0) {
             throw new Numeric("ID needs to be a positive number");
         }else{
             this.id = id;
         }
     }catch (Numeric e){
         System.out.println(e.getMessage());
     }
 }

 int getId(){
     return this.id;
 }

 void setHourRate(double hourRate){
     try {
         if(hourRate < 0 || hourRate > 25){
             throw new WrongRate("Please enter valid rate");
         }else{
             this.hourRate = hourRate;
         }
     }catch(WrongRate e){
         System.out.println(e.getMessage());
     }
 }

 void setHoursWorked(int hoursWorked){
     try{
         if(hoursWorked < 0 || hoursWorked > 84){
             throw new WrongHours("Please enter valid hours");
         }else{
             this.hoursWorked = hoursWorked;
         }
     }catch (WrongHours e){
         System.out.println(e.getMessage());
     }
 }

 double grossPay(){
     return this.hoursWorked * this.hourRate;
 }
}


