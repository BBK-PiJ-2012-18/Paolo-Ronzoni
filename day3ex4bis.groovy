int n = 0
int k = 0
String palindrome =""
String str
print "Please insert a string : "
String s = System.console().readLine()

int len = s.length()
for (int k = len; k > 0; k--) {

palindrome = palindrome + s.substring(k+1,k)

}

println palindrome