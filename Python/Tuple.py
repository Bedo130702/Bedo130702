# # Tuple Creation & Indexing
# # Write a Python program to create a tuple containing the elements: 10, 20, 30, 40, 50.
# # Print the second and fourth elements using indexing.

def create_tuple():
    """Creates a tuple with elements 10, 20, 30, 40, 50"""
    return (10, 20, 30, 40, 50)

def access_elements(tup):
    """Accesses and prints the second and fourth elements of the tuple"""
    print("Second element:", tup[1])  # Index 1 corresponds to the second element
    print("Fourth element:", tup[3])  # Index 3 corresponds to the fourth element

def main():
    """Main function to execute the program"""
    my_tuple = create_tuple()  # Creating the tuple
    access_elements(my_tuple)  # Accessing and printing elements

# Calling the main function
if __name__ == "__main__":
    main()


# Tuple Slicing
# Given the tuple:
# numbers = (1, 2, 3, 4, 5, 6, 7, 8, 9)
# Write a Python program to extract a subtuple containing only the elements from index 2 to 6
# (inclusive).

def extracttuple(tup):
    print(tup[1:7])
def main():
    numbers = (1, 2, 3, 4, 5, 6, 7, 8, 9)
    extracttuple(numbers)
if __name__=="__main__":
    main()

# # Immutable Nature of Tuples
# # Consider the tuple:
# # my_tuple = (4, 8, 12, 16)
# # Try modifying the second element of my_tuple to 10. Observe the output and explain why there was
# # an error.

my_tuple=(4,8,12,16)
my_tuple[1]=10
print(f"Try to modifying the second element of my_tuple to 10 and get {my_tuple}")

# # Tuple Packing & Unpacking
# # Write a Python program that packs the values (&quot;Alice&quot;, 25, &quot;Engineer&quot;) into a tuple and then unpack
# # them into separate variables.

# Tuple Packing
person = ("Alice", 25, "Engineer")  # Packing values into a tuple

# Tuple Unpacking
name, age, profession = person  # Unpacking into separate variables

# Displaying the values
print("Name:", name)
print("Age:", age)
print("Profession:", profession)

# # Finding Length of a Tuple
# # Write a function tuple_length(t) that takes a tuple t as input and returns the number of elements in
# # the tuple.

def  tuple_length(t):
    return len(t)
def main():
    
    tup=(23,45,67,78,99,2,44,56)
    print(f"The length of the tuple is {tuple_length(tup)}")
main()

# # *****Intermediate Questions******
# # Tuple Concatenation &amp; Repetition
# # Given two tuples:
# # t1 = (1, 2, 3)
# # t2 = (&#39;a&#39;, &#39;b&#39;, &#39;c&#39;)
# # Write a Python program to concatenate t1 and t2, then repeat the resulting tuple 2 times.

def concatenate(t1,t2):
    print(f"The resulting tuple is : {t1+t2}")
if __name__=="__main__":
    tup1=(1,2,3)
    tup2=('a','b','c')
    concatenate(tup1,tup2)
    print(tup2)

# Tuple Membership Test
# Write a function check_membership(t, element) that takes a tuple t and a value element as input
# and returns True if the element exists in the tuple, otherwise False.

def check_membership(t, element):
    return True if element in t else False

tup=(23,34,45,56,56,67,99)
n=int(input("Enter the element you want to search in tuple."))
try:
    if check_membership(tup,n):
        print("The value is present in the tuple.")
    else:
        print("The value is not present in the tuple.")
except ValueError:
    print("The given input is not an integer.")

# Converting a Tuple to a List &amp; Vice Versa
# Write a Python program that converts the tuple (10, 20, 30, 40, 50) into a list, modifies the second
# element to 25, and then converts it back to a tuple.


def modifiedTuple(tup):
    lst=list(tup)
    lst.insert(1,25)
    return tuple(lst)
def main():
    tup=(10, 20 , 30 , 40 , 50)
    print(f"The modified tuple is :{modifiedTuple(tup)}")
main()

# # Advanced Questions
# # Returning Multiple Values from a Function using Tuples

# # Write a function math_operations(a, b) that takes two numbers as input and returns a tuple
# # containing their sum, difference, product, and quotient.

def math_operations(a, b):
    sum=a+b
    diff=a-b
    prod=a * b
    quot=a/b
    tup=(sum,diff,prod,quot)
    return tup
print("Enter two number to get sum,diff,product,quotient")
n=int(input("Enter the 1st number: "))
m=int(input("Enter the second number: "))
print(f"The sum,diff,product,quotient of those given number is {math_operations(n,m)}")

# Nested Tuples &amp; Accessing Elements
# Given the nested tuple:
# nested_tuple = ((1, 2, 3), (&quot;a&quot;, &quot;b&quot;, &quot;c&quot;), (True, False))
# Write a Python program to:
# Print the second element of the second inner tuple.
# Extract the last element of the third inner tuple.

nested_tuple=((1,2,3),("a","b","c"),(True,False))
print(f"The second element of the second inner tuple is {nested_tuple[1][1]}")
print(f"The last element of the third inner tuple is {nested_tuple[2][-1]}")
