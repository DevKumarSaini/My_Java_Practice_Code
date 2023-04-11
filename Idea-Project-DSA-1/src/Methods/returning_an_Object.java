package Methods;

public class returning_an_Object {
    int a;

    returning_an_Object(int a){
        this.a=a;
    }
    returning_an_Object incrByTem(){
        returning_an_Object test = new returning_an_Object(a+10);
        return test;
    }

    public static void main(String[] args) {
        returning_an_Object obj = new returning_an_Object(2);
        returning_an_Object obj2;

        obj2=obj.incrByTem();
        System.out.println("actual object "+obj.a);
        System.out.println("return object "+obj2.a);
    }
}

