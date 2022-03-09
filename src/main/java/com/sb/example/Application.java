package com.sb.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private static Logger LOG = LoggerFactory
            .getLogger(Application.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");//this will not run
        printMsg("messege1"); // this will not run
        SpringApplication.run(Application.class, args);
        printMsg("messege2");
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");

        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
        printMsg("messege3");
    }
    static void printMsg(String msg){
        LOG.info(msg);
    }

}
