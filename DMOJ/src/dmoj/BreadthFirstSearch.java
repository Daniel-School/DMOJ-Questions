package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;


public class BreadthFirstSearch {
/*
	private static HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

	private static class Node
	{
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int id) 
		{
			this.id = id;
		}
	}

	public static Node getNode(int id) 
	{
		return nodeLookup.get(id);
	}

	public void addEdge(int source, int destination) 
	{
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	}


	public static boolean hasPathBFS(int source, int destination) 
	{
		return hasPathBFS(getNode(source), getNode(destination));
	}

	private static boolean hasPathBFS(Node source, Node destination) 
	{
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(source);
		while (!nextToVisit.isEmpty()) 
		{
			Node node = nextToVisit.remove();
			if (node == destination) 
				return true;

			if (visited.contains(node.id)) 
				continue;

			visited.add(node.id);

			for (Node child : node.adjacent) 
				nextToVisit.add(child);
		}
		return false;
	}

	//*/ 


	class Edge
	{
		int source, dest;

		public Edge(int source, int dest)
		{
			this.source = source;
			this.dest = dest;
		}
	}

	// A class to represent a graph object
	class Graph
	{
		// A list of lists to represent an adjacency list
		List<List<Integer>> adjList = null;

		// Constructor
		Graph(List<Edge> edges, int N)
		{
			adjList = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				adjList.add(new ArrayList<>());
			}

			// add edges to the undirected graph
			for (Edge edge: edges)
			{
				int src = edge.source;
				int dest = edge.dest;

				adjList.get(src).add(dest);
				adjList.get(dest).add(src);
			}
		}
	}

	// Perform BFS recursively on the graph
	public static void recursiveBFS(Graph graph, Queue<Integer> q, boolean[] discovered)
	{
		if (q.isEmpty()) {
			return;
		}

		// dequeue front node and print it
		int v = q.poll();
		System.out.print(v + " ");

		// do for every edge `v —> u`
		for (int u: graph.adjList.get(v))
		{
			if (!discovered[u])
			{
				// mark it as discovered and enqueue it
				discovered[u] = true;
				q.add(u);
			}
		}

		recursiveBFS(graph, q, discovered);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//System.out.println(hasPathBFS(0,0));
		List<Edge> edges = Arrays.asList(
				new Edge(1, 2), new Edge(1, 3), new Edge(1, 4),
				new Edge(2, 5), new Edge(2, 6), new Edge(5, 9),
				new Edge(5, 10), new Edge(4, 7), new Edge(4, 8),
				new Edge(7, 11), new Edge(7, 12)
				// vertex 0, 13, and 14 are single nodes
		);

		// total number of nodes in the graph
		final int N = 15;

		// build a graph from the given edges
		Graph graph = new Graph(edges, N);

		// to keep track of whether a vertex is discovered or not
		boolean[] discovered = new boolean[N];

		// create a queue for doing BFS
		Queue<Integer> q = new ArrayDeque<>();

		// Perform BFS traversal from all undiscovered nodes to
		// cover all unconnected components of a graph
		for (int i = 0; i < N; i++)
		{
			if (discovered[i] == false)
			{
				// mark the source vertex as discovered
				discovered[i] = true;

				// enqueue source vertex
				q.add(i);

				// start BFS traversal from vertex `i`
				recursiveBFS(graph, q, discovered);
			}
		}*/
	}

}
