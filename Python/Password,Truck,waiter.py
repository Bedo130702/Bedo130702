#  Q-1) password check
# import os

def passwordCracker(passwords, loginAttempt):
    memo = {}  # Memoization for dynamic programming

    def helper(attempt):
        if attempt == "":
            return []
        if attempt in memo:
            return memo[attempt]

        for password in passwords:
            if attempt.startswith(password):
                result = helper(attempt[len(password):])
                if result is not None:
                    memo[attempt] = [password] + result
                    return memo[attempt]

        memo[attempt] = None
        return None

    result = helper(loginAttempt)
    return " ".join(result) if result else "WRONG PASSWORD"

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')
    
    t = int(input().strip())  # Number of test cases

    for _ in range(t):
        n = int(input().strip())  # Number of passwords
        passwords = input().rstrip().split()  # List of passwords
        loginAttempt = input().strip()  # Login attempt string

        result = passwordCracker(passwords, loginAttempt)

        # fptr.write(result + '\n')
        print(result)

    # fptr.close()

# Q-2) waiter problem all primes divisible goes 1st 

import math
def get_primes(n):          #Number of primes need n
    primes=[]
    num=2
    while len(primes)<n:
        flag=1
        for p in primes:
            if num%p==0:
                flag=0
        if flag==1:
            primes.append(num)
        num+=1
    return primes
# n=int(input())
# print(get_primes(n))
def waiter(number,q):
    primes=get_primes(q)
    A=number
    answer=[]
    for i in range(q):
        prime=primes[i]

        A_next=[]
        B=[]

        while A:
            num=A.pop()
            print(num)
            if num%prime==0:
                B.append(num)
            else:
                A_next.append(num)  
        answer.extend(reversed(B))
    answer.extend(reversed(A_next))
    return answer
if __name__=="__main__":
    n,q=map(int,input().split())          # n=number of elements,q=number of primes
    number=list(map(int,input().split()))   # number=number of elements in the list
    result=waiter(number,q)
    for i in result:
        print(i)

# Qs-3) Truck_Tour  input petrol and distance of the next petrol pump station

def Truck_tour(petrolpumps):
    start=0
    fuel=0
    rem=0
    for i in range(len(petrolpumps)):
        petrol,distance=petrolpumps[i]
        fuel += petrol - distance           # data set : 1 3,6 4,7 2 Ans : 2nd petrolpump ans will be 1
        if fuel<0:
            start=i+1           # changing the starting point if fuel=-1
            rem += fuel
            fuel=0
    return start if fuel+rem>=0 else -1
if __name__=="__main__":
    n=int(input("Enter the number of Petrolpumps."))
    petrolpumps=[]
    for _ in range(n):
        petrolpumps.append(list(map(int,input().rstrip().split())))
    print(Truck_tour(petrolpumps))
    
