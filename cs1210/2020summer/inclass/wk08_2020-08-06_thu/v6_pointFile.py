# v6_pointFile.py

# ==========================================================================
# Verion 6
'''
   Interact with each instance variables in only one place
   Added __repr__
'''
class point(object):
    
    def __init__(self, x = 0, y = 0):
        self.setx(x)
        self.sety(y)
    
    def __str__(self):
        return f'({self.x()}, {self.y()})'
    
    def __repr__(self):
        return f'[class:{self.__class__.__name__}, x:{self.__x}, y:{self.__y}]'
    
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
        