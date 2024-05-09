import java.util.*;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.text.html.parser.Entity;

public class Collection4 {

     // //List=ArrayList


    // public static void main(String[] args) {

    // ArrayList<String> Name= new ArrayList<>();
    // Name.add("Adarsh");
    // Name.add("Rahul");
    // Name.add("Ajeet");
    // System.out.println(Name);
    // Name.add(1,"Amit");
    // System.out.println(Name);
    // System.out.println(Name.get(1));

    // ArrayList<Integer> Num= new ArrayList<>();
    // Num.add(10);
    // Num.add(20);
    // Num.add(30);
    // System.out.println(Num);

    // ArrayList<Object> mixList = new ArrayList<>();
    // mixList.addAll(Name);
    // mixList.addAll(Num);
    // System.out.println(mixList);

    // 00000000000000000000000000000
    // public static void main(String[] args) {
    // List<Integer> list=new ArrayList<Integer>();
    // list.add(100);
    // list.add(200);
    // list.add(300);
    // list.add(400);

    // System.out.println(list);

    // list.set(1, 10000);
    // System.out.println(list);

    // for(int i=0;i<list.size();i++){
    // System.out.println("the element is "+list.get(i));
    // }

    // for(Integer element:list){
    // System.out.println("foreeach "+element);
    // }

    // Iterator<Integer> Adarsh=list.iterator();
    // while (Adarsh.hasNext()) {
    // System.out.println("Iterator"+Adarsh.next());
    // }

    // // System.out.println(list.contains(400)); //true

    // // list.remove(2); //remove your index value
    // // System.out.println(list);
    // // list.remove(Integer.valueOf(100)); // value ke type ko remove kar deta hai
    // // System.out.println(list);

    // }

    // 0000000000000000000000000000

    //2 Stack=LIFO

    // public static void main(String[] args) {
    // Stack<String> animals=new Stack<>();
    // animals.add("Lion");
    // animals.add("dog");
    // animals.add("horse");
    // animals.add("cat");
    // System.out.println("Stack type="+animals);

    // System.out.println(animals.peek()); //sabse pahe kon element add huaa hai
    // System.out.println(animals);
    // animals.pop(); //like a remove method hai
    // System.out.println(animals);

    // }

    // 00000000000000000000000000000

    // Queue=LinkedList=FIFO

    // public static void main(String[] args) {
    // Queue<Integer>queue=new LinkedList<>();
    // queue.offer(100);
    // queue.offer(200);
    // queue.offer(300);
    // System.out.println(queue);
    // queue.poll();// poll just like a remove method
    // System.out.println(queue);
    // System.out.println(queue.peek());

    // }

    // 0000000000000000000000000000000
    // Queue=PriorityQueue

    // public static void main(String[] args) {
    //     Queue<Integer> pq = new PriorityQueue<>();//Comparator.reverseOrder() se sabse bada print hoga // is me sabse chhota value pahle aata hai
    //     pq.offer(400); //400 sabse bada hai is liye sabse pichhe print hoga
    //     pq.offer(80);
    //     pq.offer(120);
    //     pq.offer(160);
    //     System.out.println(pq);
    //     pq.poll();
    //     System.out.println(pq);
    //     System.out.println(pq.peek());  // peek means sabse upar kon hai

    // }


    //0000000000000000000000000000000

    //Queue=ArrayDeque
    
    // public static void main(String[] args) {
    //     ArrayDeque<Integer> Add= new ArrayDeque<>();
    //     Add.offer(52);
    //     Add.offerFirst(25);
    //     Add.addLast(45);
    //     Add.offer(55);
    //     System.out.println(Add);
        

    //     System.out.println(Add.peek());
    //     System.out.println(Add.peekFirst());
    //     System.out.println(Add.peekLast());

    //     System.out.println(Add.poll());
    //     System.out.println("poll()"+Add);

    //     System.out.println(Add.pollFirst());
    //     System.out.println("pollFirst"+Add);

    //     System.out.println(Add.pollLast());
    //     System.out.println("pollLast()"+Add);
    // }


    //00000000000000000000000000
    
    //3 Set=HasSet  //isme ham same value ko do bar naho put kar sakte

    // public static void main(String[] args) {
    //     Set<Integer> Aset= new HashSet<Integer>() ;
    //     Aset.add(32);
    //     Aset.add(2);
    //     Aset.add(54);
    //     Aset.add(21);
    //     Aset.add(65);
    //     System.out.println(Aset);

    //     Aset.remove(54);
    //     System.out.println(Aset);

    //     System.out.println(Aset.contains(21));
    //     System.out.println(Aset.isEmpty());
    //     System.out.println(Aset.size());
    //     Aset.clear();
    //     System.out.println(Aset);
    // }


    //00000000000000000000000000

    //Set=LinkedHashSet

    // public static void main(String[] args) {
    //     Set<Integer> set = new LinkedHashSet<>();
    //     set.add(32);
    //     set.add(2);
    //     set.add(54);
    //     set.add(21);
    //     set.add(65);
    //     System.out.println(set);

    //     set.remove(54);
    //     System.out.println(set);

    //     System.out.println(set.contains(21));
    //     System.out.println(set.isEmpty());
    //     System.out.println(set.size());
    // }


//000000000000000000000000000

//Set=TreeSet

// public static void main(String[] args) {
//     Set<Integer> set = new TreeSet<>();
//     set.add(32);
//     set.add(2);
//     set.add(54);
//     set.add(21);
//     set.add(65);
//     System.out.println(set);

//     set.remove(54);
//     System.out.println(set);

//     System.out.println(set.contains(21));
//     System.out.println(set.isEmpty());
//     System.out.println(set.size());
//     }


//0000000000000000000000000000000

//Map=HashMap

// public static void main(String[] args) {
//     Map<String,Integer> Number= new HashMap<>();
//     Number.put("one", 1);
//     Number.put("Two", 2);
//     Number.put("Three", 3);
//     Number.put("Foure", 4);
//     Number.put("Five", 5);
//     System.out.println(Number);

//     // if(!Number.containsKey("Two")){
//     //     Number.put("Two", 23);
//     // }

//     // Number.putIfAbsent("Two", 25);
//     // System.out.println(Number);

//     // for(Map.Entry<String,Integer> e: Number.entrySet()){
//     //     System.out.println(e);

//     //     System.out.println(e.getKey());
//     //     System.out.println(e.getValue());
//     // }

//     Number.remove("Three");
//     System.out.println(Number);
   

// for(Integer value: Number.values()){
//     System.out.println(value);
// }

// for(String key:Number.keySet()){
//     System.out.println(key);
// }

// System.out.println(Number.containsKey("Two"));
// System.out.println(Number.containsValue(3));
// System.out.println(Number.isEmpty());

// Number.remove("Three");
// System.out.println(Number);

// }

//000000000000000000000000000000000000

//ArraysClass

// public static void main(String[] args) {
//     int[] Number={1,2,3,4,5,6,7,8,9,10};
//     int index=Arrays.binarySearch(Number,4);
//     System.out.println("the of element 4 in the arrahy");
//     //8192
//     // Arrays.sort(Number);
//     // for(int i:Number){
//     //     System.out.println(i+" ");
// //}

//         // Arrays.fill(Number, 12);
//         // if(int j:Number){
//         //     System.out.println(j+" ");
//         // }
//     }



//000000000000000000000000000000

//CollectionsClass

// public static void main(String[] args) {
//     List<Integer> list= new ArrayList<>();
//     list.add(34);
//     list.add(12);
//     list.add(9);
//     list.add(76);
//     list.add(29);
//     list.add(75);

//     // System.out.println("min element"+Collection.min(list));
//     // System.out.println("min element"+Collection.max(list));
//     System.out.println(Collections.frequency(list, 9));

//     Collections.sort(list);
//     System.out.println(list);

// }
  }

