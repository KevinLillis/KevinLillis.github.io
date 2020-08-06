# v8_pointFile.py

# ==========================================================================
# Verion 8
'''
   Add __setitem__
'''
class point(object):
    
    def __init__(self, x = 0, y = 0):
        self.setx(x)
        self.sety(y)
    
    def __str__(self):
        return f'({self.x()}, {self.y()})'
    
    def __repr__(self):
        return f'[class:{self.__class__.__name__}, x:{self.__x}, y:{self.__y}]'
    
    def __getitem__(self, index):
        errorMessage = 'valid index values are: -2, -1, 0, 1'
        
        if not isinstance(index, int):
            raise IndexError(errorMessage)
        
        # We know index is an int. Now check its value
        if index not in [-2, -1, 0, 1]:
            raise IndexError(errorMessage)
        
        # We now know we have a valid index
        if index in [0, -1]:
            return self.x()
        else:
            return self.y()
    
    def __setitem__(self, index, newValue):
        errorMessage = 'valid index values are: -2, -1, 0, 1'
        
        if not isinstance(index, int):
            raise IndexError(errorMessage)
        
        # We know index is an int. Now check its value
        if index not in [-2, -1, 0, 1]:
            raise IndexError(errorMessage)
        
        # We now know we have a valid index
        if index in [0, -2]:
            return self.setx(newValue)
        else:
            return self.sety(newValue)
        
    
    # Accessor (getter)
    def x(self):
        return self.__x
    
    def y(self):
        return self.__y
    
    def getxy(self):
        return (self.x(), self.y())
    
    # Mutators (setters)
    def setx(self, x):
        if not isinstance(x, int):
            raise ValueError('A point consists of two integers')
        
        self.__x = x
        
    def sety(self, y):
        if not isinstance(y, int):
            raise ValueError('A point consists of two integers')
        
        self.__y = y
        
    def setxy(self, x, y):
        self.setx(x)
        self.sety(y)
        