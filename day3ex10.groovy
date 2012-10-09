

print "Insert the x of the first point: "
String s = System.console().readLine()
Double firstx = Double.parseDouble(s)
print "Insert the y of the first point: "
s = System.console().readLine()
Double firsty = Double.parseDouble(s)

print "Insert the x of the second point: "
 s = System.console().readLine()
Double secondx = Double.parseDouble(s)
print "Insert the y of the first point: "
 s = System.console().readLine()
Double secondy = Double.parseDouble(s)

print "Insert the x of the third point: "
 s = System.console().readLine()
Double thirdx = Double.parseDouble(s)
print "Insert the y of the first point: "
 s = System.console().readLine()
Double thirdy = Double.parseDouble(s)

Double dist12 = ((firstx - secondx)**2 + (firsty - secondy)**2)**(1/2)
Double dist23 = ((secondx - thirdx)**2 + (secondy - thirdy)**2)**(1/2)
Double dist13 = ((firstx - thirdx)**2 + (firstx - thirdx)**2)**(1/2)



println "the distance of three points is:" + (dist12 + dist23 + dist13)