import time
import inspect

# To start globals: items = list(globals(items())

# Various functions to solve the following problem:
# Given an integer n, produce the list [n-1, n-2, ... , 0]

# 10 Functions that solve the problem.
# The name of each function starts with 'test'
def test1(n):
    L = []
    for i in range(n):
        L.insert(0, i)
    return L

def test2(n):
    L = []
    for i in range(n-1, -1, -1):
        L.append(i)
    return L

def test3(n):
    L = []
    for i in range(n):
        L = [i] + L
    return L

def test4(n):
    L = list(range(n-1, -1, -1))
    return L

def test5(n):
    L = [x for x in range(n-1, -1, -1)]
    return L

def test6(n):
    L = list(reversed(range(n)))
    return L

def test7(n):
    L = [n - i - 1 for i in range(n)]
    return L
    
def test8(n):
    L = list(range(n))
    L.reverse()
    return L

def test9(n):
    L = list(range(n))[::-1]
    return L

def test10(n):
    L = sorted(list(range(n)),reverse=True)
    return L

def testTheLast(n):
    L = list(range(n))
    L.sort(reverse=True)
    return L


def getElapsedTime(funct, n):
    t1 = time.time()
    L = funct(n)
    t2 = time.time()
    elapsed = t2 - t1
    return (L, elapsed) # returning a tuple. Result & elapsed time

def runTestsA(n):
    # Run and time all tests with the given value of and save the results
    result1 = getElapsedTime(test1, n)
    result2 = getElapsedTime(test2, n)
    result3 = getElapsedTime(test3, n)
    result4 = getElapsedTime(test4, n)
    result5 = getElapsedTime(test5, n)
    result6 = getElapsedTime(test6, n)
    result7 = getElapsedTime(test7, n)
    result8 = getElapsedTime(test8, n)
    result9 = getElapsedTime(test9, n)
    result10 = getElapsedTime(test10, n)
    
    # Display the results (just the timing portion, not the returned lists)
    print(f'test1:  {result1[1]}')
    print(f'test2:  {result2[1]}')
    print(f'test3:  {result3[1]}')
    print(f'test4:  {result4[1]}')
    print(f'test5:  {result5[1]}')
    print(f'test6:  {result6[1]}')
    print(f'test7:  {result7[1]}')
    print(f'test8:  {result8[1]}')
    print(f'test9:  {result9[1]}')
    print(f'test10: {result10[1]}')


def runTestsB(n):
    # Put all of the test functions in a list
    tests = [test1, test2, test3, test4, test5, test6, test7]
    tests += [test8, test9, test10, testTheLast]
    
    # Run all of the tests and save the results
    results = []
    for test in tests:
        results.append(getElapsedTime(test, n))
        
    # Print the results (Just the timing, not the returned lists)
    for i in range(len(results)):
        print(f'test{i+1} : {results[i][1]}')


def runTestsC(n):
    # Put all of the test functions in a list
    tests = [test1, test2, test3, test4, test5, test6, test7]
    tests += [test8, test9, test10, testTheLast]
    
    # Run all of the tests and save just the timing results, not the lists
    results = []
    for test in tests:
        results.append(getElapsedTime(test, n)[1])
        
    # Print the timing results
    for i in range(len(results)):
        print(f'test{i+1} : {results[i]}')


def runTestsD(n):
    # Put all of the test functions in a list using the global namespace
    gl = globals()
    names = sorted(gl.keys()) # get the keys into a sorted list

    tests = []
    for name in names:
        if name.startswith('test') and inspect.isfunction(gl[name]):
            tests.append(gl[name])
    
    
    # Run all of the tests and save the results
    results = []
    for test in tests:
        results.append(getElapsedTime(test, n)[1])
        
    # Print the results
    for i in range(len(results)):
        print(f'test{i+1} : {results[i]}')


def runTestsE(n):
    # Put all of the test functions in a list using the global namespace,
    # but use the actual names of the functions
    gl = globals()

    tests = []
    for name, obj in gl.items():
        if name.startswith('test') and inspect.isfunction(obj):
            tests.append((name, obj))
    
    
    # Run all of the tests and save the results
    results = []
    for name, test in tests:
        results.append((name, getElapsedTime(test, n)[1]))
        
    # Print the results
    for name, result in results:
        print(f'{name} : {result}')

def main():
    n = 100
    
    runTestsA(n); print()
    runTestsB(n); print()
    runTestsC(n); print()
    runTestsD(n); print()
    runTestsE(n); print()
    
    
main()