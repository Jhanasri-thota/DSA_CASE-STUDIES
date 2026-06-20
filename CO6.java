import java.util.*;

public class CO6 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited = new boolean[5];

    static String[] cities = {
        "Hyderabad",
        "Warangal",
        "Vizag",
        "Araku",
        "Vijayawada"
    };

    static void dfs(int city) {
        visited[city] = true;
        System.out.print(cities[city] + " ");

        for (int neighbor : graph.get(city)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(2);
        graph.get(3).add(4);

        graph.get(4).add(2);
        graph.get(4).add(3);

        System.out.println("===== TOURPLAN SMART TOURISM SYSTEM =====");

        System.out.println("\nAvailable Tourist Destinations:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i]);
        }

        System.out.println("\nRecommended Tourist Route (DFS Traversal):");
        dfs(0);

        System.out.println("\n\nTravel Cost : Rs.4500");
        System.out.println("Travel Duration : 7 Hours");

        System.out.println("\nBest Hotels:");
        System.out.println("1. Hotel Green Valley");
        System.out.println("2. Tourist Residency");

        System.out.println("\nOptimized Itinerary Generated Successfully");
        System.out.println("CO6 Execution Completed Successfully");
    }
}