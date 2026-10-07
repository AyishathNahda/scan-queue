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
        if(command.equals("add")){
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Duration: ");
            int duration = sc.nextInt();
            System.out.print("Pause: ");
            boolean pause = sc.nextBoolean();
            addScan(new Scan(scanQueue.size()+1, name, duration, pause, Scan.State.IDLE));
        }else if(command.equals("remove")){
            System.out.print(removeScan(null);)
        }else if(command.equals("print")){
            System.out.print(printScanQueue();)
        }else if(command.equals("exit")){
            System.exit(0);
        }else if(command.equals("clear")){
            scanQueue.clear();
            System.out.println("Scan queue cleared.");
        }else if(command.equals("help")){
            System.out.println("Commands: add, remove, print, exit, clear, help");
        }else{
            System.out.println("Unknown command. Type 'help' for a list of commands.");
        }
    }
}