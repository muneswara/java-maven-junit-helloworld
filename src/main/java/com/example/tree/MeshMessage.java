package com.example.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MeshMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static class Node{
		Node child;
		String name;
		List<String> currentPath;
		
		Node(String name){
			child = null;
			this.name = name;
			currentPath = new ArrayList<String>();
		}
		
		private static boolean addNode(Node parent, Node child){
			if(parent.currentPath.contains(child.name)) {
				return false;
			}
			parent.child = child;
			child.currentPath.addAll(parent.currentPath);
			child.currentPath.add(parent.name);
			return true;
		}
	}
	
	public static String[] getPath(Map<String, String[]> graph, String startNode, String endNode) {

	        // find the shortest route in the network between the two users
	        List<List<String>> listOfPaths = new ArrayList<List<String>>();
	        	        
	        String[] startPathNode = graph.get(startNode);
	        
	        Node root = new Node(startNode);
	        
	        for(int i=0; i<startPathNode.length; i++){
	            //List<String> possiblePath = new ArrayList<String>();
	            
	            if(startPathNode[i].equals(startNode)){
	                return new String[]{startNode};
	            }
	            
	            if(startPathNode[i].equals(endNode)){
	                return new String[]{startNode, endNode};
	            }
	            
	            Node child = new Node(startPathNode[i]);
	            Node.addNode(root, child);
	            buildChilds(child, graph, endNode, listOfPaths);
	        }

	        List<String> minList = listOfPaths.get(0);
	        for (List<String> list : listOfPaths) {
				if(minList.size()>list.size()) {
					minList = list;
				}
			}
	        return minList.toArray(new String[minList.size()]);
	    }

	private static void buildChilds(Node node, Map<String, String[]> graph, String endNode, List<List<String>> listOfPaths) {
		
		String[] startPathNode = graph.get(node.name);
		
		for(int i=0; i<startPathNode.length; i++){
			
			Node child = new Node(startPathNode[i]);
			if(!Node.addNode(node, child)) {
				continue;
			}
			if(startPathNode[i].equals(endNode)){
				child.currentPath.add(endNode);
				List<String> possiblePath = new ArrayList<String>();
				possiblePath.add(endNode);
				possiblePath.addAll(child.currentPath);
				listOfPaths.add(possiblePath);
            }
			buildChilds(child, graph, endNode, listOfPaths);
		}
		
	}

}
