int n= 0
String str
print "Please insert a string : "
String s = System.console().readLine()
int len = s.length()
while (n < len) { 
str = s.substring(n, n+1) 
println str 
n = n + 1
}