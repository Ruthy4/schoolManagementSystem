class Principal : Staff() {
    private val school: School = School()


    // function to admit new applicant
    fun admitsApplicant(newApplicant: Applicant, id: String) {
        if ((newApplicant.getAge() in 12..20) && newApplicant.getExamScore() > 50) {
            println(
                "Name: ${newApplicant.getName()}" +
                        "\nAge:${newApplicant.getAge()} \nExam Score: ${newApplicant.getExamScore()}. \nYou passed the requirements. you have been admitted "
            )

//          Student("Ruth", "Unoka", 20, "Ruth123")
            school.updateStudentList(Student(newApplicant.getName(), newApplicant.getName(), newApplicant.getAge(), id))
            val listOfStudent: MutableList<Student> = school.getStudentList()


            println(listOfStudent.toList().toString())
//
        } else {
            println(
                "Name: ${newApplicant.getName()}" +
                        "\nAge:${newApplicant.getAge()} \nExam Score: ${newApplicant.getExamScore()}.\nYou did not pass the requirements "
            )
        }
    }

    //expel student from student list
    fun expelStudent(student: Student) {
        school.getStudentList().remove(student)
        println("${student.firstName} has been Expelled ")
    }
}


