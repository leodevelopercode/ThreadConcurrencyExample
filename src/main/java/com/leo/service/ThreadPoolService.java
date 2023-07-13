package com.leo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

/**
 * @author leo
 * @version 1.0
 */
@Service
public class ThreadPoolService {

    private final ExecutorService executorService;

    List<Runnable> runnableList = new ArrayList<>();

    public ThreadPoolService(ExecutorService executorService) {
        this.executorService = executorService;
    }


    public void startFetching() {

        runnableList.forEach(new Consumer<Runnable>() {
            @Override
            public void accept(Runnable runnable) {
                executorService.execute(runnable);
            }
        });


    }


}
