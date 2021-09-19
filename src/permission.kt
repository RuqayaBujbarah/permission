fun main(){
    val age = 19
    var check = 1
    while (check!=0){
        try{
            print("Enter your age: ")
            if(readLine()!!.toInt()>=age){
                println("Welcome!")
            }
            else{
                println("You are not old enough...")
            }
            check = 0
        }
        catch (e: Exception){
            println("Please enter a number!")
        }}
}