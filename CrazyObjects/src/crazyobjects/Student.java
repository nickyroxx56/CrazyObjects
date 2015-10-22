package crazyobjects;


public class Student
{
    int stuNumber;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books;

    public Student(int stuNumber, String name, Locker myLocker, Jacket myJacket, Book books) {
        this.stuNumber = stuNumber;
        this.name = name;
        this.myLocker = myLocker;
        this.myJacket = myJacket;
        this.books = books;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
