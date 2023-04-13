package com.example.getinfo;
import com.example.api.EclairHttpClient;
        import picocli.CommandLine.Command;
        import picocli.CommandLine.Option;

import javax.inject.Inject;

@Command(name = "getinfo", description = "To get all info about your lightening node.",
        mixinStandardHelpOptions = true)
final public class GetinfoCommand implements Runnable {

    @Option(names = {"--verbose"}, description = "Print verbose output.")
    boolean verbose;

    @Inject
    EclairHttpClient client;

    @Override
    public void run() {
        var response = client.getinfo();

        System.out.println(response);


        if (verbose) {
            System.out.printf(
                    "\nItems: %d\n",
                    response
            );
        }
    }
}