public interface MoveAble {
    public abstract void move();
public  interface washAble{
    public void wash();
}
}
class Dogs implements MoveAble, MoveAble.washAble {
    @Override
    public void move(){
        System.out.println("Dogs can jump around and can move");
    }
    @Override
    public void wash(){
        System.out.println("dogs can safely wash");
    }
}
class Car implements MoveAble {
    @Override
    public void move(){
        System.out.println("car can move forward and backward");
    }
}