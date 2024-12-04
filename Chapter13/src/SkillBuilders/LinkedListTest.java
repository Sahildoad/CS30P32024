package SkillBuilders;



public class LinkedListTest {
 public static void main(String[] args) {
     LinkedList list = new LinkedList();

 
     list.addAtFront("Sahil");
     list.addAtFront("Noor");
     list.addAtFront("Jd");
     System.out.println(list);

    
     list.remove("Jd");
     list.remove("Sahil");
     list.remove("Noor");
     System.out.println(list);


     list.addAtEnd("Item1");
     list.addAtEnd("Item2");
     System.out.println("After adding items at the end:");
     System.out.println(list);


     System.out.println("Size of the list: " + list.size());

  
     list.makeEmpty();
     System.out.println("After making the list empty:");
     System.out.println(list);
 }
}


