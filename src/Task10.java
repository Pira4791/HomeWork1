public class Task10 {
    public static void main(String[] args) {
        final int height = 187;
        final int weight = 92;
        if (weight + 110 > height) {
            System.out.println("Вам необходимо сбросить " + ((weight + 110) - height) + " кг");
        } else if (weight + 110 < height) {
            System.out.println("Вам необходимо набрать " + (height - (110 + weight)) + " кг");
        } else {
            System.out.println("Ваш вес идеален");
        }
    }
}

