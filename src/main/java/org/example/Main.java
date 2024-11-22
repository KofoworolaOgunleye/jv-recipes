package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        //Retrieves a SessionFactory object from your Database class
        SessionFactory session = Database.getSessionFactory();

        //export the schema, i.e. to automatically create any necessary tables in your in-memory database.
        session.getSchemaManager().exportMappedObjects(true);
    }
}