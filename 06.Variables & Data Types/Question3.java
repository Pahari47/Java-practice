public class Question3 {
    public static void main(String[] args) {
        float pencil = 5.5f;
        float eraser = 2.5f;
        float pen = 10.0f;

        float originalCost = pencil + eraser + pen;
        float gstcost = originalCost * 0.18f; // 18% GST
        float totalCost = originalCost + gstcost;
        System.out.printf("%.2f", totalCost);
    }
}
