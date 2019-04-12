package com.zzy.concurrentdemo.visiability;




/**
 * @auther: zhangzhaoyuan
 * @date: 2019/04/02
 * @description:
 */
class ThisEscape {
    ThisEscape(EventSource source) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                doSomething();

            }
        });
        source.registerListener(
            new EventListener() {
                public void onEvent(Event e) {

                }
            }
        );
    }

    private void doSomething() {
    }


    private void doSomething(Event e) {
    }

//ThisEscape类构造完成，此时ThisEscape类的this引用才是稳定的
}


interface EventSource {

    void registerListener(EventListener e);
}

class Event {

}

interface EventListener {
    void onEvent(Event e);
}