# File: prim.py
'''
A graph is represented as G = (n,E) where:

n is the number of vertices in the graph. Vertices are labeled from 0 to n-1.

E is a list of weighted edges. Each edge is represented by a tuple (u, v, w),
which is an edge from vertex u to vertex v with weight w.    
'''

from math import inf as infinity

def createAdjMatrix(graph):
    n = graph[0]
    E = graph[1]
    # create an n x n matrix filled with 0 weight edges
    adjMatrix = [[0 for i in range(n)] for j in range(n)]
    for u, v, w in E:
        adjMatrix[u][v] = w
        adjMatrix[v][u] = w
        
    return adjMatrix
    
def prim(graph):
    n = graph[0];
    matrix = createAdjMatrix(graph)
    
    # arbitrarily choose initial vertex

    
    # initialize an empty list and empty MST
    # that contains every vertex in the graph
    MSTEdges = []
    potentialEdges = []
    visited = []
    minEdge = (None, None, infinity)
    
    # Run Prim's algo until we create a MST
    # containing every vertex
    vertex = 0
    for i in range(n-1):
        # mark this vertex as visited
        visited.append(vertex)
        
        # add each edge to the list of potential edges
        for r in range(n):
            if matrix[vertex][r] != 0:
                potentialEdges.append( (vertex, r, matrix[vertex][r]) )
                
        # find the potential edge with the smallest weight to a vertex 
        # that has not yet been visited
        for edge in potentialEdges:
            if edge[2] < minEdge[2] and edge[1] not in visited:
                minEdge = edge
                
        # Remove the minimum edge from the list of potential edges
        potentialEdges.remove(minEdge)
        
        # Add the minimum edge to the MST
        MSTEdges.append(minEdge)
        
        # Get ready for the next iteration
        vertex = minEdge[1]
        minEdge = (None, None, infinity)
    return (n, MSTEdges)

def getWeight(graph):
    edges = graph[1]
    weight = sum([edge[2] for edge in edges])
    return weight

def example1():
    '''
      0----1    Weights: w(0,1) = 6
      |\   |             w(0,2) = 7
      | \  |             w(0,3) = 9
      |  \ |             w(1,2) = 2
      |   \|
      3    2
    '''
    graph = (4, [(0,1,6), (0,3,9), (1,2,5), (0,2,7)])
    MST = prim(graph)
    
    edges = MST[1]
    print('MST Edges:', edges)
    print('MST Weight:', getWeight(MST)) # In class this was (MST[1]), which caused the error
    
    
def example2():
    '''
      0--------1-----2     Weights: w(0,1) =  40   w(1,2) = 15
              / \   / \             w(1,4) =  20   w(1,5) = 20
             /   \ /   \            w(2,5) =  30   w(2,6) = 10
      3-----4-----5-----6           w(3,4) = 100   w(4,5) = 10
                                    w(5,6) =   5
    '''
    
    edges = [(0,1,40), (1,2,15), (1,4,20), (1,5,20), (2,5,30), (2,6,10)]
    edges += [(3,4,100), (4,5,10), (5,6,5)]
    
    graph = (7, edges)
    MST = prim(graph)
    
    edges = MST[1]
    print('MST Edges:', edges)
    print('MST Weight:', getWeight(MST))
    
def main():
    print('Example 1')
    example1()
    
    print()
    print('Example 2')
    example2()
    
main()