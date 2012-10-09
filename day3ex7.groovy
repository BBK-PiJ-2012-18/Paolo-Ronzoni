String palindrome =""
print "Please insert a string : "
String s = System.console().readLine()

int len = s.length()

for (int k = len; k > 0; k--) {

   palindrome = palindrome + s.substring(k-1,k)

}

if (s == palindrome) {

println "yes the text is a strict palindrome"
} else {
println "No the text is not a strict palindrome"
}