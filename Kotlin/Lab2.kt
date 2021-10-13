var funds : Double = 100.0
val pswd = "password"
fun main() {
    var input : String
    var cmd : List<String>
    
 
    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        

        when (cmd[0]) {
            // Each command goes here...balanceba
            "balance" -> balance()
            "deposit" -> deposit(cmd[1].toDouble())
            "withdraw" -> withdraw(cmd[1].toDouble())
            else -> println("Invalid command")
        }
    }
}

fun balance():Unit{
    println("The available balance is $funds")
}

fun deposit(amount : Double){
    funds += amount
}
fun withdraw(amount : Double){
    println("Please input your password to withdraw")
    var inputx  = readLine()!!
    if(pswd == inputx){
        if( amount> funds){
            println("You have insuficent balance $funds")
        }else{
            funds -= amount
            println("You have withdram $funds from your account")
        }
        

    }else{
        println("Invalid password")
    }
}
