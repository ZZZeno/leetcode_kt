fun removeDuplicates(nums: IntArray): Int {
    if (nums.size <= 1) return nums.size
    var head = 0
    var result = 1
    var cur = 1
    while (head <= nums.size-2) {
        if (nums[head] == nums[head+1]) {
            head ++
        }else{
            nums[cur] = nums[head+1]
            cur ++
            result ++
            head ++
        }
    }
    return result
}

fun main(){
    val nums = IntArray(3)
    nums.set(0, 1)
    nums.set(1, 1)
    nums.set(2, 2)
//    nums.set(3, 3)
//    nums.set(4, 5)
    println(removeDuplicates(nums))
}
