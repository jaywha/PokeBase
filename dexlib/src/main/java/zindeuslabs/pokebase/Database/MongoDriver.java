package zindeuslabs.pokebase.Database;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoDriver {
    private MongoClient Client;

    public MongoDriver() {
        Client = new MongoClient(new MongoClientURI(""));
    }
}