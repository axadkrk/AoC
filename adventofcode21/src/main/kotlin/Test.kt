import java.io.File
import java.sql.Timestamp
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun mapCSV(fileName: String): MutableMap<Long, Double> {
    val map = mutableMapOf<Long, Double>()

    val formatter = DateTimeFormatter.ofPattern(" dd MMM yyyy HH:mm", Locale.GERMAN)
    val formatter2 = DateTimeFormatter.ofPattern(" d MMM yyyy HH:mm", Locale.GERMAN)
    var dateStr = ""
    File(fileName).forEachLine { line ->
        val split = line.split(",")
        if (split.size == 2) {
            dateStr = split[0].replace("\"", "")
        } else if (split.size > 2) {
            if (dateStr != "") {
                val timeStr = split[0].replace("\"", "")

                val weight = split[1].replace(" kg", "").toDouble()

                if (dateStr.length == 12) {
                    val parse = LocalDateTime.parse("$dateStr $timeStr", formatter)
                    val time = Timestamp.valueOf(parse).time

                    map[time] = weight
                } else {
                    val parse = LocalDateTime.parse("$dateStr $timeStr", formatter2)
                    val time = Timestamp.valueOf(parse).time

                    map[time] = weight
                }
            }
        }
    }
    return map
}


fun main() {
    val mapCSV = mapCSV("C:/Users/kroe/Downloads/Gewicht.csv")
    println()
}