class Course(var courseName:String, var courseTitle:String) {

//    //declare private variables
//   private var courseName:String
//   private var courseTitle:String
//
//   //initialize variables created
//    init{
//
//        this.courseName = courseName
//        this.courseTitle = courseTitle
//    }

    //get course name
   fun getCourseName():String{
       return this.courseName
   }
    //set course name
    fun setCourseName(courseName:String){
        this.courseName = courseName
    }

    //get course title
    fun getCourseTitle():String{

        return this.courseTitle
    }
    //set course title
    fun setCourseTitle(courseTitle:String){
        this.courseTitle = courseTitle
    }


}