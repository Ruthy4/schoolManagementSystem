open class School() {

    //create mutableLists  to store students and teachersInSchool to be used later
    private var studentsInSchool: MutableList<Student> = mutableListOf()
    private var teachersInSchool: MutableList<Teacher> = mutableListOf()


    //get list of students from the mutable list
    fun getStudentList(): MutableList<Student> {
        return this.studentsInSchool
    }

    fun updateStudentList(students: MutableList<Student>) {
        this.studentsInSchool = students
    }

    fun updateStudentList(student: Student) {
        this.studentsInSchool.add(student)
    }

    //get list of Teachers from the mutable list
    fun getTeacherList(): MutableList<Teacher> {
        return this.teachersInSchool
    }
}