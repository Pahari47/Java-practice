import java.util.*;

class job {
    char id;
    int deadline;
    int profit;

    job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class jobSequencing {
    static void jobScheduling(ArrayList<job> arr) {
        int n = arr.size();

        Collections.sort(arr, new Comparator<job>() {
            public int compare(job a, job b) {
                return a.deadline - b.deadline;
            }
        });

        ArrayList<job> result = new ArrayList<>();

        PriorityQueue<job> maxHeap = new PriorityQueue<>(new Comparator<job>() {
            public int compare(job a, job b) {
                return b.profit - a.profit;
            }
        });

        for(int i=n-1; i>-1; i--) {
            int slotAvailable;

            if (i == 0) {
                slotAvailable = arr.get(i).deadline;
            } else {
                slotAvailable = arr.get(i).deadline - arr.get(i-1).deadline;
            }

            maxHeap.add(arr.get(i));

            while (slotAvailable > 0 && maxHeap.size() > 0) {
                job job = maxHeap.remove();
                slotAvailable--;
                result.add(job);
            }
        }

        Collections.sort(result, new Comparator<job>() {
            public int compare(job a, job b) {
                return a.deadline - a.deadline;
            }
        });

        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i).id + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<job> arr = new ArrayList<job>();       // Build sample list
        arr.add(new job('a', 2, 100));
        arr.add(new job('b', 1, 19));
        arr.add(new job('c', 2, 27));
        arr.add(new job('d', 1, 25));
        arr.add(new job('e', 3, 15));

        System.out.println("Following is maximum profit sequence of jobs");
        jobScheduling(arr);
    }
}
