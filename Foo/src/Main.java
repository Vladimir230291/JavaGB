public class Main {
    public static void main(String[] args) {
       Foo foo = new Foo() {
           @Override
           public void bar() {
               System.out.println("Foo.bar()");
           }
           @Override
           public void baz() {
               System.out.println("Foo.baz()");
           }
       };

       foo.bar();
       foo.baz();
    }
}