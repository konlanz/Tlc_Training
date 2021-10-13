var funds : Double = 100.0
fun deposit(amount : Double){
    funds = funds + amount
}
fun main() {
    var input : String
    var cmd : List<String>
    //val pswd = "password"
 
    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        println(cmd[0])
        var db : Double = cmd[1].toDouble()
        println(db);
        when (cmd[0]) {
            // Each command goes here...balance
            "balance" -> balance()
            "deposit" -> deposit(db)
            else -> println("Invalid command")
        }
    }
}

fun balance():Unit{
    println("The available balance is $funds")
}

