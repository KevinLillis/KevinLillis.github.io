
class point(object):
    def __init__(self, x=0, y=0):
        #print('=====> in __init__')
        # Make sure x and y are both integers
        if not isinstance(x, int) or not isinstance(y, int):
            raise ValueError('A point must consist of two integers')
        
        self.__x = x
        self.__y = y
        
    def x(self):
        return self.__x

    def y(self):
        return self.__y
    
    def setX(self, x):
        if not isinstance(x, int):
            raise ValueError('x must be an integer')
        self.__x = x
        
    def setY(self, y):
        if not isinstance(y, int):
            raise ValueError('y must be an integer')
        self.__y = y

    def __add__(self, other):
        #print('=====> in __add__')        
        # self + other. Self is a point object. other may or may not be a point.
        if isinstance(other, point):
            x = self.x() + other.x()
            y = self.y() + other.y()
            return point(x, y)
        
        if isinstance(other, (tuple, list)):
            x = self.x() + other[0]
            y = self.y() + other[1]
            return point(x, y)
        
        message = f'unsupported operand +: point and {other.__class__.__name__}'
        raise TypeError(message)

    def __radd__(self, other):
        #print('=====> in __radd__')                
        # other + self. self is a Point othr many or may not be a point
        if isinstance(other,(tuple, list)):
            x = other[0] + self.x()
            y = other[1] + self.y()
            return point(x, y)
            
        message = f'unsupported operand +: {other.__class__.__name__} and point'
        raise TypeError(message)

    def __getitem__(self, value):
        if isinstance(value, int):
            if value == 0:
                return self.x()
            if value == 1:
                return self.y()
            raise IndexError('Valid point indexes are 0, 1, "x", "y", "X", "Y"')
        
        if isinstance(value, str):
            if value.lower() == 'x':
                return self.x()
            if value.lower() == 'y':
                return self.y()
            raise NameError(f"name {value} is not defined")
        
        raise TypeError('Valid point indexes are 0, 1, "x", "y", "X", "Y"')
        

    def __str__(self):
        #print('=====> in __str__')
        return f'({self.x()},{self.y()})'
        
    def __repr__(self):
        #print('=====> in __repr__')
        return str(self)