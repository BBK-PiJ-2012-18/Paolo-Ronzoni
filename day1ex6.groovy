int num1, num2, remainder, k =0, sum = 0
String str
print "Please insert the first number: "
str = System.console().readLine()
num1 = Integer.parseInt(str)
print "Please insert the second number: "
str = System.console().readLine()
num2 = Integer.parseInt(str)


while ( sum <= num1 ) {
     
     sum = sum + num2
   k = k + 1
    }
remainder = (num1 - (sum-num2))
println num1 + " divided by " + num2 + " is " + (k-1) +  ", remainder " +
remainder
println "sum: " + sum
println "k: " + k
