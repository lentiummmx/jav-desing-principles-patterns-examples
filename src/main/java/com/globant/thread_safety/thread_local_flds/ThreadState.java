package com.globant.thread_safety.thread_local_flds;

/**
 * Similarly, we can create thread-local fields by assigning ThreadLocal instances to a field.
 *
 * Let's consider, for example, the ~following~ StateHolder class
 *
 * We can easily make it a thread-local variable as follows:
 */
public class ThreadState {

    public static final ThreadLocal<StateHolder> statePerThread = new ThreadLocal<StateHolder>() {
        @Override
        protected StateHolder initialValue() {
            return new StateHolder("active");
        }
    };

    public static StateHolder getState() {
        return statePerThread.get();
    }

}
/**
 * Thread-local fields are pretty much like normal class fields, except that each thread that accesses
 * them via a setter/getter gets an independently initialized copy of the field so that each thread
 * has its own state.
 */
