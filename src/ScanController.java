import java.util.*;

class ScanController {
    private PriorityQueue<Scan> scanQueue;

    public ScanController() {
        this.scanQueue = new PriorityQueue<>();
    }

    public void addScan(Scan scan) {
        scanQueue.add(scan);
    }

    public void removeScan(Scan scan) {
        scanQueue.remove(scan);
    }

    public void printScanQueue() {
        System.out.println(scanQueue);
    }

    public void handleCommand(String command) {

    }
}