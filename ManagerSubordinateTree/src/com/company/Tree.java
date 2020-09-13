package com.company;

import java.util.*;

public class Tree {
    Node root;

    public void add(String manager, String subordinate){


        Node childNode = new Node();
        childNode.name = subordinate;

        if(root == null){
            Node node = new Node();
            node.name = manager;
            if(node.child == null)
                node.child = new LinkedList<>();
            node.child.add(childNode);
            root = node;
        }
        else{
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()){
                Node focusNode = stack.pop();
                if(focusNode.name == manager){
                    if(focusNode.child == null)
                        focusNode.child = new LinkedList<>();
                    focusNode.child.add(childNode);
                    // break;
                    return;
                }

                if(focusNode.child != null){
                    for(Node childNodes : focusNode.child){
                        stack.push(childNodes);
                    }
                }

            }

        }
    }

    public void display(){
        Node focusNode = root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(focusNode);

        while (!queue.isEmpty()){
            Node node = queue.peek();
            System.out.print(node.name + " > ");
            queue.remove();

            if(node.child != null){
                for(Node childNode : node.child){
                    if(childNode.child != null) {
                        queue.add(childNode);
                    }

                    System.out.print(childNode.name + ", ");

                }
            }
            System.out.println();
        }
    }


    class Node {
        String name;
        List<Node> child;
    }
}
