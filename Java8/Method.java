import java.util.List;
import java.util.stream.Collectors;
import java.text.Collator;
import java.util.Arrays;

// public class Method {
//     public static void print(String s){
//         System.out.println(s);
//     }

//     public static void main(String[] args) {
//         List<String> students= Arrays.asList("Adarsh","Ajeet","Vivek");
//         students.forEach(Method::print);
//     }
    
// }

//0000000000000000000000000000000000000000000

// bina static ke

// public class Method {
//     public void print(String s){
//         System.out.println(s);
//     }

//     public static void main(String[] args) {
//         Method method= new Method();
//         List<String> students= Arrays.asList("Adarsh","Ajeet","Vivek");
//         students.forEach(method::print);
//     }
    
// }

// 0000000000000000000000000000000000

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

public class Method {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Anil", "Ashok", "Binod");
        List<Student> students = name.stream()
                                     .map(Student::new)
                                     .collect(Collectors.toList());

        students.forEach(System.out::println);
    }
}

