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
        var z = calculateY(4, x, 2)
        if (z == y){
            println("Since both the  y = 3x + 5 == $y and y= 4x + 2 == $z are the same, they inter sect at $x  ")
        }
         
     }
     
     for(x in 0..100){
        intersection(3, 5, 4, 2, x )
        println("set 1")
        intersection(2, 1, 3, 3, x)
        println("set 2")
        intersection(-2, 3, 3, -2, x)
       println("set 3")
     }




}

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}
fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int, x: Int) : Unit {
    // This function takes the equations of two lines:
    var yOne = mOne * x + cOne 
    var yTwo = mTwo * x + cTwo
    if(yTwo == yOne){
        println("value they intersect at $x")
    }else{
        println("Don't intersect")
    }
}