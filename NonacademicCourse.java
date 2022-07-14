
public class NonacademicCourse extends Course
{
    private String instructorName;
    private int duration;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered, isRemoved;

    public NonacademicCourse(String courseId, String courseName, int duration, String prerequisite)
    {
        super(courseId,courseName,duration);

        this.prerequisite = prerequisite;
        instructorName = "";
        startingDate = "";
        completionDate = "";
        examDate = "";
        isRegistered = false;
        isRemoved = false;
    }

    /*Accessors(getter) Method
       Allows user to access all the instant variables
       */
     public String getInstructorName()   //Allow us to access the value of private instant variable instructorName
    {
        return instructorName;
    }

    public int getDuration()    //Allow us to access the value of private instant variable duration
    {
        return duration;
    }

    public String getStartingDate()  //Allow us to access the value of private instant variable startingDate 
    {
        return startingDate;
    }

    public String getCompletionDate()   //Allow us to access the value of private instant variable completionDate
    {
        return completionDate;
    }

    public String getExamDate() //Allow us to access the value of private instant variable examDate
    {
        return examDate;
    }

    public String getPrerequisite() //Allow us to access the value of private instant variable prerequisite
    {
        return prerequisite;
    }

    public boolean getIsRegistered()//Allow us to access the value of private instant variable isRegistered
    {
        return isRegistered;
    }

    public boolean getIsRemoved()   //Allow us to access the value of private instant variable isRemoved
    {
        return isRemoved;
    }

    /*Mutators(setter) Method
       it sets the value of the instant variable
       */
    public void setInstructorName(String instructorName)//Allow us to set the value of instant variable instrucorName
    {
        if(isRegistered == false) {
            this.instructorName = instructorName;
        }

        else {
            System.out.println("This course is registered therefore Instructor Name can't be updated");
        }
    }

    public void registerCourse(String courseLeader, String instructorName, String startingDate, String completionDate, String examDate)
    {
        if(isRegistered == false) {
            super.setLeader(courseLeader);

            setInstructorName(instructorName);
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            isRegistered = true;
        }

        else {
            System.out.println("This course has been Registered!");
        }
    }

    public void removeCourse()
    {
        if(isRemoved == true) {
            System.out.println("This course has been removed!");
        }

        else {
            super.setLeader("");
            
            instructorName = "";
            startingDate = "";
            completionDate = "";
            examDate = "";
            isRegistered = false;
            isRemoved = true;
        }
    }

    public void display()
    {
        if(isRegistered == true) {
            super.display();
            System.out.println("Instructor Name: " + instructorName);
            System.out.println("Starting Date: " + startingDate);
            System.out.println("Completion Date: " + completionDate);
            System.out.println("Examination Date: " + examDate);
        }
        
        else {
            super.display();
        }
    }
}
