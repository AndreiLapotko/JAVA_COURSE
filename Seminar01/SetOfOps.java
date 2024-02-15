package Seminar01;

public class SetOfOps {
    public static void main(String[] args) {
        int a = 1, b = 7, c = 1, d = 3;
        generate(a, b, c, d, "Ответ");
    }

    public static void generate (int source, int target, int c, int d, String path) {
        if (source > target) return;
        if (source == target) {
            System.out.println(path);
            return;
        }
        generate(source + c, target, c, d, path + " k1");
        generate(source * d, target, c, d, path + " k2");
    }
}
