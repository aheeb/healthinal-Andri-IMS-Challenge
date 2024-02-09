fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        printInBox(args)
    }
}

fun printInBox(words: Array<String>) {
    val maxWordLength = words.maxOf { it.length }
    val boxWidth = maxWordLength + 4
    println("*".repeat(boxWidth))

    words.forEach { word ->
        println("* ${word.padEnd(maxWordLength)} *") 
    }

    println("*".repeat(boxWidth))
}
