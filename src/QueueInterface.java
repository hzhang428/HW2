/**
 * Interface detailing the methods required for implementing a Queue. You will
 * be implementing a queue using both a LinkedList and an Array.
 * DO NOT EDIT THIS FILE!
 *
 * @author CS 1332 TAs
 * @version 1.1
 */
public interface QueueInterface<T> {
    // DO NOT ALTER OR ADD ANY INSTANCE OR CLASS VARIABLES!
    int INITIAL_CAPACITY = 10;

    /**
     * Enqueues a node with the given data to the back of your queue.
     *
     * For the array-backed implementations, if the array is completely filled
     * when trying to enqueue, double the size of the array first and then
     * enqueue.  When enqueuing into the doubled array, you should enqueue as if
     * enqueuing into a new Queue ie. start from index 0 again.
     *
     * This method should be implemented in O(1) time for the linked list-backed
     * implementation and amortized O(1) time for the array-backed
     * implementation.
     *
     * @param data the data to add
     * @throws IllegalArgumentException if {@code data} is null
     */
    void enqueue(T data);

    /**
     * De-queues a node from the front of your queue.
     *
     * For array-backed implementations:
     * - you should not shrink the backing array.
     * - you must put {@code null} in the de-queued element's spot.
     *
     * Do NOT reset your {@code front} and {@code back} variables to their
     * initial values if the queue happens to become empty. In other words, for
     * the array-backed implementation, if I enqueue, dequeue, then enqueue,
     * then index 0 should be {@code null}, and index 1 should contain the
     * second enqueued item.
     *
     * This method should be implemented in O(1) time.
     *
     * @return the data from the front of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    T dequeue();

    /**
     * Returns the size of the queue as an integer.
     *
     * This method should be implemented in O(1) time.
     *
     * @return number of items in the queue
     */
    int size();

    /**
     * Returns true if the queue is empty, false otherwise.
     *
     * This method should be implemented in O(1) time.
     *
     * @return boolean representing whether the queue is empty
     */
    boolean isEmpty();
}
