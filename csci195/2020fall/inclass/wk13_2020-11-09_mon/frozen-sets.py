# frozensets.py

def f1():
    # ---------------------------------------
    # Empty frozen set
    F = frozenset()
    print(f'{F=}')

    # Create from another collection
    L = [1, 2, 3, 2, 3, 4]
    F = frozenset(L)
    print(f'{F=}')

    T = (5, 6, 7, 8, 7, 8, 9)
    F = frozenset(T)
    print(f'{F=}')

    F = frozenset(range(1, 10, 2))
    print(f'{F=}')


f1()


def f6():
    # ---------------------------------------
    # Checking membership  in
    F = frozenset(['oak', 'pine', 'walnut'])

    answer = 'oak' in F
    print(f"'oak' in {F}: {answer}")

    answer = 'maple' in F
    print(f"'maple' in {F}: {answer}")

# f6()

# Globals for functions f7() - f14()


U = frozenset([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

A = frozenset([1, 2, 3, 4, 5])
B = frozenset([3, 4, 5, 6, 7])

C = frozenset([1, 2, 3])
D = frozenset([5, 6, 7])

E = frozenset()

A1 = frozenset([1, 2, 3, 4, 5])


def f7():
    # ---------------------------------------
    # Union
    X = A.union(B)
    print(f'{A} Union {B} = {X}')

    X = C.union(D)
    print(f'{C} Union {D} = {X}')

# f7()


def f8():
    # ---------------------------------------
    # Intersection
    X = A.intersection(B)
    print(f'{A} intersect {B} = {X}')

    X = C.intersection(D)
    print(f'{C} intersect {D} = {X}')

# f8()


def f9():
    # ---------------------------------------
    # Difference
    X = A.difference(B)
    print(f'{A} difference {B} = {X}')

    X = C.difference(C)
    print(f'{C} difference {D} = {X}')

# f9()


def f10():
    # ---------------------------------------
    # Symmetric Difference
    X = A.symmetric_difference(B)
    print(f'{A} symm diff {B} = {X}')

    X = A.symmetric_difference(U)
    print(f'{A} symm diff {U} = {X}')

    X = print(f'{A} symm diff {A} = {X}')
    print(f'{A} symm diff {A} = {X}')


# f10()

# ===========## PREDICATES ##=================


def f11():
    # ---------------------------------------
    # Equality  == and !=
    answer = A == A1
    print(f'{A} == {A1}: {answer}')

    answer = A == B
    print(f'{A} == {B}: {answer}')


# f11()


def f12():
    # ---------------------------------------
    # Subset  <=
    answer = A.issubset(U)
    print(f'{A} <= {U}: {answer}')

    answer = A <= A
    print(f'{A} <= {A}: {answer}')

    answer = E <= A
    print(f'{E} <= {A}: {answer}')

    answer = C <= D
    print(f'{C} <= {D}: {answer}')


# f12()


def f13():
    # ---------------------------------------
    # Superset  >=
    answer = U.issuperset(A)
    print(f'{U} is a superset of {A}: = {answer}')

    answer = A >= A
    print(f'{A} >= {A}: {answer}')

    answer = A >= E
    print(f'{A} >= {E}: {answer}')

    answer = C >= D
    print(f'{C} >= {D}: {answer}')


# f13()


def f14():
    # ---------------------------------------
    # Disjoint  (no symbol)
    answer = A.isdisjoint(B)
    print(f'{A} and {B} disjoint: = {answer}')

    answer = C.isdisjoint(D)
    print(f'{C} and {D} disjoint: = {answer}')

    answer = A.isdisjoint(E)
    print(f'{A} and {E} disjoint: = {answer}')


# f14()
