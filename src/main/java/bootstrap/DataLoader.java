package bootstrap;

import model.Password;
import model.SomeClass;

public class DataLoader {

    public void load() {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getINSTANCE_NUMBER());
        System.out.println(two.getINSTANCE_NUMBER());
        System.out.println(three.getINSTANCE_NUMBER());

        System.out.println(Math.PI);

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
    }
}
