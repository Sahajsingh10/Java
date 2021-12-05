
public class Customer {
 private String name;
 private int age;
 
 public Customer(String name, int age) {
	 this.age = age;
	 this.name = name;
 }
	
 public Customer(Customer c) {
	 this.name = c.name;
	 this.age = c.age;
 }
 
	
 public String toString() {
	String st = name + " " + age; 
	return st; 
 }
 
 public String getName() {
	 return name;
 }
 public void setName(String name) {
	 this.name = name;
 }
 
 public int getAge() {
	 return age;
 }
 public void setAge(int age) {
	 this.age = age;
 }
 
}
