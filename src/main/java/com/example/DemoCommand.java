package com.example;

import com.example.getinfo.GetinfoCommand;
import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "eclair-cli", description = "...",
        mixinStandardHelpOptions = true, subcommands={GetinfoCommand.class})
public class DemoCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DemoCommand.class, args);
    }

    public void run() {
        if (verbose) {
            System.out.println("Help");
        }
    }
}
