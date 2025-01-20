
#     Question-1   (11+2!+3!+…………….+n!)

def factorial(n):
    if n==0 or n==1:
        return 1
    return n * factorial(n-1)
num=int(input("Enter the number of terms in series:\n"))
result=0
for i in range(1,num+1):
    result+=factorial(i)
print(result)

#       Question-2  (1/1!+2/2!+3/3!+…………+n/n!)

def factorial(n):
    if n==0 or n==1:
        return 1
    return n * factorial(n-1)
num=int(input("Enter the number to factorial.\n"))
result=0
for i in range(1,num+1):
    result+=i/factorial(i)
print(result)

#       Question-3  (1/1^1+2/2^2+3/3^3+………………….+n/n^n)

num=int(input("Enter the number of terms you want:\n"))
result=0
for i in range(1,num+1):
    result+=i/pow(i,i)
print(result)

#       Question-4  (1+x+x^2+x^3+……………………………………+x^n)

x=int(input("Enter the value of x:\n"))
n=int(input("Enter the number of terms you want:\n"))
result=1
for i in range(1,n+1):
    result+=pow(x,i)
print(result)

#       Question-5  (1*3+3*5+………………………………………………….)

n=int(input("Enter the number of terms you want:\n"))
result=0
for i in range(1,n+1):
    result+=(2*i-1)*(2*i+1)
print(f"The sum of the series is {result}")

#       Question-6  (1*2*3+2*3*4+……………………………….+n*(n+1)*(n+2))

n=int(input("Enter the number of terms you want:\n"))
result=0
for i in range(1,n+1):
    result+=i*(i+1)*(i+2)
print(f"The sum of the series is {result}")

#        Question-7  (1-1/2+1/3-1/4+………………………………………………..)

n=int(input("Enter the number of terms you want:\n"))
sum=0
for i in range(1,n+1):
    if (i%2==0):
        sum-=1/i
    else:
        sum+=1/i
print(f"The sum of the series is {sum}")

#        Question-8  (1-x^2/2!+x^4/4!+…………………………………………….)

def factorial(n):
    if n==0 or n==1:
        return 1
    return n * factorial(n-1)

x=int(input("Enter the value of x:\n"))
n=int(input("Enter the number of terms you want:\n"))
sum=1
for i in range(2,n+1):
    if (i%2==0):
        sum-=pow(x,pow(2,i-1))/factorial(pow(2,i-1))
    else:
        sum+=pow(x,pow(2,i-1))/factorial(pow(2,i-1))
print(f"The sum of the series is {sum}")

#       Question-9  (1+2+11+26+47+……………………………………………..)

def isSeries(n):
    sum=1
    term=0
    for i in range(n):
        if i==0 or i==1:
            sum=sum+term+i
            term+=1
        else:
            term+=3*(2*i-1)
            sum+=term
    return sum
num=int(input("Enter the number of term you want:\n"))
result=isSeries(num)
print(f"The sum of the series is {result}")

# #       Question-10 (Find the nth term 2,4,3,4,15,…………………………)
def seriesterm(n):
        if n==1:
            return 2
        elif n%2==0:
            return 4
        else:
            return n*(n-2)
term=int(input("Enter the nth term number:\n"))
nthterm=seriesterm(term)
print(f"The nth term of the series is {nthterm}")

#       Question-11 (Find the nth term 3,5,33,35,53,……………………..)

def find_nth_term(n):
    # List to store the sequence
    result= []
    # Start with a queue for generating numbers
    seq= ["3", "5"]
    
    while n>len(result):
        current=seq.pop(0)
        result.append(current)
        seq.append(current+"3")
        seq.append(current+"5")
    return result[n-1]
n =int(input("Enter which term you want.\n"))
print(f"The {n}th term in the sequence is: {find_nth_term(n)}")

#       Question-12 (Find the nth term 0,0,2,1,4,2,6,3,8……………………….)

def findnthterm(n):
    if (n%2==0):
        return (n-1)//2
    else:
        return (n-1)
Number=int(input("Enter the term you want.\n"))
print(f"The {Number}th term of the series is {findnthterm(Number)}")

# #       Question-13 (Find the nth term 14,28,20,40,…………………………….)

def find_nth_term(n):
    if n % 2 !=0:  # Odd index
        term = 14 +(n//2)*6
    else:  # Even index
        term = 28+((n//2)-1)*12
    return term

# Example usage
n = int(input("Enter the value of n: "))
print(f"The {n}th term of the sequence is: {find_nth_term(n)}")

#       Question-14 (Find the nth term 1,1,2,6,24,………………………………)

def factorial(n):
    if n==0 or n==1:
        return 1
    return n * factorial(n-1)
def findnthterm(n):
    return factorial(n-1)
Number=int(input("Enter the term you want.\n"))
print(f"The {Number}th term of the series is {findnthterm(Number)}")

#       Question-15 (Find the nth term 1,8,54,384,…………………………..)

def factorial(n):
    if n==0 or n==1:
        return 1
    return n * factorial(n-1)
def nth_term(n):
    return pow(n,2)* factorial(n)
Number=int(input("Enter the term you want.\n"))
print(f"The {Number}th term of the series is {nth_term(Number)}")

#       Question-16 (Find the nth term 5,13,25,41,61,…………………….)
def nth_term(n):
    return 2 * n**2 + 2 * n + 1 
n = int(input("Enter the term number (n): "))
print(f"The {n}th term is: {nth_term(n)}")

# #       Question-17 ( Find the nth term 0,6,0,12,0,90,…………………….)

def nth_term(n):
    if n%2!=0:
        return 0
    else:
        if n==2 or n==4:
            return n*3
        else:
            return (n*3)*(n-1)
n = int(input("Enter the term number (n): "))
print(f"The {n}th term is: {nth_term(n)}")

#       Question-18 (Find the nth term a,b,b,c,c,c,……………………)

def find_nth_term(n):
    i = 1  
    count = 0  
    while True:
        count += i  
        if count >= n:  
            return chr(96 + i)  
        i += 1 
n = int(input("Enter the value of n: "))
print(f"The {n}th term in the sequence is: {find_nth_term(n)}")
