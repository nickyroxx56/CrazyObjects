
import crazyobjects.Student;


public class ClassRoom
{
   public String course;
   public String teacher;

    public ClassRoom(String course, String teacher) {
        this.course = course;
        this.teacher = teacher;
    }
   

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
   
    public boolean enterClass(Student me){
        System.out.println("Student: "+me.getName()+"came to class "+course+" taught by "+teacher);
        if (me.myLocker == null){
            me.sendToOffice("Get a Locker!");
            return false;
        }
        if (me.myLocker.isJacketInLocker == false){
            me.sendToOffice("Go put jacket away!");
            return false;
        }
        if (me.getBooks() == null){
             me.sendToOffice("Get a book!");
            return false;
        }
        for (int i = 0; i < me.books.length; i++){
            if (me.books[i].equals(course)){
                return true;
            }
        }
        
        return false;
    }
   

} // end ClassRoom class


