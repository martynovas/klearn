package robot

interface Mission {
    fun doMission()
}

class SpyMission : Mission {
    override fun doMission() {
        println("spy")
    }
}


class KillHumanMission : Mission {
    override fun doMission() {
        println("kill human mission")
    }
}
