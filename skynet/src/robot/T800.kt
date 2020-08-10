import robot.Mission

class T800(val mission : Mission) : Terminator {
    override fun processMission() {
        mission.doMission()
    }

    override fun sleep() {
        println("T-800 sleep")
    }

    override fun awake() {
        println("T-800 awake")
    }
}
