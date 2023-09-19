public class MoveableTester {
    public static void main(String[] args) {
        MoveAble []arr={new Car(),new Dogs()};
        for(MoveAble a:arr) {
            a.move();
        }
    }
}
