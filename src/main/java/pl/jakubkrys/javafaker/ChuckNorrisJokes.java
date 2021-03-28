package pl.jakubkrys.javafaker;

import io.chucknorris.client.ChuckNorrisClient;
import io.chucknorris.client.Joke;

public class ChuckNorrisJokes {
    public static void main(String[] args) {

        ChuckNorrisClient client = new ChuckNorrisClient();

// get a random joke and print it
        Joke joke = client.getRandomJoke("dev");
        System.out.println(joke.getValue());

    }
}
