package crazyobjects;
public class Locker
{
    public Jacket studentJacket;
    public int number;
    public Student owner;
    public Book[] books;

    public Jacket getStudentJacket() {
        return studentJacket;
    }

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

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Locker{" + "studentJacket=" + studentJacket + ", number=" + number + ", owner=" + owner + ", books=" + books + '}';
    }

    public Locker(int number, Book[] books) {
        this.number = number;
        this.books = books;
        this.owner = new Student();
        this.studentJacket = new Jacket();
        
    }
    
    public Jacket takeOutJacket() {
        return .getStudentjacket;
    }
    
} // end Locker class
