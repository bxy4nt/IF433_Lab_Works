package oop_112782_BryantRickZhang.week11

fun String.addGreeting(): String {
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    // 'this' merujuk pada objek String? yang bisa bernilai null
    return this == null || this.isEmpty()
}