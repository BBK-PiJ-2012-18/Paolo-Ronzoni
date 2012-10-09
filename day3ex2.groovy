Double num1, num2
int counter = 0

print "Insert the string with the complet operation: "
String s = System.console().readLine()
while ( 
s.substring(counter, counter+1) == "1" || 
s.substring(counter, counter+1) == "2" ||
s.substring(counter, counter+1) == "3" ||
s.substring(counter, counter+1) == "4" ||
s.substring(counter, counter+1) == "5" || 
s.substring(counter, counter+1) == "6" ||
s.substring(counter, counter+1) == "7" ||
s.substring(counter, counter+1) == "8" ||
s.substring(counter, counter+1) == "9" || 
s.substring(counter, counter+1) == "0" ||
s.substring(counter, counter+1) == ".")
 
{
counter = counter + 1
}
String str1 = s.substring(0,counter)
num1 = Double.parseDouble(str1)
println  num1
String str2 = s.substring(counter+1)
num2 = Double.parseDouble(str2)

String  operator  = s.substring(counter, counter+1)

if (operator == "+") {
println "Sum result: " num1 + num2
} else if (operator == "*") {
println "Sum result: " + num1 * num2}
else if (operator == "-") {
println "Sum result: " +  num1 - num2}
else if (operator == "/") {
println "Sum result: " + num1 / num2}