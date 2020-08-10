import robot.KillHumanMission
import robot.SpyMission

//import robot.RobotFabrica.*

fun main() {
    val robot1T600 = RuFactory.makeRobot(RobotType.T_600, SpyMission())
    val robot2T600 = RuFactory.makeRobot(RobotType.T_600, SpyMission())
    val robot3T800 = UsaFactory.makeRobot(RobotType.T_800, KillHumanMission())
    val robot4T800 = UsaFactory.makeRobot(RobotType.T_800, KillHumanMission())
    robot4T800.awake()
    robot4T800.processMission()
}
