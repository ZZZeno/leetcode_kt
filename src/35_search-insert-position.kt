fun searchInsert(nums: IntArray, target: Int): Int {
    for (i in 0..nums.size-1) {
        if (target <= nums[i]){
            return i
        }
    }
    return nums.size
}