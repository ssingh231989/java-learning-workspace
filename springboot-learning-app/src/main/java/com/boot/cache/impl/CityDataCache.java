package com.boot.cache.impl;

import com.boot.listener.ApplicationStartedObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CityDataCache implements ApplicationStartedObserver {

    private static Logger LOG= LoggerFactory.getLogger(CityDataCache.class);

    @Override
    public void applicationStarted() throws Exception {

        LOG.info("City Cache Started....!");


    }
}
