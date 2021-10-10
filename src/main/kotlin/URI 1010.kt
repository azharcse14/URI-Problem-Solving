fun main() {
    var codeOfProduct1 = readLine()?.toInt()
    var unitsOfProduct1 = readLine()?.toInt()
    var priceForOneUnitOfProduct1 = readLine()?.toDouble()

    var firstProduct = unitsOfProduct1!! * priceForOneUnitOfProduct1!!

    var codeOfProduct2 = readLine()?.toInt()
    var unitsOfProduct2 = readLine()?.toInt()
    var priceForOneUnitOfProduct = readLine()?.toDouble()

    var secondProduct = unitsOfProduct2!! * priceForOneUnitOfProduct!!


    var result = "%.2f".format( firstProduct + secondProduct )

    println("VALOR A PAGAR: R$ $result")



}