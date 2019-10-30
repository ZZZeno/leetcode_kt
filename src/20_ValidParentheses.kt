import java.util.*
import kotlin.collections.HashMap

fun isValid(s: String): Boolean {
    val map = HashMap<String, String>()
    map["("] = ")"
    map["["] = "]"
    map["{"] = "}"


    if (s.length % 2 == 1) {
        return false
    }

    val stack = Stack<String>()
    var index = 0
    while (index < s.length) {
        if (map.containsKey(s[index].toString())) {
            stack.push(s[index].toString())
        }else{
            if (stack.size == 0){
                return false
            }
            if (map[stack.pop()] != s[index].toString()){
                println(index)
                return false
            }
        }
        index ++
    }
    if (stack.size > 0){
        return false
    }
    return true
}

fun match(stack: Stack<String>, s: String) {

}

fun main(){
    println(isValid("()[]{}"))
}