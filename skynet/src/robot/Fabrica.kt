import robot.Mission

interface Factory{
    fun makeRobot(robotType: RobotType, mission: Mission): Terminator
}

object RuFactory : Factory {

    override fun makeRobot(robotType: RobotType, mission: Mission): Terminator {
        return when (robotType) {
            RobotType.T_600 -> RuT600(mission)
            RobotType.T_800 -> T800(mission)
        }
    }
}

object UsaFactory : Factory {

    override fun makeRobot(robotType: RobotType, mission: Mission): Terminator {
        return when (robotType) {
            RobotType.T_600 -> USAT600(mission)
            RobotType.T_800 -> T800(mission)
        }
    }
}

enum class RobotType {
    T_600, T_800;
}

