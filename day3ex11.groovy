

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


Double hdist = firstx - secondx
Double vdist = firsty - secondy
Double area = hdist * vdist



println "the area of the rectangle is: " + area