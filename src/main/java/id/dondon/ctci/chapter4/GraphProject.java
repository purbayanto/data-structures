package id.dondon.ctci.chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphProject {

  private List<Project> nodes = new ArrayList<Project>();
  private Map<String, Project> map = new HashMap<String, Project>();

  public Project getOrCreateNode(String name) {
    if (!map.containsKey(name)) {
      Project node = new Project(name);
      nodes.add(node);
      map.put(name, node);
    }

    return map.get(name);
  }

  public void addEdge(String startName, String endName) {
    Project start = getOrCreateNode(startName);
    Project end = getOrCreateNode(endName);
    start.addNeighbor(end);
  }

  public List<Project> getNodes() {
    return nodes;
  }

}
