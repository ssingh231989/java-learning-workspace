package com.boot.listener;

import com.boot.exception.ApplicationStartupException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;


public class ApplicationContextStartedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    private static Logger LOG = LoggerFactory.getLogger(ApplicationContextStartedEventListener.class);

    private List<ApplicationStartedObserver> observers;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (observers != null) {
            LOG.info("Updating observers for Application started event");

            for (ApplicationStartedObserver observer : observers) {
                try {
                    observer.applicationStarted();
                } catch (Exception e) {
                    LOG.error("Exception occurred while starting application", e);
                    throw new ApplicationStartupException("Exception occurred while starting application", e);
                }
            }
            LOG.info("Updated all observers.");
        }
    }

    public List<ApplicationStartedObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<ApplicationStartedObserver> observers) {
        this.observers = observers;
    }
}
