fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.size == 0) return 0
    if (nums.size == 1){
        if (nums[0] == `val`) return 0
        return 1
    }
    var cur = 0
    var count = 0
    while (cur < nums.size) {
        if (nums[cur] == `val`){
            count += 1
        }else{
            nums[cur-count] = nums[cur]
        }
        cur ++

    }
    return nums.size - count
}

fun main(){
    val nums: IntArray = IntArray(4)
    nums[0] = 3
    nums[1] = 2
    nums[2] = 2
    nums[3] = 3
    println(removeElement(nums, 3))
    println(nums)
}