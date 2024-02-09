fun main(args: String) {
    printInBox(args)
}

fun printInBox(sentence: String) { 
    val words = sentence.split(" ")
    val maxWordLength = words.maxOf { it.length }
    val boxWidth = maxWordLength + 4
    println("*".repeat(boxWidth))

    words.forEach { word ->
        println("* ${word.padEnd(maxWordLength)} *")
    }

    println("*".repeat(boxWidth))
}

