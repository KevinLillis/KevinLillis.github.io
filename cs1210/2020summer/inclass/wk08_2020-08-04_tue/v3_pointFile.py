# v3_pointFile.py

# ==========================================================================
# Verion 3
'''
   added __init__
   changed __str__
'''
class point(object):
    
    def __init__(self, x = 0, y = 0):
        self.__x = x
        self.__y = y
    
    def __str__(self):
        return f'({self.__x}, {self.__y})'
    