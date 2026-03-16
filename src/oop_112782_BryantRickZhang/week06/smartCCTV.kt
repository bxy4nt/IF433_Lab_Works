package oop_112782_BryantRickZhang.week06

class smartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name menyala")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan")
    }

    override fun startRecord() {
        println("$name mulai merekam")
    }
}