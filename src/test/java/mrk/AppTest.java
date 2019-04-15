package mrk;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AppTest {
    @Test
    public void processWithFuture() {
        try {
            Process exec = Runtime.getRuntime().exec("ls -al");
            CompletableFuture<String> future = exec
                    .onExit()
                    .thenApply(e -> {
                        try {
                            return new String(e.getInputStream().readAllBytes());
                        } catch (IOException e1) {
                            e1.printStackTrace();
                            return "ERROR";
                        }
                    });
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
