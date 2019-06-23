package choice.day08;

/**
 * 1.子类继承父类，在调用方法中使用的是谁的对象调用的就是谁的方法，本题中全程只有new一个对象，那就是B的对象，
 * 所以一直使用的是B的对象，那么调用的方法优先去B类中查找，如果B类中没有就去他的父类A中查找
 * 2.try;catch;finally中如果try中返回了某一个值，finally中也返回一个值那么finally中的返回值会覆盖try中的返回值，如果fianlil中没有返回值就直接返回try中的返回值；
 * 这个原因是因为try中执行return语句是不会真的返回，而是将返回值先保存在临时栈中，去执行finally语句，如果finally语句中也有return则和try中一样保存到临时栈中，
 * 最后从栈顶返回一个元素，所以返回的就是finally中的return;反之如果finally中没有return则返回栈顶元素返回的就是try中的return
 */
public class test1 {
    public static void main(String [] args){
        System.out.println(new B().getValue());
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }
}
