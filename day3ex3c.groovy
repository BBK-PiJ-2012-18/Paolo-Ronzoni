int n = 0
int k = 0
String str
print "Please insert a string : "
String s = System.console().readLine()
int len = s.length()

while ( n+1 < len) {

while (s.substring(n, n+1) !=" ") { 
n = n + 1
}
str = s.substring(k, n+1)
println str





}