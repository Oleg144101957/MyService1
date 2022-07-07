package com.vishnevskiypro.myservice1

class Printer(val name: String) : Runnable {
    /**
     * When an object implementing interface `Runnable` is used
     * to create a thread, starting the thread causes the object's
     * `run` method to be called in that separately executing
     * thread.
     *
     *
     * The general contract of the method `run` is that it may
     * take any action whatsoever.
     *
     * @see java.lang.Thread.run
     */
    override fun run() {

        for (i in 0..10){
            println("I'm printer $name count is: $i")
            Thread.sleep(500)

        }


    }
}