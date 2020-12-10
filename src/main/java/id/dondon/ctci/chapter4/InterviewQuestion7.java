package id.dondon.ctci.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Build Order
 * You are given a list of projects and a list of dependencies (which is a list of pairs of projects,
 * where the second project is dependent on the first project).
 * All of a project's dependencies must be built before the project is.
 * Find a build order that will allow the projects to be built.
 * If there is no valid build order, return an error.
 *
 * EXAMPLE
 * Input:
 *     projects: a, b, c, d, e, f
 *     dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
 * Output: f, e, a, b, d, c
 * */
public class InterviewQuestion7 {

  public static String[] buildOrderWrapper(String[] projects, String[][] dependencies) {
    Stack<Project> buildOrder = findBuildOrder(projects, dependencies);
    if (buildOrder == null) return null;

    return convertToStringList(buildOrder);
  }

  private static Stack<Project> findBuildOrder(String[] projects, String[][] dependencies) {
    GraphProject GraphProject = buildGraphProject(projects, dependencies);
    return orderProjects(GraphProject.getNodes());
  }

  /* Build the GraphProject, adding the edge (a, b) if b is dependent on a.
   * Assumes a pair is listed in “build order” (which is the reverse
   * of dependency order). The pair (a, b) in dependencies indicates
   * that b depends on a and a must be built before a. */
  private static GraphProject buildGraphProject(String[] projects, String[][] dependencies) {
    GraphProject GraphProject = new GraphProject();

    for (String[] dependency : dependencies) {
      String first = dependency[0];
      String second = dependency[1];
      GraphProject.addEdge(first, second);
    }

    return GraphProject;
  }

  private static Stack<Project> orderProjects(List<Project> projects) {
    Stack<Project> stack = new Stack<Project>();
    for (Project project : projects) {
      if (project.getState() == Project.State.BLANK) {
        if (!doDFS(project, stack)) {
          return null;
        }
      }
    }
    return stack;
  }

  private static boolean doDFS(Project project, Stack<Project> stack) {
    if (project.getState() == Project.State.PARTIAL) {
      return false; // Cycle
    }

    if (project.getState() == Project.State.BLANK) {
      project.setState(Project.State.PARTIAL);
      ArrayList<Project> children = project.getChildren();
      for (Project child : children) {
        if (!doDFS(child, stack)) {
          return false;
        }
      }
      project.setState(Project.State.COMPLETE);
      stack.push(project);
    }
    return true;
  }

  private static String[] convertToStringList(Stack<Project> projects) {
    String[] buildOrder = new String[projects.size()];
    for (int i = 0; i < buildOrder.length; i++) {
      buildOrder[i] = projects.pop().getName();
    }
    return buildOrder;
  }

}
