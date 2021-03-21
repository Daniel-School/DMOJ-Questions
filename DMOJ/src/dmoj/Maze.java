package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;
/*
class Edge
{
	int source, dest;

	public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
}

class Graph
{
	// A list of lists to represent an adjacency list
	List<List<Integer>> adjList = null;

	// Constructor
	Graph(List<Edge> edges, int N) {
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
 */

class Graph
{
	private int V;   // No. of vertices
	private LinkedList<Integer> adj[]; //Adjacency Lists

	// Constructor
	Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}

	// prints BFS traversal from a given source s
	void BFS(int s, int destination)
	{
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[V];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);

		int answer = 0;
		while (queue.size() != 0)
		{
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+" ");
			answer++;
			if (s == destination)
			{
				System.out.println(answer);
				break;
			}

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}


		} 
		
		
		if (s != destination) 
		{
			System.out.println("no");
		}
	}
}
public class Maze {
	/*
	public static void recursiveBFS(Graph graph, Queue<Integer> q,
			boolean[] discovered)
	{
		if (q.isEmpty())
			return;


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

	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int r;
		int c;
		
		String input;
		
		for (int i = 0; i < t; i++) 
		{
			r = Integer.parseInt(br.readLine());
			c = Integer.parseInt(br.readLine());
			Graph g = new Graph(r*c+1);
			
			char[][] grid = new char[r][c];
			for (int i2 = 0; i2 < r; i2++) 
			{
				input = br.readLine();
				for (int i3 = 0; i3 < c; i3++) 
				{
					grid[i2][i3] = input.charAt(i3);
					if (grid[i2][i3] == '+')
					{
						if (i3 - 1 >= 0)
							g.addEdge(i3, i3 - 1);
						if (i3 + 1 <= c)
							g.addEdge(i3, i3 + 1);
						if (i2 - 1 >= 0)
							g.addEdge(i3, i2 - 1);
						if (i2 + 1 <= r) 
							g.addEdge(i3, i2 + 1);
					}
					
					if (grid[i2][i3] == '|') 
					{
						if (i2 - 1 >= 0)
							g.addEdge(i3, i2 - 1);
						if (i2 + 1 <= r)
							g.addEdge(i3, i2 + 1);
					}
					
					if (grid[i2][i3] == '-') 
					{
						if (i3 + 1 <= c)
							g.addEdge(i3, i3 + 1);
						if (i3 - 1 >= 0)
							g.addEdge(i3, i3-1);
					}
					
				}
				g.BFS(1, r*c);
			}



			for (int i2 = 0; i2 < r; i2++) 
			{
				for (int i3= 0; i3 < c; i3++) 
				{
					//			List<Edge> edges = Arrays.asList();
				}
			}


			for (int i2 = 0; i2 < r; i2++) 
			{
				for (int i3 = 0; i3 < c; i3++) 
				{
					System.out.print(grid[i2][i3]);
				}
				System.out.println();
			}


		}

		//Graph g = new Graph(7);

		/* g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(2, 2);
        g.addEdge(3, 1);
        //g.addEdge(3, 3);
        //g.addEdge(3, 3);*/

		
        /*g.addEdge(1, 2); g.addEdge(1, 6); g.addEdge(2, 7);
        g.addEdge(3, 8); g.addEdge(5, 10); g.addEdge(6, 1);
        g.addEdge(6, 7); g.addEdge(7, 8); g.addEdge(7, 2);
        g.addEdge(7, 6); g.addEdge(8, 7); g.addEdge(8,13);
        g.addEdge(8,3); g.addEdge(8,9); g.addEdge(9,14);
        g.addEdge(10,5); g.addEdge(10,15);
        g.addEdge(13,14); g.addEdge(14,13); g.addEdge(14,15);
        g.addEdge(15,10); g.addEdge(15,14);
		*/
		/*
		g.addEdge(1, 4);
		g.addEdge(4, 1);
		g.addEdge(3, 6);
		g.addEdge(6, 3);
*/

		System.out.println("Following is Breadth First Traversal "+
				"(starting from vertex 2)");

		//g.BFS(1,6);
		/*
		List<Edge> edges = Arrays.asList(
				new Edge(1, 2), new Edge(1, 6), new Edge(2, 7),
	                new Edge(3, 8), new Edge(5, 10), new Edge(6, 1),
	                new Edge(6, 7), new Edge(7, 8), new Edge(7, 2),
	                new Edge(7, 6), new Edge(8, 7), new Edge(8,13),
	                new Edge(8,3), new Edge(8,9), new Edge(9,14),
	                new Edge(10,5), new Edge(10,15),
	                new Edge(13,14), new Edge(14,13), new Edge(14,15),
	                new Edge(15,10), new Edge(15,14)
				//new Edge(1,2), new Edge(2,4), new Edge(4,2)

				// vertex 0, 13, and 14 are single nodes
				);

		// total number of nodes in the graph
		final int N = 16;

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

		}

		int answer = 0;

		for (int i = 0; i < N; i++) 
		{
			if (discovered[i] == true)
				answer++;
		}

		System.out.println(answer);
		 */



	}

}
