import robot.Mission

class USAT600(override val mission: Mission):T600(mission){
    override fun processMission() {
        println("I'am from USA!")
    }
}
