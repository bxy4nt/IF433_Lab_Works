package oop_112782_BryantRickZhang.week06

class Button (
    override val name : String
) : Clickable {

    override fun click() {
        println("$name button clicked")
    }
}