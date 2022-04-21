//
fun foo() {
    try {
        if (true) {
        }
        throw MyException()
    } finally {
        return // prevents MyException from being propagated
    }
}
