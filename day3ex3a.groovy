
String str
print "Please insert a string : "
String s = System.console().readLine()
int len = s.length()
for (int n=0; n < len; n++) { 
str = s.substring(n, n+1) 
println str 

}