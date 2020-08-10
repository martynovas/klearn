import robot.Mission

open class T600 (open val mission : Mission): Terminator {
    override fun processMission() {
        mission.doMission()
    }

override fun sleep() {
        println("T-600 sleep")
    }

    override fun awake() {
        println("T-600 awake")
    }
}
