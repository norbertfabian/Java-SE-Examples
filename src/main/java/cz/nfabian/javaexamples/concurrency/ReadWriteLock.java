package cz.nfabian.javaexamples.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock writeLock = lock.writeLock();
    private final Lock readLock = lock.readLock();

    private List<String> listToModify = new ArrayList<>();

    public static void main(String[] args) {
        final ReadWriteLock main = new ReadWriteLock();

        main.writeExample();
        String s = main.readExample();
    }

    private void writeExample() {
        try {
            writeLock.lock();
            listToModify.add("Test"); // First part of the modification
            listToModify.remove("Test"); // Second part of the modification
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }

    private String readExample() {
        try {
            readLock.lock();
            return listToModify.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            readLock.unlock();
        }
    }
}
