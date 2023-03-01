package pl.tomaszbuga.ui.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UserUtils {
    public static String username = System.getenv("email");
    public static String pass = System.getenv("password");
}