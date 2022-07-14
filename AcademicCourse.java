public class AcademicCourse extends Course
{      
    //ivars
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered, isRemoved;
    
    public AcademicCourse(String courseId, String courseName, int duration, String level, String credit, int numberOfAssessments)
    {
        super(courseId, courseName, duration);

        this.level = level;
        this.credit = credit;
        this.numberOfAssessments = numberOfAssessments;
        lecturerName = "";
        startingDate = "";
        completionDate = "";
        isRegistered = false;
        isRemoved = true;
    }
    
    //Accessors Method
    public String getLecturerName() //Allow us to access the value of private instant variable lecturerName
    {
        return lecturerName;
    }

    public String getLevel()    //Allow us to access the value of private instant variable level
    {
        return level;
    }

    public String getCredit()   //Allow us to access the value of private instant variable credit
    {
        return credit;
    }

    public String getStartingDate() //Allow us to access the value of private instant variable startingDate
    {
        return startingDate;
    }

    public String getCompletionDate()   //Allow us to access the value of private instant variable completionDate
    {
        return completionDate;
    }

    public int getNumberOfAssessments() //Allow us to access the value of private instant variable numberOfAssessments
    {
        return numberOfAssessments;
    }
        
    public boolean getIsRegistered()    //Allow us to access the value of private instant variable isRegistered
    {
        return isRegistered;
    }

    public boolean getIsRemoved()   //Allow us to extract the value of private instant variable isRemoved
    {
        return isRemoved;
    }

    //Mutators Method
    public void setLecturerName(String lecturerName)//allows us to set the value of instant variable lecturerName
    {
        this.lecturerName = lecturerName;
    }

    public void setNumberOfAssessments(int numberOfAssessments)//allows us to set the value of instant variable numbetOfAssesments
    {
        this.numberOfAssessments = numberOfAssessments;
    }
    
    public void registerCourse(String courseLeader, String lecturerName, String startingDate, String completionDate)
    {
        if(isRegistered == false) {
            super.setLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            isRegistered = true;
            isRemoved = false;
        }

        else {
            System.out.println("This course is being registerd to " +lecturerName + " to complete within " + startingDate + " to " + completionDate);
        }
    }

    public void display()
    {
        if(isRegistered == true) {
            super.display();
            System.out.println("Lecturer Name: " + lecturerName);
            System.out.println("Level: " + level);
            System.out.println("Credit: " + credit);
            System.out.println("Starting Date: " + startingDate);
            System.out.println("Completion Date: " + completionDate);
        }

        else {
            super.display();
        }
    }

}
