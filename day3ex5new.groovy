String s, short_str, long_str
int n = 0
int short_str_lenght, long_str_length
print "Insert a short string "
s = System.console().readLine()
short_str = s
short_str_lenght = s.length()
println "and then insert a long one "
s= System.console().readLine()
long_str = s 
long_str_lenght = s.length()
int counter = long_str_lenght - short_str_lenght

     for (int k = 0; k<=counter; k++) {
     String ver = long_str.substring(k,k+ short_str_lenght)
          if (ver == short_str) {
           n = n + 1}
     }

println "The short appears in the long string " + n +" times"


