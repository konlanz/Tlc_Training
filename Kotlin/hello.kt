fun main(){
    var hello : String = "Hello!"
    println("$hello world")
    for (x in -5..5){
       var y = calculateY(3, x, -1)
        println("y is ${y} when x is ${x}")
    }
    //y = 3x + 5
    for (x in 0..20){
        var y = calculateY(3, x, 5)
         println("y is ${y} when x is ${x}")
     }

     //y = 4x + 2
     for (x in 0..20){
        var y = calculateY(4, x, 2)
         println("y is ${y} when x is ${x}")
     }


}

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}
fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    // This function takes the equations of two lines:
    yOne = mOne * x + cOne 
    yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100
}