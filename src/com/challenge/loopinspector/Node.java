package com.challenge.loopinspector;

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }


    public static Node createChain(int danglingPieceSize, int loopSize) {
        Node head = new Node(0); // Start with a dummy node
        Node current = head;

        // Create the dangling piece
        for (int i = 1; i <= danglingPieceSize; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        // Create the loop
        Node loopStartNode = new Node(danglingPieceSize + 1); // First node of the loop
        current.next = loopStartNode; // Link the last node of the dangling piece to the loop

        // Create the rest of the loop
        for (int i = 0; i < loopSize; i++) {
            current = current.next; // Move to the last node in the loop
            current.next = new Node(danglingPieceSize + 1 + i);
        }

        // Complete the loop by linking the last loop node to the loop start node
        current.next = loopStartNode;

        return head.next; // Return the head of the created list (skipping dummy node)
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

    public Node getNext() {
        return next;
    }
}
