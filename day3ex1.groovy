String s, operator
Double num1, num2, result
print "Insert the first number: "
s = System.console().readLine()
num1 = Double.parseDouble(s)
print "Insert the second number: "
s = System.console().readLine()
num2 = Double.parseDouble(s)
println " Insert a symbol +, -, * or / to perform the operation between numbers"
s = System.console().readLine()
operator = s
if (operator == "+") {
println "the sum is: " + (num1 + num2)
} 
else if (operator == "-") {
println "the subtraction is: " + (num1 - num2)
} 
else if (operator == "*") {
println "the multiplication is: " + (num1 * num2)
} 
else  {
println "the division is: " + (num1 / num2)
}