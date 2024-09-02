package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {

	List<List<Integer>> adjList = new ArrayList<>();

	Graph(int val) {
		for (int i = 0; i < val; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	void addEdge(int val1, int val2) {
		adjList.get(val1).add(val2);
		adjList.get(val2).add(val1);
	}

	void display() {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.println("For vertice " + i + " the lists are");
			for (int j = 0; j < adjList.get(i).size(); j++) {
				System.out.println(adjList.get(i).get(j) + " ");
			}
		}
	}

	void bfs(int v) {
		int V = adjList.size();
		boolean visited[] = new boolean[V];

		visited[v] = true;

		Queue<Integer> queue = new LinkedList<>();

		queue.add(v);

		while (queue.size() != 0) {
			Integer dequeue = queue.remove();

			System.out.print(dequeue + " ");

			for (int i = 0; i < adjList.get(dequeue).size(); i++) {
				Integer av = adjList.get(dequeue).get(i);

				if (!visited[av]) {
					queue.add(av);
					visited[av] = true;
				}
			}
		}

	}

	void dfs(int v) {
		int V = adjList.size();
		boolean visited[] = new boolean[V];
		dfs2(v, visited);
	}

	void dfs2(int v, boolean[] visited) {
		visited[v] = true;

		System.out.print(v + " ");

		for (int i = 0; i < adjList.get(v).size(); i++) {

			Integer av = adjList.get(v).get(i);
			if (!visited[av]) {
				dfs2(av, visited);
			}
		}
	}
}

class Practice {
	public static void main(String[] args) {
		Graph graph = new Graph(5);

		graph.addEdge(0, 1);
		graph.addEdge(2, 3);
		graph.addEdge(1, 2);
		graph.addEdge(3, 4);
		graph.addEdge(0, 4);
		graph.addEdge(1, 4);
		graph.dfs(0);
	}

}
