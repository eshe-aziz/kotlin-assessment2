import javax.sound.sampled.Line

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    calculation()
    println(words("madam"))
    println(volume(4/3, 3.14159, 14))
    sentence()
    sentence()
}

//Write and invoke one function that takes in an array of integers and returns these 3 values: sum, count and average of all the elements.
fun calculation(){
    var numbers = arrayOf(24, 32, 76, 67)
    println(numbers.sum())
    println(numbers.count())
    println(numbers.count()/numbers.size)
}


//A palindrome is a string that reads the same forwards and backwards e.g madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the word is a palindrome.
fun words(word: String): Boolean {
    var word = true
    return word
}

//The volume of a sphere is calculated using the formula below V = 4/3 π r3
//Write and invoke a function that is capable of accurately calculating the volume of any sphere given its radius. Use 3.14159 as π
fun volume(v: Int, pi: Double, radius: Int): Double{
    var result = v*pi*radius
    return result
}

//Write and invoke a function that given the string
// “Barnie bakes brown bagels and buns” prints out a list of all the other words and characters
// making up the string excluding all possible occurrences of the letter b.
fun sentence(){
    var line = arrayOf("Barnie", "bakes", "brown","bagels", "and", "buns")
    line = line.sortedArray()

    for (b in line){
        println(b)
    }
}



