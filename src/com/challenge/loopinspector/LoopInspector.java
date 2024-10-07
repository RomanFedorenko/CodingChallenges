package com.challenge.loopinspector;

/**
 * You are given a node that is the beginning of a linked list. This list contains a dangling piece and a loop. Your objective is to determine the length of the loop.
 * For example in the following picture the size of the dangling piece is 3 and the loop size is 12:
 * 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10
 *             ↑                       ↓
 *              ←15  ← 14  ← 13 ← 12 ← 11
 *Notes:
 * do NOT mutate the nodes!
 * in some cases there may be only a loop, with no dangling piece
 * */

import java.util.HashSet;

public class LoopInspector {
    public int loopSize(Node node) {
        HashSet<Integer> hashes = new HashSet<>();
        Node loopNode = findLoopNode(hashes, node);
        int danglingPieceSize = countDanglingPieceSize(loopNode, node);
        return hashes.size() - danglingPieceSize;
    }

    public Node findLoopNode(HashSet<Integer> hashes, Node node) {
        while (node != null) {
            if (hashes.contains(node.hashCode())) return node;
            hashes.add(node.hashCode());
            node = node.getNext();
        }
        return null;
    }

    public int countDanglingPieceSize(Node targetNode, Node currentNode) {
        int counter = 0;
        while (currentNode != null) {
            if (currentNode == targetNode) return counter;
            counter++;
            currentNode = currentNode.getNext();
        }
        return counter;
    }
}
