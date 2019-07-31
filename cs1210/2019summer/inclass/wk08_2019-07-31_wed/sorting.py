'''Sorting lists with multiple levels of criteria'''

class person:
    '''
    We'll make a list of person objects and sort them in differnet ways.
    '''
    def __init__(self, first, last, age):
        self._first = first
        self._last = last
        self._age = age

    def first(self):
        return self._first
        
    def last(self):
        return self._last
    
    def age(self):
        return self._age
    
    def __str__(self):
        return f'{self.first()} {self.last()} {self.age()}'
    
    def __repr__(self):
        return self.__str__()
    
def getListOfObjects():
    '''
    Reads data from a text file to create and return
    a list of person objects.
    '''
    people = []
    
    infile = open('people.txt', 'r')
    for line in infile:
        first, last, age = line.split()
        people.append(person(first, last, int(age)))
        
    infile.close()
    return people

def sortALFStupid():
    '''
    Sorts the list of person objects by age, last, first. This is not a
    good way to do this. But is works.
    '''
    
    # Get the list of objects
    personL = getListOfObjects()
    
    print(f'{30 * "-"}\nUnsorted list of objects')
    for p in personL:
        print(p)
        
    # Make tuples of out the objects
    tosortL = []
    for p in personL:
        tosortL.append((p.age(), p.last(), p.first()))
        
    print(f'{30 * "-"}\nUnsorted list of Tuples')
    for T in tosortL:
        print(T)
        
    # Sort the list of tuples
    tosortL.sort()
    
    print(f'{30 * "-"}\nSorted list of Tuples')
    for T in tosortL:
        print(T)
        
    # Make objects out of the sorted tuples
    personL = []
    for T in tosortL:
        personL.append(person(T[2], T[1], T[0]))
        
    print(f'{30 * "-"}\nSorted list of objects')
    for p in personL:
        print(p)
    
def sortSmart():
    personL = getListOfObjects()
    
    print(f'{30 * "-"}\nUnorted list of objects')
    for p in personL:
        print(p)
        
    # sort by age, last, first
    personL.sort(key = lambda p : (p.age(), p.last(), p.first()))

    print(f'{30 * "-"}\nSorted list of objects (age, last, first)')
    for p in personL:
        print(p)
        
    # sort by last, first
    personL = getListOfObjects()
    
    personL.sort(key = lambda p : (p.last(), p.first()))

    print(f'{30 * "-"}\nSorted list of objects (last, first)')
    for p in personL:
        print(p)
    
    # sort by last, first
    personL = getListOfObjects()
        
    personL.sort(key = lambda p : p.last())
    
    print(f'{30 * "-"}\nSorted list of objects (last)')
    for p in personL:
        print(p)
    