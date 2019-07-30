import math
class Ellipse:
    def __init__(self, x=1, y=2, a=3, b=4):
        self._x = x
        self._y = y
        self._a = a
        self._b = b
        
    # Four accessors
    def getx(self):
        return self._x
        
    def gety(self):
        return self._y

    def geta(self):
        return self._a

    def getb(self):
        return self._b
    
    # Four mutators
    def setx(self, x):
        self._x = x

    def sety(self, y):
        self._y = y

    def seta(self, a):
        self._a = a

    def setb(self, b):
        self._b = b
        
    def getarea(self):
        return math.pi * self._a * self._b
    
    # Predicate Method
    def iscircle(self):
        return self._a == self._b
    
    def translate(self, dx, dy):
        self._x += dx
        self._y += dy
        
    def __str__(self):
        s = f'x: {self._x}\ny: {self._y}\n'
        s += f'a: {self._a}\nb: {self._b}'
        return s
        
    def __repr__(self):
        return self.__str__()


class Circle(Ellipse):
    def __init__(self, x=5, y=6, r=7):
        super().__init__(x, y, r, r)
        
    def setradius(self, r):
        self.seta(r)
        self.setb(r)
        
    def getradius(self):
        return super().geta()
    
    def __str__(self):
        s = f'x: {self._x}\ny: {self._y}\n'
        s += f'r: {self.getradius()}'
        return s
        
        