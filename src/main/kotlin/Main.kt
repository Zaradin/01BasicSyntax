fun main(args: Array<String>) {
    println("Working with Variables and Types")

    val doubleNumber = 1200.45
    val floatNumber = 700.78f
    val longNumber = 98765432L
    val intNumber = 123456
    val shortNumber = 345
    val byteNumber = 127

    println("doubleNumber value is: " + doubleNumber + ", and the type is: " + doubleNumber.javaClass)
    println("floatNumber value is:  " + floatNumber + ", and the type is: " + floatNumber.javaClass)
    println("longNumber value is:   " + longNumber + ", and the type is: " + longNumber.javaClass)
    println("intNumber value is:    " + intNumber + ", and the type is: " + intNumber.javaClass)
    println("shortNumber value is:  " + shortNumber + ", and the type is: " + shortNumber.javaClass)
    println("byteNumber value is:   " + byteNumber + ", and the type is: " + byteNumber.javaClass)

    println("\nUsing underscores to make values more readable:")
    val oneMillion = 1_000_000
    val threeThousand = 3_000
    val creditCardNumber = 1234_4321_5678_8765

    println("\t" + oneMillion + " - the type is: " + oneMillion.javaClass)
    println("\t" + threeThousand + " - the type is: " + threeThousand.javaClass)
    println("\t" + creditCardNumber + " - the type is: " + creditCardNumber.javaClass)

    val byteNum: Byte = 10              //static type check: OK
    val intNum: Int = byteNum.toInt()   //explicit conversion: OK
    val floatNum: Float = byteNum.toFloat()
    val doubleNum: Double = intNum.toDouble()

    println("\nExplicit Conversions:")
    println("\t" + byteNum + " - the type is: " + byteNum.javaClass)
    println("\t" + intNum + " - the type is: " + intNum.javaClass)
    println("\t" + floatNum + " - the type is: " + floatNum.javaClass)
    println("\t" + doubleNum + " - the type is: " + doubleNum.javaClass)

    //characters in kotlin
    val aChar = 'a'            //type inference
    val bChar: Char = 'b'   //explicitly defining the type

    println("\nCharacter Types:")
    println("\taChar: " + aChar + " - the type is: " + aChar.javaClass)
    println("\tbChar: " + bChar + " - the type is: " + bChar.javaClass)

    //booleans in kotlin
    val aFlag = true
    val bFlag: Boolean = false

    println("\nBoolean Types:")
    println("\taFlag: " + aFlag + " - the type is: " + aFlag.javaClass)
    println("\tbFlag: " + bFlag + " - the type is: " + bFlag.javaClass)

    //mutable variable
    var number = 5   //Int type is inferred
    number++;       //mathematical operations are allowed
    println("\nMutable number: " + number)
    number = 3;       //Allowed to reassign a var too
    println("Mutable number (updated): " + number)


    explicitConversions(25)

    mutableVariables(10,20)

}

fun explicitConversions(inputByte: Byte){
    println ("\n==========================================================")
    println ("=================  Explicit Conversions ==================")
    println ("==========================================================")

    val byteNum: Byte = inputByte       //static type check: OK
    val intNum: Int = byteNum.toInt()   //explicit conversion: OK
    val floatNum: Float = byteNum.toFloat()
    val doubleNum: Double = intNum.toDouble()

    println("byteNum: "   + byteNum)
    println("intNum: "    + intNum)
    println("floatNum: "  + floatNum)
    println("doubleNum: " + doubleNum)
}

fun mutableVariables(input: Int, updatedNumber: Int){
    println ("\n==========================================================")
    println ("===========  Working with Mutable Variables =============")
    println ("==========================================================")

    //mutable variables
    var number = input   //Int type is inferred

    number++;       //mathematical operations are allowed
    println("Mutable number: " + number)

    number = updatedNumber;       //Allowed to reassign a var too
    println("Mutable number (updated): " + number)
}