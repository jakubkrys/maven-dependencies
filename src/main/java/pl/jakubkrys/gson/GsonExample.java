package pl.jakubkrys.gson;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Person p1 = new Person("Jurek", 22);
        Person p2 = new Person("Adam", 25);
        Person p3 = new Person("Czarek", 31);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        String json = gson.toJson(p1);
        String json2 = gson.toJson(p2);
        String json3 = gson.toJson(p3);

        System.out.println(json);
        System.out.println(json2);
        System.out.println(json3);

        Person[] persons = {p1, p2, p3};
        System.out.println(gson.toJson(persons));

    }
}
