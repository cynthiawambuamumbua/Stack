fun main(){
//    val myStack=Stack()
//    println(myStack.pop())
//    println(myStack.isEmpty())
//    println(myStack.peek())
//    myStack.push(45)
//    myStack.push(12)
//    println( myStack.peek())
//    myStack.push(3)
//    myStack.push(7)
//    myStack.pop()
//    println(myStack.peek())
//    var x=myStack.pop()
//    var y=myStack.pop()
//    var z= x?.plus(y!!)
//    var g=x!!+y!!
//    println(g)
    println(reverseWithStack("hello"))

//    var name=reverse("hello")
//    name
//    println(reverseString("hello"))
}
class  Stack{
    var data= mutableListOf<Char>()
    fun push(value: Char){
        data.add(value)
    }
    fun pop():Char?{
        if (data.isEmpty()){
            return null
        }
        var top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top

    }
    fun  peek():Char?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}
fun reverseWithStack(str: String):String{
    val stack=Stack()
    for (character in str){
        stack.push(character)
    }
    val result= mutableListOf<Char>()
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    return result.joinToString("")
}
//fun reverse(name: String){
//    println(name.reversed())
//}
//fun reverseString(str:String):String{
//    var result= mutableListOf<Char>()
//    for (i in str.lastIndex downTo 0){
//        result.add(str[i])
//    }
//    return  result.joinToString("")
//}