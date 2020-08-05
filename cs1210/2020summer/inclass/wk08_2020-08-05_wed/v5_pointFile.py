# v5_pointFile.py

# ===================================================================
# version 5
'''
Add accessors and mutators
'''

class point(object):
    def __init__(self, x = 0, y = 0):
        if not isinstance(x, int) or not isinstance(y, int):
            raise ValueError('point requires two integers. Was given something else.')
        
        self.__x = x
        self.__y = y
    
    
    def __str__(self):
        return f'({self.__x}, {self.__y})'
    
    # Accessors (getters)
    def x(self):
        return self.__x
    
    def y(self):
        return self.__y
    
    def getxy(self):
        return (self.__x, self.__y)
    
    
    # Mutators (setters)
    def setx(self, x):
        if not isinstance(x, int):
            raise ValueError('x must be an integer.')
        
        self.__x = x
        
    def sety(self, y):
        if not isinstance(y, int):
            raise ValueError('y must be an integer.')
        
        self.__y = y
        
    def setxy(self, x, y):
        if not isinstance(x, int) or not isinstance(y, int):
            raise ValueError('point requires two integers. Was given something else.')
        
        self.__x = x
        self.__y = y
        
