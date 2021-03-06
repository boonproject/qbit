package io.advantageous.qbit.service;

import io.advantageous.qbit.message.Event;
import io.advantageous.qbit.queue.ReceiveQueue;
import io.advantageous.qbit.queue.SendQueue;
import io.advantageous.qbit.message.MethodCall;
import io.advantageous.qbit.message.Response;

import java.util.Collection;

/**
 * Created by Richard on 7/21/14.
 * @author rhightower
 */
public interface Service {

    /**
     * Queue so we can enqueue method calls onto a service.
     * A service send queue is not thread safe. Every thread that uses this service, needs its own SendQueue
     * this allows us to batch calls.
     *
     * @return send queue
     */
    SendQueue<MethodCall<Object>> requests();

    /**
     * Queue so we can receive method calls from a service
     * @return receive queue
     */
    ReceiveQueue<Response<Object>> responses();

    /**
     * Allow the sending of async or periodic events.
     * @return event queue
     */
    ReceiveQueue<Event> events();

    /**
     * Name of the service
     * @return name
     */
    String name();


    /**
     * Stop the service.
     */
    void stop();

    /**
     * Return a list of addresses.
     * @param address address
     * @return addresses
     */
    Collection<String> addresses(String address);
}
