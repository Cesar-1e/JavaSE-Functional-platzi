package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtil {
    static void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("El manual solicitado");
            }
        };

        consumerHelper.accept(cliArguments);
    }

    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator = CLIArguments::new;
        return generator.get();
    }
}
