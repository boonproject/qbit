package io.advantageous.qbit.mapping;

import io.advantageous.qbit.Input;
import io.advantageous.qbit.queue.ReceiveQueue;
import io.advantageous.qbit.Output;
import io.advantageous.qbit.queue.SendQueue;

/**
 * Interface used to set and send values into a mapping.
 * The sendQueue types are set, which is pure sendQueue and expects no return, and send.
 *
 * This interface is for send operations.
 * @author Richard Hightower
 *
 */
public interface InputOutputMap<K, V> extends Output, Input {



    SendQueue<Entry<K, V>> output();

    ReceiveQueue<Entry<K, V>> input();

}
