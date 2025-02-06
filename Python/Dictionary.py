# 1. Dictionary Creation &amp; Accessing Values
# Create a dictionary student with the following key-value pairs:
# {
# &quot;name&quot;: &quot;John&quot;,
# &quot;age&quot;: 20,
# &quot;course&quot;: &quot;Computer Science&quot;
# }
# Write a Python program to print the student&#39;s name and course.

def dictionary():
    student={"name":"john","age":20,"course":"Computer science"}
    print(f"Student name {student["name"]}")
    print(f"Student course {student["course"]}")
dictionary()

# # 2. Adding and Updating Dictionary Elements
# # Given the dictionary:
# # employee = {&quot;name&quot;: &quot;Alice&quot;, &quot;salary&quot;: 5000}
# # o Add a new key &quot;department&quot; with the value &quot;HR&quot;.
# # o Update &quot;salary&quot; to 5500.
# # o Print the updated dictionary.

def updatedDict(employee):
    employee["Department"]="HR"
    employee["salary"]=5500
    return employee
def main():
    emp={"name":"Alice","salary":5000}
    
    print(f"The updated employee dictionary is {updatedDict(emp)}")
main()

# 3. Checking Key Existence
# Write a function check_key(d, key) that takes a dictionary d and a key key, and
# returns True if the key exists in the dictionary, otherwise False.

def check_key(d, key):
    return True if key in d else False
    
if __name__=="__main__":
    country_capitals = {"USA": "Washington","France": "Paris","India":"New Delhi"}
    n=input("Enter the key which you want to search.")
    if check_key(country_capitals,n):
        print(f"The key {n} is founded!")
    else:
        print("The Key is not founded!")

# Iterating Over a Dictionary
# Write a Python program that iterates over the following dictionary and prints each
# key-value pair:
# fruits = {&quot;apple&quot;: 10, &quot;banana&quot;: 5, &quot;cherry&quot;: 15}

def iteratesDict(fruits):
    for key,value in fruits.items():
        print(f"{key}-->{value}")
fruits = {"apple" : 10,"banana" : 5,"cherry" : 15}
iteratesDict(fruits)

# Dictionary Length
# Write a function dict_length(d) that returns the number of key-value pairs in a
# given dictionary.

def dict_length(d):
    return len(d)
fruits = {"apple" : 10,"banana" : 5,"cherry" : 15}
print(f"The size of the dictionary is {dict_length(fruits)}")

# Intermediate Questions
# 6. Merging Two Dictionaries
# Given two dictionaries:
# d1 = {&quot;a&quot;: 1, &quot;b&quot;: 2}
# d2 = {&quot;b&quot;: 3, &quot;c&quot;: 4}
# Write a program to merge d1 and d2, where keys in both dictionaries should have the
# values from d2.

d1={"a":1,"b":2}
d2={"b": 3,"c":4}
d1.update(d2)
print(d1)

# # Removing an Item from a Dictionary
# # Given the dictionary:
# # country_capitals = {&quot;USA&quot;: &quot;Washington&quot;, &quot;France&quot;: &quot;Paris&quot;, &quot;India&quot;:
# # &quot;New Delhi&quot;}

# # Write a program to remove the key &quot;France&quot; from the dictionary and print the
# # updated dictionary.

def countryRemove(rem):
    del rem["France"]
    print(f"After removing the france the dictionary is: {rem}")
country_capitals = {"USA": "Washington","France": "Paris","India":"New Delhi"}
countryRemove(country_capitals)

# # Converting Two Lists into a Dictionary
# # Given two lists:
# # keys = [&quot;name&quot;, &quot;age&quot;, &quot;city&quot;]
# # values = [&quot;Alice&quot;, 25, &quot;New York&quot;]
# # Write a program to convert them into a dictionary.

def keyValues(key1,value1):
    dic=dict(zip(key1,value1))
    print(dic)
key=["name","age","city"]
value=["Alice",25,"New york"]
keyValues(key,value)

# # Advanced Questions
# # 9. Finding Maximum and Minimum Values in a Dictionary
# # Given the dictionary:
# # scores = {&quot;Alice&quot;: 85, &quot;Bob&quot;: 92, &quot;Charlie&quot;: 78, &quot;David&quot;: 95}
# # Write a Python program to find the student with the highest and lowest scores.

def maxMin(scores):
    highest=max(scores.values())
    lowest=min(scores.values())
    print(f"Highest Scores is {highest}")
    print(f"Lowest Scores is {lowest}")
scores={"Alice": 85,"Bob": 92, "Charlie": 78,"David": 95}
maxMin(scores)

# 10. Nested Dictionary &amp; Accessing Elements
# Given the dictionary:
# students = {
# &quot;John&quot;: {&quot;age&quot;: 20, &quot;grades&quot;: [85, 90, 92]},
# &quot;Emma&quot;: {&quot;age&quot;: 22, &quot;grades&quot;: [88, 79, 95]}
# }
# Write a program to:
# o Print John&#39;s age.
# o Print Emma&#39;s highest grade.


student={"john":{"age" : 20 ,"grade":[85,90,92]},"Emma": {"age": 22, "grades": [88, 79, 95]}}
print(f"John's age is {student["john"]["age"]}")
print(f"The maximun grade of the student Emma is {max(student["Emma"]["grades"])}")
