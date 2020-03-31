
public interface Graph {

    
    /**
     * Returns the number of vertices in the graph. ie. the "order" of the graph.
     * @return the number of vertices in the graph
     */
    int numberOfVertices();

    
    /**
     * Returns the number of edges in the graph. ie. the "size" of the graph.
     * @return the number of edges in the graph
     */
    int numberOfEdges();

    
    /**
     * Returns an array of Strings containing the labels of the vertices
     * @return a String array containing the vertex labels
     */
    String[] getVertexLabels();

    
    /**
     * Adds a new vertex to the graph
     * @param newVertex the new vertex to be added
     * @throws RuntimeException if vertex already exists
     */
    void addVertex(String newVertex);

    
    /**
     * Determines if a vertex with the given label exists.
     * @param vertex the label of a vertex.
     * @return true of the vertex exist, false if it does not exist.
     */
    boolean vertexExists(String vertex);

    
    /**
     * Determines if an edge with the given end vertices exists.
     * @param vertex1 one end vertex
     * @param vertex2 the other end vertex
     * @return true if the edge exists, false otherwise.
     * @throws RuntimeException if either end vertex does not exist.
     */
    boolean edgeExists(String vertex1, String vertex2);

    
    /**
     * Deletes a vertex and all incident edges.
     * @param vertex The vertex to be deleted
     * @throws RuntimeException if the vertex does not exist
     */
    void deleteVertex(String vertex);

    
    /**
     * Adds a new edge
     * @param vertex1 one end vertex of the edge
     * @param vertex2 the other end vertex of the edge
     * @throws RuntimeException if the edge already exists or if either end
     * vertex does not exist.
     */
    void addEdge(String vertex1, String vertex2);

    
    /**
     * Deletes an edge
     * @param vertex1 one end vertex of the edge
     * @param vertex2 the other end vertex of the edge
     * @throws RuntimeException if the edge does not exist or if either end
     * vertex does not exist.
     */
    void deleteEdge(String vertex1, String vertex2);

    
    /**
     * Returns the labels of all neighbors of a vertex
     * @param vertex the vertex of interest
     * @return a String array holding the labels the neighbors.
     * @throws RuntimeException if the vertex does not exist
     */
    String[] getNeighbors(String vertex);

    
    /**
     * Returns the degree of a vertex
     * @param vertex the vertex of interest
     * @return the degree of the given vertex
     * @throws RuntimeException if the vertex does not exist.
     */
    int degree(String vertex);

    
    /**
     * Returns the maximum degree of the graph
     * @return the maximum degree
     */
    int maxDegree();

    
    /**
     * Returns the minimum degree of the graph.
     * @return the minimum degree
     */
    int minDegree();

    
    /**
     * Returns the average degree of the graph
     * @return the average degree
     */
    double averageDegree();

    
    /**
     * Determines if the graph is connected.
     * @return true if the graph is connected, false otherwise.
     */
    boolean isConnected();
    
    
    /**
     * Performs a Breadth First Search traversal starting at a given vertex.
     * Constructs and returns a BFS spanning tree of the connected component 
     * containing the vertex. Adjacent vertices are visited in the
     * lexicographical order of their labels.
     * @param vertex the vertex at which the BFS traversal is started
     * @return a BFS spanning tree of the connected component containing 
     * the given vertex.
     */
    Graph bfsTree(String vertex);    
    
    
    /**
     * Performs a Depth First Search traversal starting at a given vertex.
     * Constructs and returns a DFS spanning tree of the connected component 
     * containing the vertex. Adjacent vertices are visited in the
     * lexicographical order of their labels.
     * @param vertex the vertex at which the DFS traversal is started
     * @return a DFS spanning tree of the connected component containing 
     * the given vertex.
     */
    Graph dfsTree(String vertex); 
    
    
    /**
     * Performs a Breadth First Search traversal starting at a given vertex.
     * The label of each vertex visited is added to an array of Strings in the
     * order visited.
     * @param vertex the vertex at which the BFS traversal is started
     * @return an array of Strings containing the labels of the vertices visited
     * in the order that they were visited.
     */
    String[] bfsOrder(String vertex);
    
    
    /**
     * Performs a Depth First Search traversal starting at a given vertex.
     * The label of each vertex visited is added to an array of Strings in the
     * order visited.
     * @param vertex the vertex at which the DFS traversal is started
     * @return an array of Strings containing the labels of the vertices visited
     * in the order that they were visited.
     */
    String[] dfsOrder(String vertex);    
    
    /**
     * Returns the shortest path in this graph from vertex s to vertex t.
     * @param s the source vertex
     * @param t the destination vertex
     * @return a list of strings containing the labels of the vertices along
     * the shortest path from s to t, starting with s and ending with t.
     * @throws RuntimeException of either specified vertex does not exist
     */
    String[] shortestPath(String s, String t);
    
    /**
     * Perform BFS Single Source Shortest Path from specified vertex.
     * @param v Source for shortest paths
     * @return String array containing the "Previous" vertices for the shortest
     * path.
     * @see Graph.shortestPath(String s, String t)
     * @throws RuntimeException if the specified vertex does not exist
     */
    String[] bfsSSSP(String v);
}
