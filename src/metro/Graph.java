package metro;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
public class Graph {
    private Map<Vertex, List<Vertex>> metro;

    public Graph(Map<Vertex, List<Vertex>> metro) {
        this.metro = metro;
    }

    public Map<Vertex, List<Vertex>> getMetro() {
        return metro;
    }

    public void setMetro(Map<Vertex, List<Vertex>> metro) {
        this.metro = metro;
    }

    void addVertex(String label)
    {
        metro.putIfAbsent(new Vertex(label),new ArrayList<Vertex>());
    }

    void addEdge(String label1,String label2)
    {
        Vertex v1=new Vertex(label1);
        Vertex v2=new Vertex(label2);
        metro.get(v1).add(v2);
        metro.get(v2).add(v1);
    }

    void removeEdge(String label1,String label2)
    {
        Vertex v1=new Vertex(label1);
        Vertex v2=new Vertex(label2);
        List<Vertex> ev1=metro.get(v1);
        List<Vertex> ev2=metro.get(v2);
        if(ev1!=null)
        {
            ev1.remove(v2);
        }
        if(ev2!=null)
        {
            ev2.remove(v1);
        }

    }



    List<Vertex> getStations(String label)
    {

        return metro.get(new Vertex(label));
    }


    Set<String> depthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getStations(vertex)) {
                    stack.push(v.name);
                }
            }
        }
        return visited;
    }


    Set<String> breadthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : graph.getStations(vertex)) {
                if (!visited.contains(v.name)) {
                    visited.add(v.name);
                    queue.add(v.name);
                }
            }
        }
        return visited;
    }

    Set<String> getPath(Graph graph,String in,String out)
    {
        //will be print list path from vertex to vertex
        return null;

    }
}
