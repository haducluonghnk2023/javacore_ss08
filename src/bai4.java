public class bai4 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);

        // StringBuilder operations
        StringBuilder stringBuilder = new StringBuilder(initialString);
        long startTime = System.nanoTime();
        stringBuilder.reverse();
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Reverse Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stringBuilder.insert(500000, "insert_string");
        endTime = System.nanoTime();
        System.out.println("StringBuilder Insert Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stringBuilder.delete(250000, 350000);
        endTime = System.nanoTime();
        System.out.println("StringBuilder Delete Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stringBuilder.replace(100000, 200000, "replace_string");
        endTime = System.nanoTime();
        System.out.println("StringBuilder Replace Time: " + (endTime - startTime) + " ns");

        // StringBuffer operations
        StringBuffer stringBuffer = new StringBuffer(initialString);
        startTime = System.nanoTime();
        stringBuffer.reverse();
        endTime = System.nanoTime();
        System.out.println("StringBuffer Reverse Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stringBuffer.insert(500000, "insert_string");
        endTime = System.nanoTime();
        System.out.println("StringBuffer Insert Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stringBuffer.delete(250000, 350000);
        endTime = System.nanoTime();
        System.out.println("StringBuffer Delete Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stringBuffer.replace(100000, 200000, "replace_string");
        endTime = System.nanoTime();
        System.out.println("StringBuffer Replace Time: " + (endTime - startTime) + " ns");
        /*
        * StringBuilder có hiệu suất tốt hơn StringBuffer trong môi trường đơn luồng vì nó không có overhead của việc đồng bộ hóa
        * StringBuffer an toàn hơn trong môi trường đa luồng vì được đồng bộ hóa
        * Khi thao tác với chuỗi ngắn, sự khác biệt về hiệu suất có thể không đáng kể.
        * Khi thao tác với chuỗi dài hoặc thực hiện nhiều thao tác, StringBuilder thường nhanh hơn.
        * */
    }
}
