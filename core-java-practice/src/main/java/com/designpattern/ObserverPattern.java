package com.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * eg like Youtube channel you subscriber and when we nre video get uploaded we will be notify
 */

class Channel {
    List<Subscriber> subscriberList = new ArrayList<>();
    private String title;

    public void subscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void unSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void notifySubscriber() {
        for(Subscriber s: subscriberList){
            s.update();
        }
    }

    public void upload(String title) {
       this.title=title;
        notifySubscriber();
    }

    public String getTitle() {
        return title;
    }
}

class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hi "+name+" Video uploaded...! "+channel.getTitle());
    }

    public void subscribeChannel(Channel ch) {
        channel = ch;
    }

}

public class ObserverPattern {
    public static void main(String args[]) {

        Channel netflix= new Channel();

        Subscriber s1= new Subscriber("user-1");
        Subscriber s2= new Subscriber("user-2");
        Subscriber s3= new Subscriber("user-3");

        netflix.subscriber(s1);
        netflix.subscriber(s2);
        netflix.subscriber(s3);

        s1.subscribeChannel(netflix);
        s2.subscribeChannel(netflix);
        s3.subscribeChannel(netflix);

        netflix.upload("Movie X");

    }
}
