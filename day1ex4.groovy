int n = 2 
boolean  condition = true
print " insert a number grater than 1: "
String str = System.console().readLine()
int i = Integer.parseInt(str)

while (condition) {
if (i%n == 0 ) {
condition = false
} else {
n = n + 1 }
}

if (n==i) {
println i + " is a prime number"}
else {
println i +" is not a prime  number evviva"}