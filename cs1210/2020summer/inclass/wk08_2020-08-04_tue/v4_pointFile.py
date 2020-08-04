# v4_pointFile.py

# ==========================================================================
# Verion 4
'''
   Check parameters for init are int
'''
class point(object):
    
    def __init__(self, x = 0, y = 0):
        if not isinstance(x, int) or not isinstance(y, int):
            raise ValueError('A Point consists of two integers')                

        self.__x = x
        self.__y = y
    
    def __str__(self):
        return f'({self.__x}, {self.__y})'
    