package Utilities;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class faker {

    public static String addfirstname() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String addLastName() {
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public static String addEmail() {
        Faker faker = new Faker();
        return faker.name().firstName().toLowerCase() + "@gmail.com"; //
    }

    public static String phonenum() {
        Faker faker = new Faker();
        String phonenumber=faker.number().digits(10);
        return phonenumber;
    }

    public static String Street1() {
        Faker faker = new Faker();
        return faker.address().streetAddress(); // ✅ corrected (used streetAddress instead of city)
    }

    public static String Street2() {
        Faker faker = new Faker();
        return faker.address().secondaryAddress(); // ✅ corrected (used secondaryAddress instead of city)
    }

    public static String postalcode() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }

    public static String country() {
        Faker faker = new Faker();
        return faker.address().country();
    }

    public static String city() {
        Faker faker = new Faker();
        return faker.address().city();
    }

    public static String generateBirthdate() {
        Faker faker = new Faker();
        // Generate a random birthday between 18 and 65 years old
        Date birthday = faker.date().birthday(18, 65);

        // Format the date as yyyy-MM-dd
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(birthday);
    }
}