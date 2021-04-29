fun main(args: Array<String>) {

    //creates an instance of the applicant object
    val admitsApplicant = Applicant("Ruth", "Unoka", 19)
    val admitsApplicant1 =Applicant("Mike", "Angelo",15)
    val admitsApplicant2 =Applicant("Mary", "Oge",15)


    //create an instance of the principal object
   var principal = Principal()
    principal.admitsApplicant(admitsApplicant, "Ruth123")
    principal.admitsApplicant(admitsApplicant1,"Ruth123")
    principal.admitsApplicant(admitsApplicant2, "Ruth123")

    val studentToBeExpelled = Student("Ruth", "unoka", 20, "Ruth123")
    Principal().expelStudent(studentToBeExpelled)

    val teach = Teacher("Bola Jide", "Bola234", Role.TEACHER )
    val math = Course("Maths","MTH111")
    teach.teachCourse(math)

    val Ruth = Student("Ruth", "Unoka",20,"Ruth123")
    Ruth.takeCourse(Ruth.studentCoursesToBeTaken)
}
