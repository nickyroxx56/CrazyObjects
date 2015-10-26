package crazyobjects;


public class Student
{
    public int stuNumber;
    public String name;
    public Locker myLocker;
    public Jacket myJacket;
    public Book books[];

    public Student(int stuNumber, String name) {
        this.stuNumber = stuNumber;
        this.name = name;
        
        
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

    public int getStuNumber() {
        return stuNumber;
    }
    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Locker getMyLocker() {
        return myLocker;
    }

    public void setMyLocker(Locker myLocker) {
        this.myLocker = myLocker;
    }

    public Jacket getMyJacket() {
        return myJacket;
    }

    public void setMyJacket(Jacket myJacket) {
        this.myJacket = myJacket;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

} // end Student class
