# W3resource
# <<Qs-1>>Replace first char occurrences with $.

str1="bedabrata Patra"

temp=str1[0]

str2=str1.replace(temp,"$")

str3=temp+str2[1:]

print(str3)

# <<Qs-2>>Swap first 2 chars of 2 strings.

str1="abc"
str2="xyz"

temp1=str1[:2]
temp2=str2[:2]

print(temp2+ str1[2:])
print(temp1+ str2[2:])

# <<Qs-3>>Add ing or ly to a string.

# Define a function named add_string that takes one argument, 'str1'.
def add_string(str1):
    # Get the length of the input string 'str1' and store it in the variable 'length'.
    length = len(str1)

    # Check if the length of 'str1' is greater than 2 characters.
    if length > 2:
        # If the last three characters of 'str1' are 'ing', add 'ly' to the end.
        if str1[-3:] == 'ing':
            str1 +='ly'
        else:
            # If the last three characters are not 'ing', add 'ing' to the end.
            str1 += 'ing'

    # Return the modified 'str1'.
    return str1

# Call the add_string function with different input strings and print the results.
print(add_string('ab'))      # Output: 'ab'
print(add_string('abc'))     # Output: 'abcing'
print(add_string('string'))  # Output: 'stringly'

# <<Qs-4>>Find longest word in a list.

def longest_word(str1):
    word=[]
    
    for i in str1:
        word.append((len(i),i))
    word.sort()
    
    return word[-1][0],word[-1][1]
    
lst=["PHP","PYTHON","JAVA"]
result=longest_word(lst)

print(f"The longest word is {result[1]} and the length is {result[0]}")

# <<Qs-5>> Remove nth character from a string.

def remove_nthword(str1,w):
    
    s=str1.find(w)
    
    str3=str1[:s]+str1[s+1:]
    
    print(str3)
str1="Bedabrata"
w="r"
remove_nthword(str1,w)

# <<Qs-6>>Remove odd index chars from a string. Write a Python program to remove characters that have odd index values in a given string.

result=""
str1="bedabrata patra"

for i in range(len(str1)):
    if i%2==0:
        result+=str1[i]
print(result)

# <<Qs-7>>Count word occurrences in a sentence.Write a Python program to count the occurrences of each word in a given sentence.
from collections import Counter
def word_count(str1):
    str2=str1.split(" ")
    str3=Counter(str2)
    print(str3)
    
print( word_count('the quick brown fox jumps over the lazy dog.'))

def word_count(str1):
    word={}
    str2=str1.split(" ")
    for i in str2:
        if i in word:
            word[i]+=1
        else:
            word[i]=1
    print(word)
    
str1='the quick brown fox jumps over the lazy dog.'
word_count(str1)

# <<Qs-8>>Sort distinct words in comma-separated input.

# # Prompt the user to input a comma-separated sequence of words and store it in the variable 'items'.
items = "Input comma-separated sequence of words"

# # Split the input 'items' into a list of words by using the comma as the separator and store it in the 'words' list.
words = [word for word in items.split(" ")]

# # Convert the 'words' list into a set to remove any duplicate words, then convert it back to a list.
# # Sort the resulting list alphabetically and join the words with commas.
# # Finally, print the sorted and comma-separated list of unique words.
print(",".join(sorted(list(set(words)))))

# <<Qs-9>>Wrap word(s) in HTML tags.

# # Write a Python function to create an HTML string with tags around the word(s).
# # Sample function and result :
# # add_tags('i', 'Python') -> '<i>Python</i>'
# # add_tags('b', 'Python Tutorial') -> '<b>Python Tutorial </b>'

def add_tags(str1,str2):

    print("<%s>%s</%s>" % (str1,str2,str1))

add_tags('i','Python')

# <<Qs-10>>Get substring before a specific character.Write a Python program to get the last part of a string before a specified character.

str1 = 'https://www.w3resource.com/python-exercises/string'

print(str1.rsplit('/',2)[1])

# <<Qs-11>>Insert string into middle of another.Write a Python function to insert a string in the middle of a string.

# # Define a function named insert_string_middle that takes two arguments, 'str' and 'word'.
def insert_string_middle(str, word):
    # Create and return a new string by concatenating the first two characters of 'str',
    # followed by the 'word', and then the remaining characters of 'str' starting from the third character.
    return str[:2] + word + str[2:]

# # Call the insert_string_middle function with different input strings and words and print the results.
print(insert_string_middle('[[]]', 'Python'))  # Output: '[Python]'
print(insert_string_middle('{{}}', 'PHP'))    # Output: '{{PHP}}'
print(insert_string_middle('<<>>', 'HTML'))    # Output: '<>'

# <<Qs-12>>Reverse string if length is a multiple of 4.Write a Python function to reverse a string if its length is a multiple of 4.

str1="BedabrataPat"
length=len(str1)
if length%4==0:
    print(''.join(reversed(str1)))

# <<Qs-13>>Find first repeated character.

def repeatChar(str1):
    
    for inx,c in enumerate(str1):
        if str1[:inx+1].count(c)>1:
            return c

str1="abcdabcd"
print(repeatChar(str1))

# <<Qs-14>>Sum digits in string.Write a Python program to compute the sum of the digits in a given string.

str1="1243abcdefghijkl43534"

sum=0

for i in str1:
    if i.isdigit():
        digit=int(i)
        sum+=digit
print(sum)

# <<Qs-15>>
str2="bed 12 brata 14 13 patra"
print(max(int(num) for num in str2.split() if num.isdigit()))

# <<Qs-16>>
# # Define a function that sorts words in a string based on their first character
def test(text):
# # Split the input string into words, sort them based on the first character, and join them back into a string
    return ' '.join(sorted(text.split(), key=lambda c: c[0]))

# # Initialize a string with words
word = "Red Green Black White Pink"
# # Print the original word
print("Original Word:", word)
# # Print a message indicating sorting based on the first character
print("Sort the said string based on its first character:")
# # Call the function to sort the words and print the result
print(test(word))


# <<QS-1>>****NPTEEL****
def uniquenum(n):
    lst=list(map(int,n.split()))
    lst1=[]
    s=set()
    for num in lst:
        if num>=0 and num%2==0 and num not in s:
            lst1.append(num)
            s.add(num)
        elif num not in s:
            lst1.append(num)
    return " ".join(map(str,lst1))
    

lst=input()
print(uniquenum(lst))

# <<QS-2>>****NPTEEL****

#  2 3 4 5 6
def addvalues(n):
    temp=n.copy()
    n.reverse()
    lst=[]
    for i,num in enumerate(temp):
        lst1=0
        if i%2==0:
            lst1=num+n[i]
            lst.append(lst1)
        else:
            lst.append(num)
    return " ".join(map(str,lst))

m=list(map(int,input().split()))
print(addvalues(m))

