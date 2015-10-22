package crazyobjects;


public class Student
{
    int stuNumber;
    String name;
    Locker myLocker = new Locker();
    Jacket myJacket = new Jacket();
    Book books = new Book();
    public Student(String n, int s)  {
        name = n;
        stuNumber = s;
    }
    public void sendToOffice(String reason){
        System.out.println("The student has been sent to the office because:");
        System.out.println(reason);
    } //prints out the reason why the student was sent to the office
    @Override
    public String toString() {
        return "Student{" + "stuNumber=" + stuNumber + ", name=" + name + ", myLocker=" + myLocker + ", myJacket=" + myJacket + ", books=" + books + '}';
    }
} // end Student class
