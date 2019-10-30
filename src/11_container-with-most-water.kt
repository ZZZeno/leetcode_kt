import kotlin.math.max
import kotlin.math.min

fun maxArea(height: IntArray): Int {
    if (height.size <= 1) return 0
    if (height.size == 2) return min(height[0], height[1])
    var max = min(height[0], height[1])
    for (i in 0..height.size-2){
        for (j in i+1..height.size-1){
            if (max < min(height[i], height[j]) * (j-i)){
                max = min(height[i], height[j]) * (j-i)
            }
        }
    }
    return max
}

fun maxArea2(height: IntArray): Int{
    if (height.size <= 1) return 0
    if (height.size == 2) return min(height[0], height[1])
    var left = 0
    var right = height.size-1
    var maxarea = min(height[left], height[right]) * (right-left)
    while (left <= right) {
        maxarea = max(maxarea, min(height[left], height[right]) * (right-left))
        if (height[left] < height[right]) left ++
        else if (height[left] > height[right]) right --
        else {
            right --
            left ++
        }
    }
    return maxarea
}
fun main(){
    val height = intArrayOf(1,8,6,2,5,4,8,3,7)
    println(maxArea2(height))
}