package Naming_Conventions_and_Packages_static_and_final_keywords.L_10;

import Naming_Conventions_and_Packages_static_and_final_keywords.L_9.Password;

public class ExtendedPassword extends Password {
    private  int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }


}
