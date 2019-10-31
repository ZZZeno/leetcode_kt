fun nextPermutation(nums: IntArray): Unit {
    if (nums.size <= 1) return
    var index = -1
    for (i in (nums.size-1).downTo(1)) {
        if (nums[i] > nums[i-1]){
            index = i-1
            break
        }
    }
    if (index == -1) {
        nums.sort()
        return
    }
    var larger = index+1
    val temp = nums[index]
    for (i in (nums.size - 1).downTo(index)) {
        if (nums[i] > nums[index]) {
            larger = i
            break
        }
    }
    nums[index] = nums[larger]
    nums[larger] = temp

    for (i in (nums.size - 1).downTo((nums.size+index)/2+1)) {
        val temp2 = nums[i]
        nums[i] = nums[nums.size+index-i]
        nums[nums.size+index-i] = temp2
    }

}

fun main(){
//    val nums = intArrayOf(7, 6, 5, 4, 2, 4, 3, 2, 1)
    val nums = intArrayOf(3, 2, 1)
    nextPermutation(nums)
}
