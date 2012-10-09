String s
String letnum = ""
print "Insert a number with commas and decimals dot "
s = System.console().readLine()
int  str = s.length()
	for (int  k = 0; k < str; k++) {
	   if (s.charAt(k) == "," || s.charAt(k) == ".") {
	      }
	    else { letnum = letnum + s.charAt(k)}
	 }
	 
int i = Integer.parseInt(letnum)

println (i/2)

