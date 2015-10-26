package crazyobjects;
public class Book
{
public String title;
public String course;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", course=" + course + '}';
    }

    public Book(String title, String course) {
        this.title = title;
        this.course = course;
    }


} // end Book class
