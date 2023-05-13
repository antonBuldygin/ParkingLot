open class Tea(val cost: Int, val volume: Int) {
    override fun toString(): String {
        return "cost=$cost, volume=$volume"
    }
}

class BlackTea(cost: Int, volume: Int):Tea(cost,  volume){

    override fun toString(): String {
        return "BlackTea{cost=$cost, volume=$volume}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        return javaClass == other?.javaClass
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}