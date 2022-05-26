// 1. Create a list called "list" with the elements "red", "white",
"black"

var list =List("red","white","black")
 
// 2. Add 5 more items to "list" "green" ,"yellow", "blue",
"orange", "pearl"
 
list = "green" ::"yellow" ::"blue" ::"orange" ::"pearl" :: list
 
// 3. Fetch the elements of "list" "green", "yellow", "blue"
 
slice list (0,3)
var list =List("red","white","black")
 
// 2. Add 5 more items to "list" "green" ,"yellow", "blue",
"orange", "pearl"
 
list = "green" ::"yellow" ::"blue" ::"orange" ::"pearl" :: list
 
// 3. Fetch the elements of "list" "green", "yellow", "blue"
 
slice list (0,3)

 Create an array of numbers in the range 1-1000 in steps of 5 at a time
 
Array.range(1, 1000, 5)

 What are the unique elements of the list List
(1,3,3,4,6,7,3,7) use conversion to sets
 
var list2=List(1,3,3,4,6,7,3,7)
list2.toSet
 
// 6. Create a mutable map named names containing the following
// "Jose", 20, "Louis", 24, "Anna", 23, "Susana", "27"
 
val names = collection.mutable.Map(("Jose", 20), ("Luis", 24),
("Anna", 23),("Susana",27))
 
// 6 a . Print all the keys on the map
 
names.keys

// 6 b . Add the following value to the map("Miguel", 23)
 
names += ("Michael" -> 23)