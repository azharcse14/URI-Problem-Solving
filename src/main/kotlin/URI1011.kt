import java.util.*
import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val R = readLine()?.toDouble()

    val volume ="%.3f".format( (4.00/3) * PI * (R?.pow(3)!!))

    println("VOLUME = $volume")
}