package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(firstQueue.remove());
        deque.add(firstQueue.remove());
        deque.add(secondQueue.remove());
        deque.add(secondQueue.remove());
        while (firstQueue.iterator().hasNext()
                || secondQueue.iterator().hasNext()) {
            moveCards(firstQueue, deque);
            moveCards(secondQueue, deque);
        }

        return deque;
    }

    private void moveCards(Queue<Integer> queue, ArrayDeque<Integer> deque) {
        queue.offer(deque.removeLast());
        deque.offer((queue.remove()));
        deque.offer((queue.remove()));
    }
}
