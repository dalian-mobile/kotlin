class Outer {
    val a = 1
    inner class Inner1 {
        val a = 2
        inner class Inner2 {
            val a = 3
            val Outer.foo: Int
                get() {
                    val a = 4
                    return this@Inner2.a + this@Inner1.a + this@Outer.a + this@foo.a + a
                }
        }
    }
}

fun box(): String {
    with(Outer().Inner1().Inner2()) {
        return if (Outer().foo == 11) "OK"
        else "FAIL"
    }
}