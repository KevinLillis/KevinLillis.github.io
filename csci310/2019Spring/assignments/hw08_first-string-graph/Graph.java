
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
     * Resizes the array of labels and the adjacency matrix to a new capacity.
     * Make the capacity either larger or smaller, depending on the value 
     * of newCapacity.
     * @param newCapacity The new capacity. 
     * Can be either larger or smaller than current capacity.
     */
    void resize(int newCapacity);
    
    /**
     * Adds multiple new vertices.
     * @param newVertices  An array of vertex labels to be added to this graph.
     */
    void addVertices(String[] newVertices);
    
    /**
     * Add multiple edges. Takes an m x 2 array of vertex labels. Each pair
     * represents an edge to be added to the graph. All vertices are assumed
     * to already exist in the graph.
     * @param newEdges An m x 2 array of vertex labels.
     */
    void addEdges(String[][] newEdges);
            
}
