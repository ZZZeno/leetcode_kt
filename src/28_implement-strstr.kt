fun strStr(haystack: String, needle: String): Int {
    if (needle == "") return 0
    var head = 0
    if (haystack.length < needle.length) return -1
    while (head + needle.length <= haystack.length) {
        if (haystack.substring(head, head + needle.length) == needle) {
            return head
        }
        head ++
    }
    return -1
}

fun main() {

}