package crazyobjects;

import java.util.ArrayList;

public class Locker
{
    public Jacket studentJacket;
    public int number;
    public Student owner;
    public ArrayList<Book> books = new ArrayList<Book>();
    public boolean isJacketInLocker;

    public Locker(int number, Student owner) {
        this.studentJacket = studentJacket;
        Jacket myJacket = new Jacket(owner);
        Book myBook = new Book ("Comsci", "ICS4U");
        this.number = number;
        this.owner = owner;
        
        //this.owner = new Student();
        //this.studentJacket = new Jacket();
    }

    
//ASWAGGas
    public void setStudentJacket(Jacket studentJacket) {
        this.studentJacket = studentJacket;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

  

    @Override
    public String toString() {
        return "Locker{" + "studentJacket=" + studentJacket + ", number=" + number + ", owner=" + owner + ", books=" + books + ", isJacketInLocker=" + isJacketInLocker + '}';
    }

    public Jacket checkJacket() {
        return studentJacket;
    }

    public void takeOutJacket() {
        isJacketInLocker = false;
    }
    
    public void putJacket() {
        isJacketInLocker = true;
    }

} // end Locker class
