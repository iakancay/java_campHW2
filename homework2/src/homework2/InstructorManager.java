package homework2;

public class InstructorManager extends UserManager{
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" was appointed to this course as a instructor..");
	}

}
