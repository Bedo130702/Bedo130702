# Q-1.Write a program to input a 4 digit number and print the even and odd digits and total even and odd digits
def even_odd(n):
    even=0
    odd=0
    while n>0:
        digit=n%10
        if digit%2!=0:
            print(f"The Odd digit is: {digit}")
            odd+=1
        else:
            print(f"The Even digit is: {digit}")
            even+=1
        n=n//10
    print(f"Total Even Digits is : {even} and total odd digit is : {odd}")
Number=int(input("Enter a 4 digit number:\n"))
even_odd(Number)

# 2.Write a program to input a 10 digit number and find the digit with maximum value.

def Enter_ten_Digits(n):
    seq=[]
    while n>0:
        digit=n%10
        seq.append(digit)
        n=n//10
    seq.sort()
    print(f"The maximum Digit is {seq[-1]}")
Number=int(input("Enter a 10 digit number:\n"))
Enter_ten_Digits(Number)

# # 3.Write a program to input a 10 digit number and print alternate digits.
def print_alternate_digits(number):
    """Function to print alternate digits of a 10-digit number.
    """
    alternate_digits = number[::2] 
    print("Alternate digits are:", alternate_digits)

def main():
    number = input("Enter a 10-digit number: ")
    if len(number) == 10 and number.isdigit():
        print(print_alternate_digits.__doc__)
        print_alternate_digits(number)
    else:
        print("Invalid input! Please enter exactly a 10-digit number.")
main()

# 4.Write a program, which will find all such numbers between 1000 and 3000 such that each digit of the number is an even number.

def isEvendigits(n):
    for i in str(n):
        if int(i)%2!=0:
            return False
    return True
even=[]
for i in range(1001,3000):
    if isEvendigits(i):
        even.append(i)
        #print(f"The number {i} is even.")
print(f"Total number of all even digits of a number between 1k to 3k is: {len(even)}")

# 5. Write a program that prints a list where the values are square of numbers between 5000 and 7000 (both included).
import math

square_values=[]
for i in range(5000,7001):
    sqr_num=math.isqrt(i)
    if sqr_num **2==i:
        square_values.append(sqr_num)
    else:
        continue
print(square_values)

# 6.Given a sorted array of positive integers arr, and an integer n which represents the length of arr, the task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

def rearrange_Array(arr,n):
    result=[]
    min=0
    max=n-1
    for inx in range(1,n+1):
        if inx%2==0:
            result.append(arr[min])
            min+=1
        else:
            result.append(arr[max])
            max-=1
    print("Rearranged Array:", result)
    
arr = [1, 2, 3, 4, 5, 6,7]
n = len(arr)
rearrange_Array(arr, n)

# 7.Write a program to input a number and search in a list using linear search.

def isPresent(arr,n):
    m=len(arr)
    flag=0
    inx=0
    for i in range(m):
        if arr[i]==n:
            flag=1
            inx=i
        else:
            continue
    if flag==1:
        print(f"The Searching element {n} is founded at the index {inx+1}")
    else:
        print("The Searching element is not founded.")
arr = [34,45,56,67,78,89,90]
search=int(input("Enter the element to search: "))
isPresent(arr, search)

# # 8.Write a program to input a number and search in a list using binary search.

def binary_Search(arr,target):
    beg=0
    end=len(arr)-1
    while beg<=end:
        mid=(beg+end)//2
        if arr[mid]==target:
            return 1
        elif arr[mid]<target:
            beg=mid+1
        else:
            end=mid-1
    return -1
def main():
    try:
        user_list=list(map(int,input("Enter the number of element to the list.").split()))
        user_list.sort()
        Search=int(input("Enter the element to search in list."))
        result=binary_Search(user_list,Search)
        
        if result==1:
            print("The searching element is founded")
        else:
            print("The searching element is not founded.")
    except ValueError:
        print("Invalid input! Please enter a valid integer.")
main()

# # 9.Write a program to input a list of numbers and sort using bubble sort.

def bubble_Sorting(arr):
    n=len(arr)
    flag=False
    for i in range(n-1):
        for j in range(n-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
                flag=True
        if not flag:
            break
def main():
    try:
        array=list(map(int,input("Enter the elements of the list.").split()))
        print(f"Before the bubble sort the list is {array}")
        bubble_Sorting(array)
        print(f"After the bubble sort the list is {array}")
    except ValueError:
        print("invalid input! Please enter a valid ineger.")
main()

# # 10.Write a program to input a list of numbers and sort using insertion sort.

def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        # Move elements of arr[0..i-1] that are greater than key
        # to one position ahead of their current position
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

# Input list of numbers
numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))

print("Original list:", numbers)
insertion_sort(numbers)
print("Sorted list:", numbers)

# # 11.Write a program to input a list of numbers and sort using selection sort.

def selection_Sorting(arr):
    n=len(arr)
    for i in range(n):
        min_idx=i
        for j in range(i+1,n):
            if arr[j]<arr[min_idx]:
                min_idx=j
        arr[i],arr[min_idx]=arr[min_idx],arr[i]
                
def main():
    try:
        array=list(map(int,input("Enter the elements of the list.").split()))
        print(f"Before the selection sort the list is {array}")
        selection_Sorting(array)
        print(f"After the selection sort the list is {array}")
    except ValueError:
        print("invalid input! Please enter a valid ineger.")
main()

# # 12.Write a program to find the frequency of characters in a given string.

def frequence_characters(input_string):
    freq_dict={}
    for i in input_string:
        if i in freq_dict:
            freq_dict[i]+=1
        else:
            freq_dict[i]=1
    return freq_dict
input_string=input("Enter a string: ")
frequencies=frequence_characters(input_string)
for char, value in frequencies.items():
    print(f"'{char}': {value}")

# 13.Write a program to input a string and a number to encode the string by adding the number to every character in the string.

def encode(strinpt,num):
    seq=""
    for i in strinpt:
        new_char=chr(ord(i)+num)
        seq+=new_char
    print(seq)
string_input=input("Enter a String: ")
number=int(input("Enter a integer no. to add."))
encode(string_input,number)

# # 14.Create an acronym or an abbreviation for the name &#39;Python For Everyone&#39;.

def create_acronym(phrase):
    words = phrase.split()
    acronym = ''.join([word[0].upper() for word in words]) 
    return acronym
phrase = "Python For Everyone"
acronym = create_acronym(phrase)
print(f"The acronym for '{phrase}' is: {acronym}")

# # 15.Find the position of the first occurrence of the word &#39;because&#39; in the following sentence: &#39;You cannot end a sentence with because because because is a conjunction&#39;

def find_first_occurrence(sentence, word):
    words = sentence.split()  
    for index, current_word in enumerate(words):
        if current_word.lower() == word.lower():  
            return index + 1  
    return -1  

sentence = "&#39;You cannot end a sentence with because because because is a conjunction&#39;"
word = "because"
position = find_first_occurrence(sentence, word)
if position != -1:
    print(f"The first occurrence of the word '{word}' is at position: {position}")
else:
    print(f"The word '{word}' was not found in the sentence.")

# # 16.Slice out the phrase &#39;because because because&#39; in the following sentence: &#39;You cannot end a sentence with because because because is a conjunction&#39;

def remove_phrase(sentence, phrase):
    return sentence.replace(phrase, "")
sentence = "You cannot end a sentence with because because because is a conjunction"
phrase = "because because because"

new_sentence = remove_phrase(sentence, phrase)

print(new_sentence)

# 17. Use the string formatting method to display the following: radius = 10 area = 3.14 * radius ** 2 The area of a circle with radius 10 is 314 meters square.

def string_formatting(radius,area):
    result="The area of a circle with radius {} is {:.0f} meters square.".format(radius, area)
    print(result)
def main():
    radius = 10 
    area=3.14 * radius **2
    string_formatting(radius,area)
main()
