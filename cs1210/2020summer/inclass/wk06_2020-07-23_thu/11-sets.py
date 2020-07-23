# sets.py

dashes = '\n' + (50 * '-') + '\n'


def f1():
    # ---------------------------------------
    # Create set
    print(dashes + 'f1() Creating sets')
    S = {1, 2, 3, 4}
    print(f'S = {S}')

    # There is not empty set literal. {} creates a dictionary
    S = {}
    print(f'S = {S}. It is a {type(S).__name__}')

    # Need to create an empty set like this
    S = set()
    print(f'S = {S}. It is a {type(S).__name__}. It is the empty set')


f1()


def f2():
    # ---------------------------------------
    # Adding things to a set
    print(dashes + 'f2() Adding things to a set')
    S = set()
    print(f'S starts out empty: {S}')

    S.add(3)
    print(f'After adding 3, S = {S}')

    # Duplicates aren't added
    for i in range(5):
        S.add(i)
    print(f'After adding 0 - 4, S = {S}')
# f2()


def f3():
    # ---------------------------------------
    # Removing things from a set
    print(dashes + 'f3() Removing things from a set')
    S = {x+1 for x in range(5)}  # create with set comprehension
    print(f'S starts as: {S}')

    S.remove(3)
    print(f'After removing 3, S = {S}')

    # S.remove(10) # This causes an error because 10 is not in the set

    S.discard(4)
    print(f'After discarding 4, S = {S}')

    S.discard(10)  # This is not problem
    print(f'After discarding 10, S = {S}')

    # pop removes and returns an arbitrary element from a set.
    # Error if set is empty.
    item = S.pop()
    print(f'pop returned {item}, now S = {S}')
# f3()


def f4():
    # ---------------------------------------
    # Clearing out a set
    print(dashes + 'f4() Clearing out a set')
    S = set(range(1, 6))
    print(f'S starts as: {S}')

    while len(S) > 0:
        S.pop()

    print(f'After removing everything, S = {S}')

    # It's easier to do this
    S = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    print(f'S starts as: {S}')

    S.clear()
    print(f'After removing everything, S = {S}')
# f4()


def f5():
    # ---------------------------------------
    # Eliminate duplicates from a list
    print(dashes + 'f5() Eliminate duplicates from a list')
    L = []
    for x in range(5):
        L = L + [x for i in range(x)]  # 1 1, 2 2s, 3 3s, 4 4s
    print(f'Initial list L = {L}')

    L = list(set(L))  # Duplicates are removed
    print(f'Now L = {L}')
# f5()


def f6():
    # ---------------------------------------
    # Checking membership  in
    print(dashes + 'f6() Checking membership  in')
    S = {'oak', 'pine', 'walnut'}

    answer = 'oak' in S
    print(f"""'{"oak"}' in {S}: {answer}""")

    answer = 'maple' in S
    print(f"""'{"maple"}' in {S}: {answer}""")
# f6()


# Globals for functions f7() - f14()

U = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

A = {1, 2, 3, 4, 5}
B = {3, 4, 5, 6, 7}

C = {1, 2, 3}
D = {5, 6, 7}

E = set()

A1 = set(range(1, 6))  # Same elements a A


def f7():
    # ---------------------------------------
    # Union  |
    print(dashes + 'f7() Union  |')
    X = A.union(B)
    print(f'{A} | {B} = {X}')

    X = C | D
    print(f'{C} | {D} = {X}')
# f7()


def f8():
    # ---------------------------------------
    # Intersection  &
    print(dashes + 'f8() Intersection  &')
    X = A.intersection(B)
    print(f'{A} & {B} = {X}')

    X = C & D
    print(f'{C} & {D} = {X}')
# f8()


def f9():
    # ---------------------------------------
    # Difference  -
    print(dashes + 'f9() Difference  -')
    X = A.difference(B)
    print(f'{A} - {B} = {X}')

    X = C - D
    print(f'{C} - {D} = {X}')
# f9()


def f10():
    # ---------------------------------------
    # Symmetric Difference  ^
    print(dashes + 'f10() Symmetric Difference  ^')
    X = A.symmetric_difference(B)
    print(f'{A} ^ {B} = {X}')

    X = A ^ U
    print(f'{A} ^ {U} = {X}')

    X = A ^ A
    print(f'{A} ^ {A} = {X}')
# f10()


# ===========## PREDICATES ##=================

def f11():
    # ---------------------------------------
    # Equality  == and !=
    print(dashes + 'f11() \nEquality  == and !=')
    answer = A == A1
    print(f'{A} == {A1}: {answer}')

    answer = A == B
    print(f'{A} == {B}: {answer}')
# f11()


def f12():
    # ---------------------------------------
    # Subset  <=
    print(dashes + 'f12() Subset  <=')
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
    print(dashes + 'f13() Superset  >=')
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
    print(dashes + 'f14() Disjoint')
    answer = A.isdisjoint(B)
    print(f'{A} and {B} disjoint: = {answer}')

    answer = C.isdisjoint(D)
    print(f'{C} and {D} disjoint: = {answer}')

    answer = A.isdisjoint(E)
    print(f'{A} and {E} disjoint: = {answer}')

# f14()
