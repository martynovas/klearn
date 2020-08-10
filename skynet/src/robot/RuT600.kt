import robot.Mission

class RuT600(override val mission: Mission):T600(mission){
    override fun processMission() {
        println("I'am from Russia!")
    }
}
