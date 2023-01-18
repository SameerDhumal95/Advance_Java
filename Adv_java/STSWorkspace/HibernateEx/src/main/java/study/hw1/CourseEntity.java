package study.hw1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*In the existing Hibernate project 
	a. add a new entity for the schema Courses --- id, courseName,courseDesc, duration, facultyName

	b. Write a CourseDAO that has following methods
		1. public void addCourse(Session sess)
			-use scanner to accept all values and insert using 				hibernate

		2. public void updateCourseFacutly(Session sess, courseId, newFacultyName)
			- update using hibernate

		3.  public void deleteCourse(Session sess, courseId)
				--delete using hibernate

		4.  public void showCourse(Session sess, courseId)
			   get the course with given Id from table and show 				its details

		5.  public void showAllCourseNamesAndDuration(Session se)
			get all courses from table and show only course names and durations


		CALL THE CourseDAO methods from User class
			In main
				 get the Hibernate Session
				show a menu
					1. add course
					2. update course
					3. delete course
					4. show a course
					5. showAllStudents
					6. deleteStudent
					7. show all courses
					6.quit
 */
@Entity
@Table(name ="Courses")
public class CourseEntity {
	@Id
    @Column(name="ID")
	private int id;

	@Column(name = "Course_Name")
	private String courseName;

	@Column(name = "Course_Desc")
	private String courseDesc;

	@Column(name= "Duration")
	private int duration;

	@Column(name="Faculty_Name")
	private String facultyName;

	public CourseEntity() 
	{

	}

	public CourseEntity(int id, String courseName, String courseDesc, int duration, String facultyName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.duration = duration;
		this.facultyName = facultyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", courseName=" + courseName + ", courseDesc=" + courseDesc + ", duration="
				+ duration + ", facultyName=" + facultyName + "]";
	}


}
