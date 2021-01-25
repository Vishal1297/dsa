// Stack Implementaion Using Kotlin
class Stack {

    private var size = 5
    private var stack = Array<Any>(size) {}
    private var stackSize = 0

    fun setSize(size: Int) {
        this.size = size
    }

    fun push(element: Any) {
        if (isFull()) println("Stack Overflow while adding $element")
        else stack[stackSize++] = element
    }

    fun pop(): Any {
        if (isEmpty()) {
            println("Stack Underflow")
            return 0
        }
        val lastIndex = stack.size - 1
        val lastElement = stack[lastIndex]
        stack[lastIndex] = 0
        stackSize--
        return lastElement
    }

    fun peek(): Any {
        return if (isEmpty())
            "Stack is Empty"
        else
            stack[stackSize - 1]
    }

    fun search(element: Any): Int {
        for (index in 0 until stackSize) {
            if (stack[index] === element) return index
        }
        return -1
    }

    fun isFull(): Boolean = stackSize >= stack.size

    fun isEmpty(): Boolean = stackSize <= 0

    fun printStack() {
        for (index in 0 until stackSize) print("${stack[index]} ")
        println()
    }

}
