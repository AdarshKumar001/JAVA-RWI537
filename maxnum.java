public class maxnum {
    public static void main(String[]args){
        
        
               int []a={1,2,8,80,20};
        
               int max = a[0];
               for(int i=1; i<a.length; i++)
               {
                   if(max <a[i]){
                       max=a[i];
        
                   }
               }
               System.out.println(max);
        
           }
}
