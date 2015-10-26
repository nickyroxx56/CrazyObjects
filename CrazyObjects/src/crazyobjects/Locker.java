package crazyobjects;
public class Locker
{
    public Jacket studentJacket;
    public int number;
    public Student owner;
    public Book[] books;
    public boolean isJacketInLocker;

    public Locker(Jacket studentJacket, int number, Student owner, Book[] books, boolean isJacketInLocker) {
        this.studentJacket = studentJacket;
        Jacket myJacket = new Jacket(owner);
        Book myBook = new Book (title, course);
        this.number = number;
        this.owner = owner;
        this.books = books;
        this.isJacketInLocker = isJacketInLocker;
        //this.owner = new Student();
        //this.studentJacket = new Jacket();
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
