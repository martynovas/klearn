fun main() {

    val flySwimDuck = Duck(
        1,
        object : FlyAble {
            override fun fly() {
                println("i'm fly )))")
            }

        },
        object : SwimAble {
            override fun swim() {
                println("i'm swim )))")
            }

        },
        QwaNoWayImpl()
    )

    flySwimDuck.fly()
    flySwimDuck.qwa()
}

interface FlyBehaviour {
    fun fly()
}

interface FlyNoWay : FlyBehaviour {
}

interface FlyAble : FlyBehaviour {
}


interface SwimBehaviour {
    fun swim()
}

interface SwimNoWay : SwimBehaviour {

}

interface SwimAble : SwimBehaviour {

}

interface QwaBehaviour {
    fun qwa()
}

interface QwaNoWay : QwaBehaviour {

}

interface QwaAble : QwaBehaviour {

}


class FlyNoWayImpl : FlyNoWay {
    override fun fly() {

    }
}

class SwimNoWayImpl : SwimNoWay {
    override fun swim() {

    }
}

class QwaNoWayImpl : QwaNoWay {
    override fun qwa() {

    }
}

open class Duck(
    val version: Int,
    val flyBehaviour: FlyBehaviour,
    val swimBehaviour: SwimBehaviour,
    val qwaBehaviour: QwaBehaviour
) {
    fun show() {
        println("Version duck $version")
    }

    fun swim() {
        swimBehaviour.swim()
    }

    fun qwa() {
        qwaBehaviour.qwa()
    }

    fun fly() {
        flyBehaviour.fly()
    }
}
