
public class Course
{
    //ivars
    private String courseId;
    private String courseName;
    private String courseLeader;
    private int duration;

    public Course(String courseId, String courseName, int duration)
    {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }

    //Accessors Method
    public String getCourseId() //Allow user to access private courseId
    {
        if(this.courseId.equals("")){
        return "is empty";
        }
        return courseId;
    }

    public String getCourseName()   //Allow user to access private courseName
    {
        return courseName;
    }

    public int getDuration()    //Allow user to access private duration
    {
        return duration;
    }

    public String getLeader()   //Allow user to access private courseLeader
    {
        return courseLeader;
    }

    //Mutators Method
    public void setLeader(String courseLeader)//Allows user to set the value of courseLeader
    {
        this.courseLeader = courseLeader;
    }
    
    public void display()//Displays all
    {
        System.out.println("Course Details");
        System.out.println("CourseID: " + courseId);
        System.out.println("CourseName: " + courseName);

        if(courseLeader.isEmpty()) {
            System.out.println("CourseLeader: " + courseLeader);
        }

        System.out.println("Duration: " + this.duration);
    }

}