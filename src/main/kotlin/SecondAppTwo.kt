const val PERCENT = 0.75
const val MIN = 3500.0
fun main() {
    print("Введите сумму перевода в копейках: ")
    val amount = readLine()?.toDouble()
    val commission = amount!! * PERCENT / 100.0
    if (commission >= MIN) println("Комиссия за перевод = ${commission.toUInt()} копеек")
    else println("Комиссия за перевод = 3500 копеек")
}


