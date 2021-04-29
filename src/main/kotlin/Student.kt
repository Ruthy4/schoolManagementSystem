class Student(val firstName: String, val lastName: String, age: Int, val id: String) {

    override fun toString(): String {
        return firstName
    }
    //fu

    //initialize a mutable list of type strings for studentCoursesToBeTaken
    var studentCoursesToBeTaken: MutableList<String>
        get() = mutableListOf<String>("Maths", "English", "Computer")//get an array of strings for the list
        set(value) = TODO()

    //function to take in the mutable list of courses to be taken and prints the list
    fun takeCourse(course: MutableList<String>) {
        println("Your courses are: $studentCoursesToBeTaken")
    }
//    fun callStudent() {
//       println("The students name is $name and matriculation number is $id and in $department department")
//   }

}
