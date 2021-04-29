import kotlin.math.floor

class Applicant(firstName:String, lastName:String, age:Int){


     private var applicantName:String
     private  var age : Int = 0
    // math function to generate a random value for exam score
    private var examScore:Int = ((Math.random())*100).toInt()

    // initializing variables for applicants name and age
     init{
         this.applicantName = "$firstName $lastName"
         this.age  = age
     }

    // functions to get or set details of applicant
     fun getName():String{
         return this.applicantName
     }
    fun setName(name:String){
        this.applicantName = name
    }
    fun getAge():Int{
        return this.age
    }
     fun setAge(age:Int){
         this.age = age
     }

    fun getExamScore():Int{
        return this.examScore
    }

 }