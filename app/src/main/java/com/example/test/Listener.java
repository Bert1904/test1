package com.example.test;
import java.lang.String;
import java.net.URI;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

// RosJava Imports
import org.ros.android.RosActivity;
import org.ros.node.ConnectedNode;
import org.ros.node.NodeMainExecutor;
import org.ros.node.NodeConfiguration;
import org.ros.address.InetAddressFactory;
//RosJava Messages
// Android Core Imports
import org.ros.android.MessageCallable;
import org.ros.android.view.RosTextView;

import std_msgs.*;
public class Listener  extends RosActivity {
    private Toast    lastToast;
    private ConnectedNode node;
    private RosTextView<std_msgs.String> rosTextView;

    protected Listener(String notificationTicker, String notificationTitle) {
        super(notificationTicker, notificationTitle);
    }
    public Listener(){
        super("Listener","Listener");
    }
    @Override
    protected void init(NodeMainExecutor nodeMainExecutor) {

    }


}
