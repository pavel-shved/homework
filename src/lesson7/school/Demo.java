package lesson7.school;

public class Demo {
    public static void main(String[] args) throws Exception, ArithmeticException {
        ConstrExc s = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {

                                } catch (Exception e) {

                                }
                            } catch (Exception e) {

                            }
                        } catch (Exception e) {

                        }
                    } catch (Exception e) {

                    }
                } catch (Exception e) {

                }
            } catch (Exception e) {

            }

            method();
            s = new ConstrExc(1);
        } catch (ArithmeticException | NullPointerException| NoSuchEntityException e) {
            System.out.println("Error m***f");
        } catch (Throwable e ) {

        }
        finally {
            System.out.println("will be invoked stopudovo");
        }

        s.getA();
    }
    public static void method() {
        try {
            System.out.println(100/0);
        } catch (NoSuchEntityException e) {
            System.out.println("Obrabotka");
        }
    }
}
class ConstrExc {
    private int a;
    ConstrExc(int someInt) {
        a = 100 / someInt;
    }
    public int getA() {
        return a;
    }
}

