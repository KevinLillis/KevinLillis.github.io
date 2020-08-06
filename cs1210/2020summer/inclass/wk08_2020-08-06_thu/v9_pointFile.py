# v9_pointFile.py

# ==========================================================================
# Verion 9
'''
   Provide for addition of points: 
   p1 + p2,
   p1 + list, p1 + tuple
   list + p1, tuple + p1
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
       
    def __add__(self, other):
        '''self + other. Self is a point, other may be something else'''
        if isinstance(other, point):
            # point + point
            x = self.x() + other.x()
            y = self.y() + other.y()
            return point(x, y)
        
        if isinstance(other, (list, tuple)):
            # self + list or self + other
            if len(other) != 2:
                raise ValueError('A point consists of exactly two integers')
            if not isinstance(other[0], int) or not isinstance(other[1], int):
                raise ValueError('Coordinates must be integers')
            
            x = self.x() + other[0]
            y = self.y() + other[1]
            return point(x, y)
            
        message = f'unsupported operand +: point and {other.__class__.__name__}'
        raise TypeError(message)
    
    def __radd__(self, other):
        '''other + self. self is a point, other may be something else'''
        if isinstance(other, (tuple, list)):
            if len(other) != 2:
                raise ValueError('A point consists of exactly two integers')
            if not isinstance(other[0], int) or not isinstance(other[1], int):
                raise ValueError('Coordinates must be integers')
            
            x = self.x() + other[0]
            y = self.y() + other[1]
            return point(x, y)
        
        message = f'unsupported operand +: point and {other.__class__.__name__}'
        raise TypeError(message)
    
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
        