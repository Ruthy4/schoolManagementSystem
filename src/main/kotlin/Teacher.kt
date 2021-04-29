class Teacher//create a secondary constructor to take in the teachers parameters
    (name: String, id: String, role: Role) : Staff() {

    //declare a mutable list of courses to be taught by the teacher
    private var coursesTaughtByTeacher:MutableList<Course> = mutableListOf()

    init {
        this.setName(name)
        this.setId(id)
        this.setRole(role)
    }
    //function to return teachers detals and course to be taught
    fun teachCourse(course:Course){

        println("Hello class my name is ${this.getName()} and i am your ${course.getCourseName()} ${this.getRole()}")

    }


    fun addCourse(course:Course){

        coursesTaughtByTeacher.add(course) //add course to list of courses taught by a teacher
    }
}