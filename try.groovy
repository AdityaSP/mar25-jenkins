// save this file anywhere
// groovy <filename>
println "Hello World!"

def x = 100

println x
// String interpolation
println "The value of x is $x"

// change of data type
x = "Hello"
println "The value of x is $x"

(1..5).each { println it }

//array/list

def os = ["Android", "Windows", "Linux"]
os.each { println "I can work with $it"}
os.add("Unix")
println "---------------------------------"
os.each { println "I can work with $it"}

println os.contains("Linux")
