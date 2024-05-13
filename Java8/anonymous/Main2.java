public class Main2 {
    int x=10;
    private void doSomething(){
      Employee employee =()->{
        System.out.println(this.x);
        return "100";
      };

      Employee employee2= new Employee() {
        int x=10;
        @Override
        public String getSallary(){
            System.out.println(this.x);
            return "100";
        }
      };
    
    }
    interface Employee{
        String getSallary();
    }
    
}
