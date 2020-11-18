package com.example.test;
import org.ros.node.NodeMainExecutor;
public interface NodeMainExecutorListener {

    /**
     * @param nodeMainExecutor
     *          the newly created {@link NodeMainExecutor}
     */
    void onNewNodeMainExecutor(NodeMainExecutor nodeMainExecutor);
}


