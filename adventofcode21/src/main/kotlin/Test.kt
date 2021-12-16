import java.io.File
import java.math.BigDecimal
import java.math.RoundingMode
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun mapCSV(fileName: String): MutableMap<String, Double> {
    val map = mutableMapOf<String, Double>()

    val formatter = DateTimeFormatter.ofPattern(" dd MMM yyyy HH:mm", Locale.GERMAN)
    val formatter2 = DateTimeFormatter.ofPattern(" d MMM yyyy HH:mm", Locale.GERMAN)
    var dateStr = ""
    File(fileName).forEachLine { line ->
        val split = line.split(",")
        if (split.size == 2) {
            dateStr = split[0].replace("\"", "").replace("Mrz", "Mär")
        } else if (split.size > 2) {
            if (dateStr != "") {
                val timeStr = split[0].replace("\"", "")
                val weight = split[1].replace(" kg", "").toDouble()

                if (dateStr.length == 12) {
                    val dateTime = LocalDateTime.parse("$dateStr $timeStr", formatter)
                    val toString = dateTime.toString().split("T")[0]
                    map[toString] = weight
                } else {
                    val dateTime = LocalDateTime.parse("$dateStr $timeStr", formatter2)
                    val toString = dateTime.toString().split("T")[0]
                    map[toString] = weight
                }
            }
        }
    }
    return map
}


fun main() {
    val startWeight = 102
    val goalWeight = 90


    val startDate = LocalDate.parse("2021-09-01", DateTimeFormatter.ISO_DATE)
    val endDate = LocalDate.parse("2022-06-30", DateTimeFormatter.ISO_DATE)

    val days = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays()
    val total = (startWeight - goalWeight) / days.toDouble()

    val mapCSV = mapCSV("C:/Users/kroe/Downloads/Gewicht.csv")

    for (day in 0..days) {
        val plusDays = startDate.plusDays(day)
        val weight = startWeight - (day * total)
        val round = BigDecimal(weight).setScale(2, RoundingMode.HALF_EVEN)

        if (mapCSV[plusDays.toString().split("T")[0]] != null) {
            val real = mapCSV[plusDays.toString().split("T")[0]]
            println("$plusDays;$round;$real")
        } else
            println("$plusDays;$round;")
    }


    val list = mapCSV.toList().sortedBy { entry -> entry.first }


//    list.forEach { entry ->
//        val dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(entry.first), TimeZone.getDefault().toZoneId())
////        println( dateTime.format(formatter))
//        println(entry.second)
//    }

    println()
}