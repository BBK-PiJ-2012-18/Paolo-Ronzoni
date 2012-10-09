int n = 0
int k = 0
String str
print "Please insert a string : "
String s = System.console().readLine()
int len = s.length()

for (n=0; n < len; n++) {

if (s.substring(n, n+1) =="e") { 
k = k + 1
}

}

println "There are " + k + " letter 'e' in the string"