import javax.sound.sampled.Line

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(calculation(arrayOf(98, 77, 38, 46, 54)).contentToString())
    println(isPalindrome("madam"))
//    myString("Barnie bakes brown bagels and buns")
    println(calculate(arrayOf(2,3,4)).contentToString())
    removeCharacter("Barnie bakes brown bagels and buns")
    isPalindromee("kayak")
    println(lastWordLength("Heavy rainfall expected "))
    multiples(53)
}

//Write and invoke one function that takes in an array of integers and returns these 3 values: sum, count and average of all the elements.
fun calculation(num: Array<Int>): Array<Any>{
    return arrayOf(num.sum(), num.count(), num.average())
}


//A palindrome is a string that reads the same forwards and backwards e.g madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the word is a palindrome.
fun isPalindrome(word: String): Boolean{
    val reversedWord = word.lowercase().reversed()
        if (word == reversedWord) {
        return true
    } else {
        return false
    }
}

//Efficient and preferred formula:
fun isPalindromee(str: String): Boolean {
    var start = 0
    var end = str.length - 1 //last index
    while (start < end) {
        if (str[start] != str[end]) {
            return false
        }
        start++
        end--
    }
    return true
}


//The volume of a sphere is calculated using the formula below V = 4/3 π r3
//Write and invoke a function that is capable of accurately calculating the volume of any sphere given its radius. Use 3.14159 as π

///The correct way: Use 4.0/3 to get the correct answer
fun vol(r: Double){
    val pi = 3.1469
    val area = 4.0/3 * pi * r * r * r
    println(area)
}

//Write and invoke a function that given the string
// “Barnie bakes brown bagels and buns” prints out a list of all the other words and characters
// making up the string excluding all possible occurrences of the letter b.



//fun myString(sentence: String){
//    println(sentence.replace("b", ""))
//}

fun calculate(values: Array<Int>): Array<Any>{
    return arrayOf(values.sum(), values.average(), values.count())
}

//Number One Correction
fun words(){
    val stmt = "Barnie bakes brown bagels and buns"
    val res = stmt.lowercase().split("b")
    println(res)
}

fun removeCharacter(word: String){
    println(word.lowercase().split('b'))
}

//Write a function that takes in a sentence comprised of different words and spaces then returns the length of the last word.

//fun characters(sentence: String): Int{
//    var newWord = sentence.split(" ")
//    var a = newWord.last()
//}


fun lastWordLength(sentence: String): Int{
    var len = 0
    var idx = sentence.trim().lastIndex
    while(idx >= 0){
        if (sentence[idx]!=' '){
            len++
        } else {
            break
        }
        idx--
    }
    return len
}


//Write a function that prints out the multiples of 8 and 6 between 1 and 1000. For multiple of both 8 and 6 it should print out "bingo".

fun multiples(num: Int){
    for (number in 1..1000)
        if(num % 8 == 0 && num % 6 == 0){
            println("Bingo")
    } else{
        println("Fail")
        }
}
