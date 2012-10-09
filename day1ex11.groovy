int n = 2 
boolean condition = true

for (int k = 2; k <= 1000; k++) {
while (condition) {
if (k %n == 0 ) {
condition = false
} else {
n = n + 1 }
}

if (n==k) {
print k + " "}
else {
n = 2
condition = true}

}