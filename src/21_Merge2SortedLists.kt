import kotlin.math.min

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }
}

class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val result: ListNode? = ListNode(0)

        var l1head = l1
        var l2head = l2

        var head = result

        while (l1head != null || l2head != null) {
            if (l1head == null) {
                head?.next = l2head
                break
            }
            if (l2head == null) {
                head?.next = l1head
                break
            }

            if (l1head.`val` <= l2head.`val`) {
                head?.next = l1head
                l1head = l1head.next
            }else{
                head?.next = l2head
                l2head = l2head.next
            }
            head = head?.next
        }

        return result?.next
    }
}
fun main(){
    val ln = ListNode(1)
    ln.next = ListNode(2)
    ln.next = ListNode(5)
    
    val ln2 = ListNode(1)
    ln2.next = ListNode(3)
    ln2.next = ListNode(7)

    val solution = Solution()
    var tmp = solution.mergeTwoLists(ln, ln2)

    while (tmp != null){
        print(tmp.`val`)
        tmp = tmp.next
    }
}