package com.napier.sem;

//import from mongoDB
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        //connect to mongoDB on local system - using port 27000 for now
        MongoClient mongoClient = new MongoClient("mongo-dbserver");
        //get a db - will create when using
        MongoDatabase database = mongoClient.getDatabase("mydb");
        //now get collection from db
        MongoCollection<Document> collection = database.getCollection("test");
        //Create new doc to store ??
        Document doc = new Document("name", "Ryan McLoughlin")
                .append("class", "Software Engineering Methods")
                .append("Year","2018/19")
                .append("result,", new Document("CW",95).append("EX", 85));
        //add doc to collection
        collection.insertOne(doc);

        //check doc in collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}
