String s
Double num1, num2, result
print "Insert the first number: "
s = System.console().readLine()
num1 = Double.parseDouble(s)
print "Insert the second number: "
s = System.console().readLine()
num2 = Double.parseDouble(s)
println " Insert 1 to addiction"
println " 2 to subtraction"
println " 3 to multiplication"
println " 4 to division"
s = System.console().readLine()
int operation = Integer.parseInt(s)

if (operation == 1) {
result = num1 + num2
println "the sum is: " + result
} 
else if (operation == 2) {
result = num1 - num2
println "the subtraction is: " + result
} 
else if (operation == 3) {
result = num1 * num2
println "the multiplication is: " + result
} 
else  {
result = num1 / num2
println "the division is: " + result
}