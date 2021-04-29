open class Staff{

    //declare private variables to be used later
    private lateinit var name: String
    private lateinit var id: String
    private lateinit var role:Role

    // get staff name
    fun getName(): String{

        return this.name
    }
    //set staff name
    fun setName(name:String){

        this.name = name
    }

    //get staff id
    fun getId():String{
        return this.id
    }
    //set staff id
    fun setId(id:String){
        this.id =id
    }

    //get staff role of type role
    fun getRole():Role{
        return this.role
    }

    //set staff role of type role
    fun setRole(role:Role){
        this.role = role
    }


}