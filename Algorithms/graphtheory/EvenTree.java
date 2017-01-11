package graphtheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class EvenTree {
	static class Node {
		ArrayList<Node> children = new ArrayList();
		int id;

		public Node(int id) {
			this.id = id;
		}

		public int size() {
			int n = 1;
			for (Node c : children) {
				n += c.size();
			}
			return n;
		}
	}

	static class Tree extends HashMap<Integer, Node> {
		public Node getRoot() {
			return get(1);
		}

		public Node get(Integer id) {
			Node v = super.get(id);
			if (v == null) {
				v = new Node(id);
				put(id, v);
			}
			return v;
		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			Tree tr = new Tree();
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			for (int i = 0; i < m; i++) {
				tk = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(tk.nextToken());
				int v = Integer.parseInt(tk.nextToken());
				tr.get(v).children.add(tr.get(u));
			}
			System.out.println(evenSubTrees(tr.getRoot()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int evenSubTrees(Node root) {
		// TODO Auto-generated method stub
		int n = 0;
		for (Node c : root.children) {
			n += (c.size() % 2 == 0) ? 1 : 0;
			n += evenSubTrees(c);
		}
		return n;
	}
}
