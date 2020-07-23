def readTerms(fileName):
    '''opens the file with the page numbers and terms and returns a list of
    ordered pairs. Each ordered pair is a tuple in the form (term, page number)'''
    # read terms from file as a list of ordered pairs (tuples)
    termsList = []
    termsFile = open(fileName, 'r')
    for pair in termsFile:
        pair = pair.strip().lower()
        page, term = pair.split(':')
        termsList.append((term, int(page)))

    termsFile.close()
    return termsList


def makeDictOfSets(termsList):
    '''Takes a list of ordered pairs (term, page Number) and returns a
    dictionary where the keys are the terms and the value for each term is a 
    set containing all of the page numbers where the term appears.'''
    indexDict = {}
    for term, page in termsList:
        if term not in indexDict:
            indexDict[term] = {page}
        else:
            indexDict[term].add(page)

    return indexDict


def createIndex(indexDict):
    # Create list of ordered pairs (term, list of pages)
    # The list of pages is sorted
    indexList = [(term, sorted(list(indexDict[term]))) for term in indexDict]

    # Sort by terms
    indexList.sort()

    # Write each term and print pages separated by commas
    outFile = open('index.txt', 'w')
    for term, pages in indexList:
        entry = f'{term}, {", ".join(map(str, pages))}'
        print(entry)
        print(entry, file=outFile)
    outFile.close()


def main():
    termsList = readTerms('terms.txt')
    indexDict = makeDictOfSets(termsList)
    createIndex(indexDict)


main()

# The over all idea is:
#
# 1. Read the input file and create a list of tuples, where each tuple is a
#    term and a page number. For example, if the input file is
#        3:cat
#        3:dog
#        9:cat
#        1:dog
#
#    then the list created from reading the file would be
#        [('cat', 3), ('dog', 3), ('cat', 9), ('dog', 1)]
#
# 2. Make a dictionary of sets. The dictionary will have the terms as the keys
#    and for each key, the value will be a set containing the pages where that
#    key appears. For the above example, the dictionary would be
#        {'dog': {1, 3}, 'cat': {9, 3}}
#
# 3. Print the index. The terms need to be printed in sorted order and the pages
#    for each term need to be in sorted order. Since the dict and set are
#    unordered collections, the dictionary of sets is first converted to a list
#    of ordered pairs, like this:
#        [('dog', [1, 3]), ('cat', [9, 3])]
#
# 4. The the ordered pairs can be sorted and each list of pages can be sorted.
#    The result looks like this:
#        [('cat', [3, 9]), ('dog', [1, 3])]
#
# 5. Finally, it is a simple task to iterate through the list of pairs and
#    print each entry along with its page numbers
