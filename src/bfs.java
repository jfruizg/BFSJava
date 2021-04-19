import java.util.Iterator;
import java.util.LinkedList;

public class bfs {

    private int Vertice;
    private LinkedList<Integer> adj[];

    bfs(int elemento) {
        Vertice = elemento;
        adj = new LinkedList[elemento];
        for (int i = 0; i < elemento; i++) {
            adj[i] = new LinkedList();
        }
    }

    void agregar(int vertice, int elemento) {
        adj[vertice].add(elemento);
    }

    void BFS(int s) {
        boolean visitado[] = new boolean[Vertice];
        LinkedList<Integer> queue = new LinkedList();

        visitado[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                if (!visitado[n]) {
                    visitado[n] = true;
                    queue.add(n);
                }
            }

        }
    }
    public static void main(String args[]) {
        bfs g = new bfs(4);

        g.agregar(0, 1);
        g.agregar(0, 2);
        g.agregar(1, 2);
        g.agregar(2, 0);
        g.agregar(2, 3);
        g.agregar(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.BFS(2);
    }

}

