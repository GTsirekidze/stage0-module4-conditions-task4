package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int ans = third;
        ans = first > second && first>third ?
                first:
                third < second?
                        second:
                        third;
        System.out.println(ans);
    }
}
