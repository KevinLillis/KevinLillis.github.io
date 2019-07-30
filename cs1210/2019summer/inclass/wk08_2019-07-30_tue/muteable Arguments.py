def fun(x = 4):
    print(f'id: {id(x)} x: {x}')
    

def append(value, L = []):
    L.append(value)
    return L


def append(value, L = None):
    if L == None:
        L = []
        
    L.append(value)
    return L