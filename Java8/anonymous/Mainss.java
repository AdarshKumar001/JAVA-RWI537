public class Mainss {
    public static void main(String[] args) {
        Employees employee = new Employees(){
            @Override 
            public String getSalary(){
                 return "100";
            }

            @Override 
            public String getDegination(){
                return "software engineeer";
            
        }
        

      
        };
        System.out.println(employee.getSalary());

    }
    
}
