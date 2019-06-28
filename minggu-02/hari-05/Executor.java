import java.util.Concurrent;

public interface Executor {
    void execute(Runnable command);
}